package tn.esprit.gestionprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionprojet.entities.ProjetDetail;

public interface ProjetDetailRepository extends JpaRepository<ProjetDetail, Long> {
}
