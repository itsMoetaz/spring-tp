package tn.esprit.gestionprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionprojet.entities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
