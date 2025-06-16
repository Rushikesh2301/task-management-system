package com.UvTech.TMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.TMS.Entity.TMSEntity;
import com.UvTech.TMS.Repo.TMSRepo;

@Service
public class TMSService {
	
	@Autowired
	private TMSRepo tmsrepo;
	
	public String AddTask(TMSEntity task) {
		tmsrepo.save(task);
		
		return "Task Added To Task..";
		
	}

}
