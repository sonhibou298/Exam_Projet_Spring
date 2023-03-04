package com.groupeisi.ExamProject.config;

import com.groupeisi.ExamProject.dto.Cv;
import com.groupeisi.ExamProject.entities.CvEntity;
import com.groupeisi.ExamProject.mapping.CvMapper;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration

public class ApplicationConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }


}
