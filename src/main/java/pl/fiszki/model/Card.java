package pl.fiszki.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCard;
	@Column
	private String originLanguage;
	@Column
	private String foreignLanguage;
	@Column
	private String example;
	@Column
	private String definition;
	@Column
	private String originWord;
	@Column
	private String foreignWord;
	
	public Card(){}

	public Card(int idCard, String originLanguage,
			String foreignLanguage, String example, String definition,
			String originWord, String foreignWord) {
		super();
		this.idCard = idCard;
		this.originLanguage = originLanguage;
		this.foreignLanguage = foreignLanguage;
		this.example = example;
		this.definition = definition;
		this.originWord = originWord;
		this.foreignWord = foreignWord;
	}
	
	
}
