package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer>{

}
