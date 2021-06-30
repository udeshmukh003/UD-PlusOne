package com.uvd.serviceInterface;

import java.util.List;

import com.uvd.Entity.Wifeless;

public interface ServiceInterface {
	
	public List<Wifeless> getAllDetails();
	public List<Wifeless> loginService(String uname, int pass);
	public boolean registerUser(Wifeless wf);
	public void deletService(int id);
	public Wifeless editService(int pId);
	public List<Wifeless> updateService(Wifeless wf);
	

}
