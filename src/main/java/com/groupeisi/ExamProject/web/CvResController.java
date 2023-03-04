package com.groupeisi.ExamProject.web;

import com.groupeisi.ExamProject.dto.Cv;
import com.groupeisi.ExamProject.service.CvService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
@AllArgsConstructor
public class CvResController {
    private CvService cvService;

    @GetMapping
    public List<Cv> getCv() {
        return cvService.getCv();
    }

    @GetMapping("/{id}")
    public Cv getCv(@PathVariable("id") int id) {
        return cvService.getCv(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cv createCv(@Valid @RequestBody Cv cv) {
        return cvService.createCv(cv);
    }

    @PutMapping("/{id}")
    public Cv updateCv(@PathVariable("id") int id, @Valid @RequestBody Cv cv) {
        return cvService.updateCv(id, cv);
    }

    @DeleteMapping("/{id}")
    public void deleteCv(@PathVariable("id") int id) {
        cvService.deleteCv(id);
    }
}


