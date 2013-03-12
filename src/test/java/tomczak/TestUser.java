package tomczak;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.junit.Assert;
import org.junit.Test;

import tomczak.model.User;

public class TestUser {

	@PersistenceUnit // doesn't work in SE environment
	private EntityManagerFactory emf;
	
	@Test 
	public void testEclipelinkDerbyUserPersist() {
		emf = Persistence.createEntityManagerFactory("eclipelink-derby");
		persistUser();
	}

	@Test
	public void testHibernateDerbyUserPersist() {
		emf = Persistence.createEntityManagerFactory("hibernate-derby");
		persistUser();
	}
	
	@Test
	public void testEclipselinkH2UserPersist() {
		emf = Persistence.createEntityManagerFactory("eclipselink-h2");
		persistUser();
	}
	
	@Test
	public void testHibernateH2UserPersist() {
		emf = Persistence.createEntityManagerFactory("hibernate-h2");
		persistUser();
	}
	
	private void persistUser() {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			User u = new User();
			u.setName("koko");
			em.persist(u);
			Assert.assertNotNull(u.getId());
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
}
