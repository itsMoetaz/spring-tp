package tn.esprit.gestionprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter //generer les getters
@Setter //generer les setters
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String technologie;
    private long cout;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @OneToOne(mappedBy = "projetDetail")
    @ToString.Exclude
    @JsonIgnore
    private Projet projet;

}
