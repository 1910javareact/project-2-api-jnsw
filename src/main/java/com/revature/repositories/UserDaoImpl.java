package com.revature.repositories;

import javax.persistence.EntityManagerFactory;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.models.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	private SessionFactory sf;
	
	@Autowired
	public UserDaoImpl(EntityManagerFactory emf) {
		this.sf = emf.unwrap(SessionFactory.class);
	}

	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query<User> q = s.createQuery("FROM user WHERE username = :username, password = :password");
		q.setParameter("username", username);
		q.setParameter("password", password);
		User u = q.getSingleResult();
		t.commit();
		s.close();
		return u;
	}

}
