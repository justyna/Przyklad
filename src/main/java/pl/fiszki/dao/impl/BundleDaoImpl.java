package pl.fiszki.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.fiszki.dao.BundleDao;
import pl.fiszki.model.Bundle;

@Repository
public class BundleDaoImpl implements BundleDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Bundle bundle) {
		session.getCurrentSession().save(bundle);

	}

	@Override
	public void edit(Bundle bundle) {
		session.getCurrentSession().update(bundle);

	}

	@Override
	public void delete(int bundleId) {
		session.getCurrentSession().delete(getBundle(bundleId));

	}

	@Override
	public Bundle getBundle(int bundleId) {
		return (Bundle)session.getCurrentSession().get(Bundle.class, bundleId);
	}

	@Override
	public List getAllBundle() {
		return session.getCurrentSession().createQuery("from Bundle").list();
	}

}
