package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.FormationSanitaire;

public interface FormationSanitaireRepository extends JpaRepository<FormationSanitaire, Long> {
List<FormationSanitaire> findByLibele(String libelle);
	//FormationSanitaire findByNomAndProfession (String name, String profession );
}
