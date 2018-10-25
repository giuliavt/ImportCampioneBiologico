package it.vtsolutions.campionibio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.vtsolutions.campionibio.entity.CampioneBiologico;

@Repository
public interface CampioneBiologicoRespository  extends JpaRepository<CampioneBiologico, Long>{

}
