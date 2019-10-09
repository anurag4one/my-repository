package com.cg.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entity.BusDetails;
import com.cg.exception.NoBusesFound;
import com.cg.service.IBusService;

//http://localhost:8221/BusTicketView_set3_46001333/busdetails.do
//the above url is used to get the output page

@Controller
public class BusController {
	
	@Autowired
	private IBusService service;
	
	@RequestMapping(value = "/busdetails.do")
	public String listAllBuses(Map model) throws NoBusesFound{
		List<BusDetails> buses = service.listAllBuses();
		model.put("buses", buses);
		return "BusDetails";
	}
}
