package com.uvd.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uvd.Entity.Wifeless;
import com.uvd.serviceInterface.ServiceInterface;



@Controller
@ComponentScan({"com"})
public class ControllerClass {
	
	@Autowired
	private ServiceInterface service;
	
	@Autowired
	private SessionFactory sf;
	
	
	@RequestMapping("/login")
	public String loginController(Model m,@RequestParam String unm,@RequestParam int pwd,@RequestParam String loginSelect) {
		
		System.out.println("In the login controller");
		
		System.out.println(loginSelect);
		System.out.println(unm);
		System.out.println(pwd);
		
		String admin = "Administration";
		String user = "User";

		String Aname = "admin";
		String Apass = "123";
		int Adminpass = Integer.parseInt(Apass);

		if (user.equals(loginSelect) && !unm.equals("admin")) {
			System.out.println("user login");

			List<Wifeless> list = service.loginService(unm, pwd);
			
			if(list.isEmpty()) {
				
				System.out.println("Invalid user");
				return "index";
			}
			
			m.addAttribute("data1", list);

			return "Customer-Info";
			

		} else if (admin.equals(loginSelect) && unm.equals(Aname) && pwd == Adminpass) {

			System.out.println("admin Login");

			Session session1 = sf.openSession();
			List<Wifeless> list = service.getAllDetails();

			m.addAttribute("data1", list);

			return "success";

		} else {
			System.out.println("Invalid User");

			return "index";
		}

	}
	
	@RequestMapping("/reg")
	public String registerUser(@ModelAttribute Wifeless wf) 
	{
		
		System.out.println(wf.getFname());
		
		boolean stored = service.registerUser(wf);
		
		if(stored) {
		
		return "index";
	}else {
		
		return "error";
	}
	
  }
	
	@RequestMapping("/edit")
	public String editController(@RequestParam("pId") int pid,Model m) {
		
		System.out.println("In edit Controller");
		System.out.println(pid);
		
		Wifeless wf = service.editService(pid);
		
		List<Wifeless> list = new ArrayList<>();
		list.add(wf);
		
		m.addAttribute("data", list);
		
		return "display";
		
	}
	
	@RequestMapping("/update")
	public String updateController(@ModelAttribute Wifeless wf,Model m) {
		
		System.out.println(wf.getpId() +  " update controller with id");
		
		List<Wifeless> list = service.updateService(wf);
		
		m.addAttribute("data1", list);
		
		return "success";
	}
	
	@RequestMapping("/delet")
	public String deletController(Model m, @RequestParam int pId) {
		
		service.deletService(pId);
		
		System.out.println("service Deleted");
		
		List<Wifeless> list = service.getAllDetails();
		
		m.addAttribute("data1", list);
		
		return "success";
	}
	
	
	
	
	

}
