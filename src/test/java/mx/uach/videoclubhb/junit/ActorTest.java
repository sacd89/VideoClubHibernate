/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.videoclubhb.junit;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.uach.videoclubhb.Actor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dsantillanes
 */
public class ActorTest {
    
    public ActorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
        EntityManager em = emf.createEntityManager();
        Actor a = new Actor("Natalie", "Portman");
        Actor b = new Actor("Mila", "Kunis");
        Actor c = new Actor("Krystal", "Jung");
        em.getTransaction().begin();;
        em.persist(a);
        em.persist(b);
        em.persist(c);
        em.getTransaction().commit();
        
        
        em.getTransaction().begin();;
        c.setNombre("Soojung");
        em.persist(c);
        em.getTransaction().commit();
        
        
        Query q = em.createQuery("SELECT a FROM Actor a");
        List<Actor> actores = q.getResultList();
        for (Actor actor : actores) {
            System.out.println("actores = " + actor);
        }
     }
}
