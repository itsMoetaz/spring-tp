package tn.esprit.gestionprojet.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter //generer les getters
@Setter //generer les setters
@NoArgsConstructor
@ToString
public class Projet {
    @Id
    private Long id;
    private String sujet;
    @OneToOne
    private ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "projets")
    private Set<Equipe> equipes;
}
