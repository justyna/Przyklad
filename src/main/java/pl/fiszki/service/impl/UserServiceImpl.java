package pl.fiszki.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pl.fiszki.dao.UserDao;
import pl.fiszki.model.User;
import pl.fiszki.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void add(User user) {
		userDao.add(user);

	}

	@Transactional
	public void edit(User user) {
		userDao.edit(user);

	}

	@Transactional
	public void delete(int userId) {
		userDao.delete(userId);

	}

	@Transactional
	public User getUser(int userId) {
		return userDao.getUser(userId);
	}

	@Transactional
	public List getAllUser() {
		return userDao.getAllUser();
	}

}
