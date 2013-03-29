package pl.fiszki.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@Column
@GeneratedValue(strategy=GenerationType.AUTO)
private int userId;
@Column
private String login;
@Column
private String password;
@Column
private String role;

public User(){}

public User(int userId, String login, String password, String role) {
	super();
	this.userId = userId;
	this.login = login;
	this.password = password;
	this.role = role;
}





}
