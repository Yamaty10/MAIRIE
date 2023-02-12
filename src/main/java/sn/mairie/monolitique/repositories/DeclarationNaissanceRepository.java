package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import sn.mairie.monolitique.entities.DeclarationNaissance;

public interface DeclarationNaissanceRepository extends JpaRepository<DeclarationNaissance, Long> {
List<DeclarationNaissance> findByDeclaration(String decl);
	//DeclarationNaissance findByNomAndProfession (String name, String profession );
}
