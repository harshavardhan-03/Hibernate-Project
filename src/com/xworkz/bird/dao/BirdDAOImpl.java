package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.bird.dto.BirdEntity;
import com.xworkz.bird.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {

	BirdEntity dto = null;

	@Override
	public int save(BirdEntity entity) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		int pk = (int) session.save(entity);
		tr.commit();
		System.out.println("Saved : " + entity);
		session.close();
		return pk;
	}

	@Override
	public BirdEntity readById(int pk) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		BirdEntity entity = session.get(BirdEntity.class, pk);
		System.out.println("Read entity : ");
		session.close();
		return entity;
	}

	@Override
	public void updateNameById(int id, String name) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		dto = session.get(BirdEntity.class, id);
		dto.setName(name);
		session.update(dto);
		System.out.println("Name Updated : " + name + "\n" + dto);
		tr.commit();
		session.close();
	}

	@Override
	public void deleteById(int id) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		dto = session.get(BirdEntity.class, id);
		session.delete(dto);
		System.out.println("deleted successfully : " + dto);
		tr.commit();
		session.close();
	}
}