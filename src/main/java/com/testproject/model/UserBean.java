package com.testproject.model;

import javax.ejb.Stateless;

@Stateless
public class UserBean implements UserBeanLocal {

//	@PersistenceContext
//	private EntityManager em;
//
//	public User add(User user) {
//		return em.merge(user);
//	}
//
//	public User get(long id) {
//		return em.find(User.class, id);
//	}
//
//	public void update(User user) {
//		add(user);
//	}
//
//	public void delete(long id) {
//		em.remove(get(id));
//	}
//
//	public List<User> getAll() {
//		TypedQuery<User> namedQuery = em.createNamedQuery("User.getAll", User.class);
//		return namedQuery.getResultList();
//	}

}
