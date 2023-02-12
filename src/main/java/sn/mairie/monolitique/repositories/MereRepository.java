package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Mere;

public interface MereRepository extends JpaRepository<Mere, Long> {
List<Mere> findByNom(String name);
	Mere findByNomAndProfession (String name, String profession );
}
