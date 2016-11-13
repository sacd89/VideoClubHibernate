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
import mx.uach.videoclubhb.Cinta;
import mx.uach.videoclubhb.Director;
import mx.uach.videoclubhb.Pelicula;
import mx.uach.videoclubhb.enums.Genero;
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
public class CintaTest {
    
    public CintaTest() {
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
        Director director = new Director("Prueba 2");
        Pelicula pelicula = new Pelicula("Prueba", Genero.TERROR, 150, director);
        Cinta a = new Cinta(1, pelicula);
        Cinta b = new Cinta(2, pelicula);
        Cinta c = new Cinta(3, pelicula);
        em.getTransaction().begin();;
        em.persist(a);
        em.persist(b);
        em.persist(c);
        em.getTransaction().commit();
        
        
        em.getTransaction().begin();
        c.setNumCopia(4);
        em.persist(c);
        em.getTransaction().commit();
        
        
        Query q = em.createQuery("SELECT a FROM Cinta a");
        List<Cinta> cintas = q.getResultList();
        for (Cinta cinta : cintas) {
            System.out.println("cintas= " + cinta);
        }
     }
}
