package pl.fiszki.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.fiszki.dao.CardDao;
import pl.fiszki.model.Card;
import pl.fiszki.service.CardService;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardDao cardDao;
	
	@Transactional
	public void add(Card card) {
		cardDao.add(card);

	}

	@Transactional
	public void edit(Card card) {
		cardDao.edit(card);

	}

	@Transactional
	public void delete(int cardId) {
		cardDao.delete(cardId);

	}

	@Transactional
	public Card getCard(int cardId) {
		return cardDao.getCard(cardId);
	}

	@Transactional
	public List getAllCard() {
		return cardDao.getAllCard();
	}

}
