package com.groupeisi.ExamProject.service;

import com.groupeisi.ExamProject.dto.Cv;
import com.groupeisi.ExamProject.exception.EntityNotFoundException;
import com.groupeisi.ExamProject.exception.RequestException;
import com.groupeisi.ExamProject.mapping.CvMapper;
import com.groupeisi.ExamProject.repositories.CvRepository;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CvService {
    private CvRepository cvRepository;
    private CvMapper cvMapper;
    MessageSource messageSource;

    public CvService(CvRepository cvRepository, CvMapper cvMapper, MessageSource messageSource) {
        this.cvRepository = cvRepository;
        this.cvMapper = cvMapper;
        this.messageSource = messageSource;
    }

    @Transactional(readOnly = true)
    public List<Cv> getCv() {
        return StreamSupport.stream(cvRepository.findAll().spliterator(), false)
                .map(cvMapper::toCv)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Cv getCv(int id) {
        return cvMapper.toCv(cvRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException(messageSource.getMessage("role.notfound", new Object[]{id},
                                Locale.getDefault()))));
    }

    @Transactional
    public Cv createCv(Cv cv) {
        return cvMapper.toCv(cvRepository.save(cvMapper.fromCv(cv)));
    }

    @Transactional
    public Cv updateCv(int id, Cv cv) {
        return cvRepository.findById(id)
                .map(entity -> {
                    cv.setId(id);
                    return cvMapper.toCv(
                            cvRepository.save(cvMapper.fromCv(cv)));
                }).orElseThrow(() -> new EntityNotFoundException(messageSource.getMessage("role.notfound", new Object[]{id},
                        Locale.getDefault())));
    }

    @Transactional
    public void deleteCv(int id) {
        try {
            cvRepository.deleteById(id);
        } catch (Exception e) {
            throw new RequestException(messageSource.getMessage("cv.errordeletion", new Object[]{id},
                    Locale.getDefault()),
                    HttpStatus.CONFLICT);
        }
    }
}
