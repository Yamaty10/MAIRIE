package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Declarant;

public interface DeclarantRepository extends JpaRepository<Declarant, Long> {
List<Declarant> findByNom(String name);
	Declarant findByNomAndProfession (String name, String profession );
}
