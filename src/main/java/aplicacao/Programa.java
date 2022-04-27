package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Joaquim Figueiredo", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Ana Maria", "anamaria@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();
		//em.persist(p2);
		//em.getTransaction().commit();
		//System.out.println("Done!");
		
		Pessoa p = em.find(Pessoa.class, 4);
		System.out.println(p);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();

	}

}
