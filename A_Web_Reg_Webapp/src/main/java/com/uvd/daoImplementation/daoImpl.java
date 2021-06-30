package com.uvd.daoImplementation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uvd.Entity.Wifeless;
import com.uvd.daoInterface.daoInterface;

@Repository
public class daoImpl implements daoInterface{
	
	@Autowired
	private SessionFactory sf;
	
	
	public List<Wifeless> getAllDetails(){
		
		Session session = sf.openSession();
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Wifeless>query1=builder.createQuery(Wifeless.class);
		Root<Wifeless>root=query1.from(Wifeless.class);
		query1.select(root);
		Query q=(Query) session.createQuery(query1);
		List<Wifeless>list=q.getResultList();
		
		
		session.close();
		
		return list;

	}
	
	@Override
	public List<Wifeless> loginDao(String uname, int pass) {
		
		Session session = sf.openSession();
		Query query = session.createQuery("From Wifeless where uname='" + uname + "' and pass='" + pass + "'");
		List<Wifeless> list = query.list();
		
		session.close();
		
		return list;
	}

	@Override
	public boolean regisrUser(Wifeless wf) {
		
		System.out.println("data came into daoImplementation "+wf.getGender());
		
		Session session=sf.openSession();
		int i=(int) session.save(wf);
		session.beginTransaction().commit();
		
		session.close();

		
		if(i>0)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
		

	}
	
	
	public Wifeless editDao(int pId) {
		
		System.out.println(pId);
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Wifeless wf = session.get(Wifeless.class, pId);
		
		tx.commit();
		System.out.println(wf.getGender());
		
		return wf;
		
	}

	@Override
	public void deletDao(int id) {
		// TODO Auto-generated method stub
		
		Session session = sf.openSession();
		Object o=session.load(Wifeless.class, id);
		Wifeless wf=(Wifeless)o;
		Transaction t=session.beginTransaction();
		session.delete(wf);
		t.commit();
		
		session.close();
		
		
		/*
		 * Query query=session.createQuery("From Wifeless"); 
		 * List<Wifeless> list=query.list();
		 * request.setAttribute("data1", list); 
		 */
		
	}

	@Override
	public List<Wifeless> updateDao(Wifeless wf) {
		// TODO Auto-generated method stub
		System.out.println("update dao");
		System.out.println(wf.getpId() + " dao update");
		
		Session session = sf.openSession();
		
		session.update(wf);
		session.beginTransaction().commit();

		
		System.out.println("data  editedd");
		
		int pId = wf.getpId();
		
		Transaction t=session.beginTransaction();
		 Wifeless wf1 = session.get(Wifeless.class, pId); 
		 t.commit();
		 List<Wifeless> list = new ArrayList<>();
		 list.add(wf1); 
		 
		 
		return list;
	}


}
