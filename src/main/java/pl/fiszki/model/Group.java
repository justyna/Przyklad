package pl.fiszki.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group {
@Id
@Column
@GeneratedValue(strategy=GenerationType.AUTO)
private int idGroup;

}
