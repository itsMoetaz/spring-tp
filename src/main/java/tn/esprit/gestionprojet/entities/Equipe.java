package tn.esprit.gestionprojet.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter //generer les getters
@Setter //generer les setters
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)//nhoto fetch ki tebda ana Many fele5er
    private Set<Projet> projets = new HashSet<Projet>();
}
