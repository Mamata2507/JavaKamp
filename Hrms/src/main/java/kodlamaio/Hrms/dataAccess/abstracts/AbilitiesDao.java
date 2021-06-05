package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.Abilities;

public interface AbilitiesDao extends JpaRepository<Abilities,Integer>{

}
