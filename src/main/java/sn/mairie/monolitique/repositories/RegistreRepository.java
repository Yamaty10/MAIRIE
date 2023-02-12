package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Registre;

public interface RegistreRepository extends JpaRepository<Registre, Long> {
List<Registre> findByNumero(String numRegistre);
	//Registre findByNomAndProfession (String name, String profession );
}
