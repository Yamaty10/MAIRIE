package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Centre;

public interface CentreRepository extends JpaRepository<Centre, Long> {
List<Centre> findByLibele(String libelle);
	//Centre findByNomAndProfession (String name, String profession );
}
