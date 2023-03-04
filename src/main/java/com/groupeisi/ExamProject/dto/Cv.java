package com.groupeisi.ExamProject.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cv {
  private int id;
  @NotNull(message = "Le nom est obligatoire")
    private String nom;
  @NotNull(message = "Le prenom est obligatoire")
    private String prenom;
  @NotNull(message = "L'age est obligatoire")
    private int age;
    @NotNull(message = "L'email est obligatoire")
    private String email;
    @NotNull(message = "Le telephone est obligatoire")
    private int telephone;
    @NotNull(message = "La specialite est obligatoire")
    private String specialite;
    @NotNull(message = "Le niveau d'etude est obligatoire")
    private String niveauEtude;
    @NotNull(message = "L'experience professionnelle est obligatoire")
    private String experienceProfessionnelle;
  
}
