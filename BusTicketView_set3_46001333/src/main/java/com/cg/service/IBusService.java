package com.cg.service;

import java.util.List;

import com.cg.entity.BusDetails;
import com.cg.exception.NoBusesFound;

public interface IBusService {
	
	List<BusDetails> listAllBuses() throws NoBusesFound;

}
