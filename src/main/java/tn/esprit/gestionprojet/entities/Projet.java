package tn.esprit.gestionprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter //generer les getters
@Setter //generer les setters
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sujet;
    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "projets" , fetch = FetchType.EAGER)
    @ToString.Exclude
    @JsonIgnore
    private Set<Equipe> equipes;
}
