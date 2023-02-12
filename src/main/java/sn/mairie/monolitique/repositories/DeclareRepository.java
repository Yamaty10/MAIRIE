package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Declare;

public interface DeclareRepository extends JpaRepository<Declare, Long> {
List<Declare> findByNom(String name);
	//Declare findByNomAndProfession (String name, String profession );
}
