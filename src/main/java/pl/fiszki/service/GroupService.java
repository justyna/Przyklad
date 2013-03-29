package pl.fiszki.service;

import java.util.List;

import pl.fiszki.model.Group;

public interface GroupService {
	
	public void add(Group group);
	public void edit(Group group);
	public void delete(int groupId);
	public Group getGroup(int groupId);
	public List getAllGroup();
}
