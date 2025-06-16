package com.UvTech.TMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.TMS.Entity.TMSEntity;
import com.UvTech.TMS.Service.TMSService;

@RestController
public class TMSController {
	
	@Autowired
	private TMSService service;
	
	@GetMapping("/Login")
	public String Login(){
		
		return "Task Management System Works Properly....";
	}
         @PostMapping("/AddTask")
         public String AddTask(@RequestBody TMSEntity task ){
        	 return service.AddTask(task);
         }
         }
