package pl.fiszki.service;

import java.util.List;

import pl.fiszki.model.Card;

public interface CardService {
	
	public void add(Card card);
	public void edit(Card card);
	public void delete(int cardId);
	public Card getCard(int cardId);
	public List getAllCard();
}
