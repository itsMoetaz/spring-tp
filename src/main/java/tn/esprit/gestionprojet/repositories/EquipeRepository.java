package tn.esprit.gestionprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionprojet.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
