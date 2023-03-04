package com.groupeisi.ExamProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cv")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 15)
    private String nom;
    @Column(nullable = false, length = 25)
    private String prenom;
    @Column(nullable = false, length = 2)
    private int age;
    @Column(nullable = false, length = 25)
    private String email;
    @Column(nullable = false, length = 9)
    private int telephone;
    @Column(nullable = false, length = 55)
    private String specialite;
    @Column(nullable = false, length = 15)
    private String niveauEtude;
    @Column(nullable = false, length = 15)
    private String experienceProfessionnelle;

}
