package com.groupeisi.ExamProject.mapping;

import com.groupeisi.ExamProject.dto.Cv;
import com.groupeisi.ExamProject.entities.CvEntity;
import org.mapstruct.Mapper;


@Mapper
public interface CvMapper {
    Cv toCv(CvEntity cvEntity);
    CvEntity fromCv(Cv cv);
}
