package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IBusDao;
import com.cg.entity.BusDetails;
import com.cg.exception.NoBusesFound;

@Service
@Transactional
public class BusServiceImpl implements IBusService {
	
	@Autowired
	private IBusDao dao;

	public List<BusDetails> listAllBuses() throws NoBusesFound {
		List<BusDetails> bus = dao.listAll();
		if(bus == null || bus.size() == 0)
			throw new NoBusesFound("No buses are there");
		
		return bus;
	}
	
}
