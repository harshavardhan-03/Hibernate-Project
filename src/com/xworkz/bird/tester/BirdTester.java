package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.dto.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {

		BirdDAO dao = new BirdDAOImpl();
		
		BirdEntity entity1 = new BirdEntity(1,"cocktail","Cacatua galerita",true,"white-yellow","australia",11,"male",true,"Sulphur-crested cockatoo");
		dao.save(entity1);
		
		System.out.println(dao.readById(1));
		dao.updateNameById(1, "cockatoo");
		dao.deleteById(1);
	}
}