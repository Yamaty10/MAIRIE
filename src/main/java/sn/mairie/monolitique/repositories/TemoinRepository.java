package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Temoin;

public interface TemoinRepository extends JpaRepository<Temoin, Long> {
List<Temoin> findByNom(String name);
	Temoin findByNomAndProfession (String name, String profession );
}
