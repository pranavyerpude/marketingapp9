package com.marketingapp9.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp9.Entities.Leads;
import com.marketingapp9.Repository.LeadsRepository;

@Service
public class LeadsServiceImpl implements LeadsService {

	@Autowired
	private LeadsRepository leadsRepo;
	
	@Override
	public void saveLeads(Leads leads) {
		leadsRepo.save(leads);
		
	}

	@Override
	public List<Leads> getAllLeads() {
		
		List<Leads> leads = leadsRepo.findAll();
		return leads;
	}


	

	
	
	
	

}
