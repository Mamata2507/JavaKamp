package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.UsersService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.UsersDao;
import kodlamaio.Hrms.entities.concretes.Users;

@Service
public class UsersManager implements UsersService{

	private UsersDao userDao;

	@Autowired
	public UsersManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<Users>> getAll() {
		return new SuccessDataResult<List<Users>>
		(this.userDao.findAll(),"Data eklendi");
	}

	@Override
	public Result add(Users users) {
		this.userDao.save(users);
		return new SuccessResult("Kullanıcı eklendi");
	}

}
