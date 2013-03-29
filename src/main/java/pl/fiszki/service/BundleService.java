package pl.fiszki.service;

import java.util.List;

import pl.fiszki.model.Bundle;

public interface BundleService {
	
	public void add(Bundle bundle);
	public void edit(Bundle bundle);
	public void delete(int bundleId);
	public Bundle getBundle(int bundleId);
	public List getAllBundle();
}
