package fr.parissportifs.CoteWS;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CoteRepository extends 
    JpaRepository<Cote, Long>{
	Cote findByDomicileAndVisiteur(String from, String to);
}
