package com.marketingapp9.Service;

import java.util.List;

import com.marketingapp9.Entities.Leads;

public interface LeadsService {
	
	public void saveLeads(Leads leads);
	
	public List<Leads> getAllLeads();
}
