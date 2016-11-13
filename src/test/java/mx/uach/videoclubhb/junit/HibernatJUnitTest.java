/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.videoclubhb.junit;

import java.sql.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.uach.videoclubhb.Actor;
import mx.uach.videoclubhb.Cinta;
import mx.uach.videoclubhb.Director;
import mx.uach.videoclubhb.Ficha;
import mx.uach.videoclubhb.Lista;
import mx.uach.videoclubhb.Pelicula;
import mx.uach.videoclubhb.Prestamo;
import mx.uach.videoclubhb.Socio;
import mx.uach.videoclubhb.enums.Genero;
import mx.uach.videoclubhb.enums.Prestamos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas del Hibernate
 * 
 * @author Daniela Santillanes Castro
 */
public class HibernatJUnitTest {

    /**
     * Prueba Unitaria para obtener ciertos actores y evaluamos si se encontro
     * dicho actor haciendo busquedas y modificando actores.
     */
    @Test
    public void actoresTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
        EntityManager em = emf.createEntityManager();
        Actor a = new Actor("Natalie", "Portman");
        Actor b = new Actor("Mila", "Kunis");
        Actor c = new Actor("Krystal", "Jung");
        em.getTransaction().begin();
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
    
    /**
     * Prueba Unitaria para obtener ciertas cintas y evaluamos si se encontro
     * dicha cinta haciendo busquedas y modificando cintas.
     */
//    @Test
//    public void cintaTest() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
//        EntityManager em = emf.createEntityManager();
//        Query d = em.createQuery("SELECT d FROM Pelicula d WHERE id=1");
//        Pelicula pelicula = (Pelicula) d.getSingleResult();
//        Cinta a = new Cinta(1, pelicula);
//        Cinta b = new Cinta(2, pelicula);
//        Cinta c = new Cinta(3, pelicula);
//        em.getTransaction().begin();
//        em.persist(a);
//        em.persist(b);
//        em.persist(c);
//        em.getTransaction().commit();
//
//        em.getTransaction().begin();
//        c.setNumCopia(4);
//        em.persist(c);
//        em.getTransaction().commit();
//
//        Query q = em.createQuery("SELECT a FROM Cinta a");
//        List<Cinta> cintas = q.getResultList();
//        for (Cinta cinta : cintas) {
//            System.out.println("cintas= " + cinta);
//        }
// EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
//        EntityManager em = emf.createEntityManager();
//        Director director = new Director("Prueba 2");
//        Pelicula pelicula = new Pelicula("Prueba", Genero.TERROR, 150, director);
//        Cinta a = new Cinta(1, pelicula);
//        Cinta b = new Cinta(2, pelicula);
//        Cinta c = new Cinta(3, pelicula);
//        em.getTransaction().begin();;
//        em.persist(a);
//        em.persist(b);
//        em.persist(c);
//        em.getTransaction().commit();
//        
//        
//        em.getTransaction().begin();
//        c.setNumCopia(4);
//        em.persist(c);
//        em.getTransaction().commit();
//        
//        
//        Query q = em.createQuery("SELECT a FROM Cinta a");
//        List<Cinta> cintas = q.getResultList();
//        for (Cinta cinta : cintas) {
//            System.out.println("cintas= " + cinta);
//        }
//    }
    
    /**
     * Prueba Unitaria para obtener ciertos directores y evaluamos si se
     * encontro dicho director haciendo busquedas y modificando los directores.
     */
    @Test
    public void directoresTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
        EntityManager em = emf.createEntityManager();
        Director a = new Director("Tim Burton");
        Director b = new Director("James Cameron");
        Director c = new Director("Alfonso Cuaron");
        em.getTransaction().begin();;
        em.persist(a);
        em.persist(b);
        em.persist(c);
        em.getTransaction().commit();

        em.getTransaction().begin();
        c.setNombre("Hola");
        em.persist(c);
        em.getTransaction().commit();

