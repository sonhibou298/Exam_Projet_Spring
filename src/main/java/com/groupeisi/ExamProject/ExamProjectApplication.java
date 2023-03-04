package com.groupeisi.ExamProject;

import com.groupeisi.ExamProject.dto.Cv;
import com.groupeisi.ExamProject.entities.CvEntity;
import com.groupeisi.ExamProject.mapping.CvMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.groupeisi.ExamProject.repositories"})
@ComponentScan("com.groupeisi.ExamProject.web")
@ComponentScan("com.groupeisi.ExamProject.service")
@ComponentScan("com.groupeisi.ExamProject.mapping")
public class ExamProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExamProjectApplication.class, args);
	}

}
