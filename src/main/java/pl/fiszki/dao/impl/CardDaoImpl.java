package pl.fiszki.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.fiszki.dao.CardDao;
import pl.fiszki.model.Card;

@Repository
public class CardDaoImpl implements CardDao {

	@Autowired
	
	private SessionFactory session;
	
	@Override
	public void add(Card card) {
		session.getCurrentSession().save(card);

	}

	@Override
	public void edit(Card card) {
		session.getCurrentSession().update(card);

	}

	@Override
	public void delete(int cardId) {
		session.getCurrentSession().delete(getCard(cardId));

	}

	@Override
	public Card getCard(int cardId) {
		return (Card)session.getCurrentSession().get(Card.class, cardId);
	}

	@Override
	public List getAllCard() {
		return session.getCurrentSession().createQuery("from Card").list();
	}

}