        Query q = em.createQuery("SELECT a FROM Director a");
        List<Director> directores = q.getResultList();
        for (Director director : directores) {
            System.out.println("directores= " + director);
        }
    }
    
    /**
     * Prueba Unitaria para obtener ciertas fichas y evaluamos si se encontro
     * dicha ficha haciendo busquedas y modificando fichas.
     */
//    @Test
//    public void fichasTest() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
//        EntityManager em = emf.createEntityManager();
//        Query d = em.createQuery("SELECT d FROM Socio d WHERE id=1");
//        Socio socio = (Socio) d.getSingleResult();
//        Ficha a = new Ficha(Date.valueOf("2016-07-25"), socio);
//        Ficha b = new Ficha(Date.valueOf("2015-07-25"), socio);
//        Ficha c = new Ficha(Date.valueOf("2014-07-25"), socio);
//        em.getTransaction().begin();;
//        em.persist(a);
//        em.persist(b);
//        em.persist(c);
//        em.getTransaction().commit();
//        
//        d = em.createQuery("SELECT d FROM Socio d WHERE id=2");
//        Socio socio2 = (Socio) d.getSingleResult();
//        em.getTransaction().begin();;
//        c.setSocio(socio2);
//        em.persist(c);
//        em.getTransaction().commit();
//        
//        
//        Query q = em.createQuery("SELECT a FROM Ficha a");
//        List<Ficha> fichas = q.getResultList();
//        for (Ficha ficha : fichas) {
//            System.out.println("Fichas= " + ficha);
//        }
//    }
    
    /**
     * Prueba Unitaria para obtener ciertas listas y evaluamos si se encontro
     * dicha lista haciendo busquedas y modificando listas.
     */
//    @Test
//    public void listasTest() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
//        EntityManager em = emf.createEntityManager();
//        Query d = em.createQuery("SELECT d FROM Socio d WHERE id=1");
//        Socio socio = (Socio) d.getSingleResult();
//        d = em.createQuery("SELECT d FROM Pelicula d WHERE id=1");
//        Pelicula pelicula = (Pelicula) d.getSingleResult();
//        Lista a = new Lista(Date.valueOf("2016-07-07"), Date.valueOf("2016-07-07"), 
//                Boolean.TRUE, socio, pelicula);
////        Lista b = new Lista(Date.valueOf("2015-07-07"), Date.valueOf("2015-07-07"), Boolean.TRUE, socio, pelicula);
////        Lista c = new Lista(Date.valueOf("2014-07-07"), Date.valueOf("2014-07-07"), Boolean.FALSE, socio, pelicula);
//        em.getTransaction().begin();
//        em.persist(a);
////        em.persist(b);
////        em.persist(c);
//        em.getTransaction().commit();
//        
//        
////        em.getTransaction().begin();
////        c.setEstatus(Boolean.TRUE);
////        em.persist(c);
////        em.getTransaction().commit();
////        
////        
//        Query q = em.createQuery("SELECT a FROM Lista a");
//        List<Lista> listas = q.getResultList();
//        for (Lista lista : listas) {
//            System.out.println("listas = " + lista);
//        }
// EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
//        EntityManager em = emf.createEntityManager();
//        Socio socio = new Socio("Prueba1", "Prueba1", "Prueba1");
//        Director director = new Director("Prueba1");
//        Pelicula pelicula = new Pelicula("Prueba1", Genero.TERROR, 80, director);
//       Lista a = new Lista(Date.valueOf("2016-07-07"), Date.valueOf("2016-07-07"), 
//                Boolean.TRUE, socio, pelicula);
//        Lista b = new Lista(Date.valueOf("2015-07-07"), Date.valueOf("2015-07-07"), Boolean.TRUE, socio, pelicula);
//        Lista c = new Lista(Date.valueOf("2014-07-07"), Date.valueOf("2014-07-07"), Boolean.FALSE, socio, pelicula);
//        em.getTransaction().begin();;
//        em.persist(a);
//        em.persist(b);
//        em.persist(c);
//        em.getTransaction().commit();
//        
//        
//        em.getTransaction().begin();
//        c.setEstatus(Boolean.TRUE);
//        em.persist(c);
//        em.getTransaction().commit();
//        
//        
//        Query q = em.createQuery("SELECT a FROM Lista a");
//        List<Lista> listas = q.getResultList();
//        for (Lista lista : listas) {
//            System.out.println("listas = " + lista);
//        }
//    }
//
    /**
     * Prueba Unitaria para obtener ciertas peliculas y evaluamos si se encontro
     * dicha pelicula haciendo busquedas y modificando peliculas.
     */
    @Test
    public void peliculasTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
        EntityManager em = emf.createEntityManager();
        Query d = em.createQuery("SELECT d FROM Director d WHERE id=1");
        Director director = (Director) d.getSingleResult();
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
    
    /**
     * Prueba Unitaria para obtener ciertos prestamos y evaluamos si se encontro
     * dicho prestamo haciendo busquedas y modificando prestamos.
     */
