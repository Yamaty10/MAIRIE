package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Jugement;

public interface JugementRepository extends JpaRepository<Jugement, Long> {
List<Jugement> findByNumero(String num);
	//Jugement findByNomAndProfession (String name, String profession );
}
