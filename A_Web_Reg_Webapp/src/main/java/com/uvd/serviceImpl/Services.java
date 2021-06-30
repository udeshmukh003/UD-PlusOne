package com.uvd.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uvd.Entity.Wifeless;
import com.uvd.daoInterface.daoInterface;
import com.uvd.serviceInterface.ServiceInterface;

@Service
public class Services implements ServiceInterface{
	
	
	@Autowired
	private daoInterface daoI;
	
	@Override
	public List<Wifeless> getAllDetails() {
		
		List<Wifeless> list = daoI.getAllDetails();
		
		return list;
	}
	
	@Override
	public List<Wifeless> loginService(String uname, int pass) {
		
		List<Wifeless> list = daoI.loginDao(uname, pass);
		
		return list;
	}
	@Override
	public boolean registerUser(Wifeless wf) {
		
		System.out.println("In Service");
		
		boolean stored = daoI.regisrUser(wf);
		
		return stored;
	}

	@Override
	public void deletService(int id) {
		// TODO Auto-generated method stub
		
		daoI.deletDao(id);
		
	}

	@Override
	public Wifeless editService(int pId) {
		// TODO Auto-generated method stub
		
		Wifeless wf = daoI.editDao(pId);
		
		return wf;
	}

	@Override
	public List<Wifeless> updateService(Wifeless wf) {
		// TODO Auto-generated method stub
		
		List<Wifeless> list = daoI.updateDao(wf);
		
		return list;
	}


	

}