//    @Test
//    public void PrestamosTest() {
//        try {
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
//            EntityManager em = emf.createEntityManager();
////            Query d = em.createQuery("SELECT d FROM Ficha d WHERE id=1");
////            Ficha ficha = (Ficha) d.getSingleResult();
//            Query f = em.createQuery("SELECT d FROM Cinta d WHERE id=1");
//            Cinta cinta = (Cinta) f.getSingleResult();
//        Socio socio = new Socio("Daniela", "prueba1", "1234567");
//        Ficha ficha = new Ficha(Date.valueOf("2016-08-08"), socio);
////        Director director = new Director("prueba5");
////        Pelicula pelicula = new Pelicula("prueba3", Genero.TERROR, 50, director);
////        Cinta cinta = new Cinta(3, pelicula);
//            Prestamo a = new Prestamo(Date.valueOf("2016-08-08"), Prestamos.E, ficha, cinta);
////            Prestamo b = new Prestamo(Date.valueOf("2015-08-08"), Prestamos.P, ficha, cinta);
////            Prestamo c = new Prestamo(Date.valueOf("2014-08-08"), Prestamos.V, ficha, cinta);
//            em.getTransaction().begin();
//            em.persist(a);
////            em.persist(b);
////            em.persist(c);
//            em.getTransaction().commit();
//
////            em.getTransaction().begin();;
////            c.setEstatus(Prestamos.E);
////            em.persist(c);
////            em.getTransaction().commit();
//
////            Query q = em.createQuery("SELECT a FROM Prestamo a");
////            List<Prestamo> prestamos = q.getResultList();
////            for (Prestamo prestamo : prestamos) {
////                System.out.println("prestamo = " + prestamo);
////            }
//
//        } catch (Exception ex) {
//            System.out.println("AQUIIIIIIIIIIIIIIIIIIII" + ex);
//        }
//    }

    /**
     * Prueba Unitaria para obtener ciertos socios y evaluamos si se encontro
     * dicho socio haciendo busquedas y modificando socios.
     */
    @Test
    public void sociosTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
        EntityManager em = emf.createEntityManager();
        Socio a = new Socio("Daniela Santillanes", "Prueba1", "1111234");
        Socio b = new Socio("Prueba2", "Prueba2", "456548621");
        Socio c = new Socio("Prueba3", "Prueba3", "3141234568");
        em.getTransaction().begin();;
        em.persist(a);
        em.persist(b);
        em.persist(c);
        em.getTransaction().commit();

        em.getTransaction().begin();;
        c.setNombre("Prueba4");
        em.persist(c);
        em.getTransaction().commit();

        Query q = em.createQuery("SELECT a FROM Socio a");
        List<Socio> socios = q.getResultList();
        for (Socio socio : socios) {
            System.out.println("Socios = " + socio);
        }
    }
}
