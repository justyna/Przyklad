package pl.fiszki.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bundle {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBundle;
	@Column
	private String nameBundle;
	@Column
	private String categoryBundle;
	@Column
	private String levelBundle;
	
	public Bundle(){}
	
	public Bundle(int idBundle, String nameBundle, String categoryBundle,
			String levelBundle) {
		super();
		this.idBundle = idBundle;
		this.nameBundle = nameBundle;
		this.categoryBundle = categoryBundle;
		this.levelBundle = levelBundle;
	}
	
	
	
}
