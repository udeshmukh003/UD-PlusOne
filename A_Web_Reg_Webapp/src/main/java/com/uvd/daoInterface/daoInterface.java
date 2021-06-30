package com.uvd.daoInterface;

import java.util.List;

import com.uvd.Entity.Wifeless;

public interface daoInterface {
	
	public List<Wifeless> getAllDetails();
	public List<Wifeless> loginDao(String uname, int pass);
	public boolean regisrUser(Wifeless wf);
	public void deletDao(int id);
	public Wifeless editDao(int id);
	public List<Wifeless> updateDao(Wifeless wf);

}
