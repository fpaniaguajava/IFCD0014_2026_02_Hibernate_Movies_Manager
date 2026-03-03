package com.cursospring.moviesmanager.persistence;

import com.cursospring.moviesmanager.model.Genero;
import com.cursospring.moviesmanager.model.Pelicula;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PeliculaDAO extends SessionManager{
    public static void create(Pelicula pelicula) {
        startSession();
        session.beginTransaction();
        session.persist(pelicula);
        session.getTransaction().commit();
        System.out.println("¡Película creado/a con éxito!");
    }
    public static List<Pelicula> getPeliculasByYear(int anyo) {
        startSession();
        return session.createQuery(
                "FROM Pelicula WHERE anyo>=:anyoMaximo", Pelicula.class)
                .setParameter("anyoMaximo", anyo)
                .getResultList();
    }
    public static List<Pelicula> getPeliculasByGenero(Genero genero) {
        startSession();
        return session.createQuery(
                        "FROM Pelicula WHERE genero=:generoBuscado", Pelicula.class)
                .setParameter("generoBuscado", genero)
                .getResultList();
    }
    public static List<Pelicula> findPeliculasByTitulo(String titulo) {
        startSession();
        TypedQuery<Pelicula> query = session.createNamedQuery("Pelicula.findByTitulo", Pelicula.class);
        query.setParameter("cadena", "%" + titulo.toUpperCase() + "%");
        return query.getResultList();
    }
}
