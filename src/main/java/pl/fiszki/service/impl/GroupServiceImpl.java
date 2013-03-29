package pl.fiszki.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pl.fiszki.dao.GroupDao;
import pl.fiszki.model.Group;
import pl.fiszki.service.GroupService;

public class GroupServiceImpl implements GroupService {
	
	@Autowired
	private GroupDao groupDao;

	@Transactional
	public void add(Group group) {
		groupDao.add(group);

	}

	@Transactional
	public void edit(Group group) {
		groupDao.edit(group);

	}

	@Transactional
	public void delete(int groupId) {
		groupDao.delete(groupId);

	}

	@Transactional
	public Group getGroup(int groupId) {
		return groupDao.getGroup(groupId);
	}

	@Transactional
	public List getAllGroup() {
		// TODO Auto-generated method stub
		return groupDao.getAllGroup();
	}

}
