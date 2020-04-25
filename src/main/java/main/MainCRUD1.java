package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modele.Etudiant;

public class MainCRUD1 {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("toto");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Etudiant e = new Etudiant("Dupont","Pierre","12 rue des lilas 75016 PARIS");
		Etudiant e1 = new Etudiant("Dupont2","Pierre2","12 rue des lilas 75016 PARIS");
		em.persist(e);
		em.persist(e1);
		em.getTransaction().commit();
		
		//Read and show the etudient
		Query query = em.createQuery("select e.nom from Etudiant e");
		@SuppressWarnings("unchecked")
		List<String> etudiants = query.getResultList();
		for (String name : etudiants) {
			System.out.println(name);
		}
		em.close();
		emf.close();

	}

}
