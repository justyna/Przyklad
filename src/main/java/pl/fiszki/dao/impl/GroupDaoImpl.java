package pl.fiszki.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.fiszki.dao.GroupDao;
import pl.fiszki.model.Group;

@Repository
public class GroupDaoImpl implements GroupDao {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Group group) {
		session.getCurrentSession().save(group);
	}

	@Override
	public void edit(Group group) {
		session.getCurrentSession().update(group);

	}

	@Override
	public void delete(int groupId) {
		session.getCurrentSession().delete(getGroup(groupId));

	}

	@Override
	public Group getGroup(int groupId) {
		
		return (Group)session.getCurrentSession().get(Group.class, groupId);
	}

	@Override
	public List getAllGroup() {

		return session.getCurrentSession().createQuery("from Group").list();
	}

}
