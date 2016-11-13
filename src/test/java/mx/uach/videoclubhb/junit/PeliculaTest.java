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
public class PeliculaTest {

    public PeliculaTest() {
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
        Pelicula a = new Pelicula("Ralph El Demoledor", Genero.ANIMADA, 89, director);
        Pelicula b = new Pelicula("Lluvia de Hamburguesas", Genero.ANIMADA, 89, director);
        Pelicula c = new Pelicula("Monsters Inc", Genero.ANIMADA, 89, director);
        em.getTransaction().begin();
        em.persist(a);
        em.persist(b);
        em.persist(c);
        em.getTransaction().commit();

        em.getTransaction().begin();;
        c.setTitulo("Monster Inc.");
        em.persist(c);
        em.getTransaction().commit();

        Query q = em.createQuery("SELECT a FROM Pelicula a");
        List<Pelicula> peliculas = q.getResultList();
        for (Pelicula pelicula : peliculas) {
            System.out.println("peliculas = " + pelicula);
        }
    }
}
