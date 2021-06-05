package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.CirculiumVitae;

public interface CirculiumVitaeDao extends JpaRepository<CirculiumVitae,Integer> {

}
