package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Pere;

public interface PereRepository extends JpaRepository<Pere, Long> {
List<Pere> findByNom(String name);
	Pere findByNomAndProfession (String name, String profession );
}
