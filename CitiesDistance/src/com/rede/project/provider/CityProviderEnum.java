package com.rede.project.provider;

import java.util.HashMap;
import java.util.Map;

import com.rede.project.model.City;

public enum CityProviderEnum {
	instance;

	private Map<String, City> contentProvider = new HashMap<String, City>();

	private CityProviderEnum() {
		City city = new City("1", "New York", 40.7143528, -74.0059731);
		contentProvider.put("1", city);
		
		city = new City("2", "Sao Paulo", -23.5505199, -46.6333094);
		contentProvider.put("2", city);

	}
	
	public Map<String, City> getModel(){
		return contentProvider;
	} 
}