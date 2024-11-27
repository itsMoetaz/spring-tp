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
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;
    @ManyToMany
    private Set<Projet> projets;
}
