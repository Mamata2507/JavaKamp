package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

	public List<Users> findByEmail(String email);
}
