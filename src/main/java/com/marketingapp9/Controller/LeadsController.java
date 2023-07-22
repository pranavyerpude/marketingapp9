package com.marketingapp9.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.marketingapp9.Entities.Leads;
import com.marketingapp9.Service.LeadsService;

import com.marketingapp9.dto.LeadsDto;

@Controller
public class LeadsController {
	
	@Autowired
	private LeadsService leadsService;
	
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String viewCreateLeads() {
		return "create_leads";
	}
	
	
	
	//@RequestMapping("/saveLeads")
	//public String saveLeads(Leads leads) {
	//leadsService.saveLeads(leads);
		//return "create_leads";
//}
	
//	@RequestMapping("/saveLeads")
//		public String saveLeads(@RequestParam("firstName")String firstName,
//				@RequestParam("lastName")String lastName,
//				@RequestParam("email")String email,
//				@RequestParam("mobile")String mobile) {
//				
//		Leads leads=new Leads();
//		leads.setFirstName(firstName);
//		leads.setLastName(lastName);
//		leads.setEmail(email);
//		leads.setMobile(mobile);
//		
//		leadsService.saveLeads(leads);
//			return "create_leads";
//		
//		
//	}
	
	@RequestMapping("/saveLeads")
	public String saveLeads(LeadsDto leadsDto) {
		
		Leads leads=new Leads();
		leads.setFirstName(leadsDto.getFirstName());
		leads.setLastName(leadsDto.getLastName());
		leads.setEmail(leadsDto.getEmail());
		leads.setMobile(leadsDto.getMobile());
		
		leadsService.saveLeads(leads);
		return "create_leads";
	}
	
	//http://localhost:8080/listall
	@RequestMapping("/listall")
	public String getAllLeads() {
		
	 List<Leads> leads = leadsService.getAllLeads();
		System.out.println("leads");
		return "leads";
		
	}
	
}



