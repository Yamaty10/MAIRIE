package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.Mention;

public interface MentionRepository extends JpaRepository<Mention, Long> {
List<Mention> findByApposition(String app);
	//Mention findByNomAndProfession (String name, String profession );
}
