package pl.fiszki.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.fiszki.dao.BundleDao;
import pl.fiszki.model.Bundle;
import pl.fiszki.service.BundleService;

@Service
public class BundleServiceImpl implements BundleService {

	@Autowired
	private BundleDao bundleDao;
	
	@Transactional
	public void add(Bundle bundle) {
		bundleDao.add(bundle);

	}

	@Transactional
	public void edit(Bundle bundle) {
		bundleDao.edit(bundle);

	}

	@Transactional
	public void delete(int bundleId) {
		bundleDao.delete(bundleId);

	}

	@Transactional
	public Bundle getBundle(int bundleId) {
		return bundleDao.getBundle(bundleId);
	}

	@Transactional
	public List getAllBundle() {
		return bundleDao.getAllBundle();
	}

}
