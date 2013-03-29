package pl.fiszki.dao;

import java.util.List;

import pl.fiszki.model.Card;

public interface CardDao {
	public void add(Card card);
	public void edit(Card card);
	public void delete(int cardId);
	public Card getCard(int cardId);
	public List getAllCard();
	
}
