package pl.fiszki.dao;

import java.util.List;

import pl.fiszki.model.Group;

public interface GroupDao {
	public void add(Group group);
	public void edit(Group group);
	public void delete(int groupId);
	public Group getGroup(int groupId);
	public List getAllGroup();
}
