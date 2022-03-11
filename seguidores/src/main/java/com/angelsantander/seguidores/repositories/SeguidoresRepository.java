package com.angelsantander.seguidores.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.EntityManager;

@Repository
public class SeguidoresRepository{
	@Autowired
	EntityManager manager;
	
	public List<Integer> getAllSeguidores(int user_id){
		Query query = manager.createNativeQuery("select id_user_2 from seguidores where id_user_1 = :user_id");
		query.setParameter("user_id",user_id);
		List<Integer> results = query.getResultList();
		return results;
	}
}
