package com.cursospring.moviesmanager;

import com.cursospring.moviesmanager.model.Genero;
import com.cursospring.moviesmanager.model.Pelicula;
import com.cursospring.moviesmanager.persistence.GeneroDAO;
import com.cursospring.moviesmanager.persistence.PeliculaDAO;
import com.cursospring.moviesmanager.persistence.SessionManager;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]) {
        /*
        //1. Creación de géneros
        Genero terror = new Genero("Terror");
        GeneroDAO.create(terror);
        //2. Creación de películas
        createMovies(terror);
         */
        //3. Consulta de peliculas
        //Por año
        //List<Pelicula> peliculas = PeliculaDAO.getPeliculasByYear(1960);

        //Por género
//        List<Pelicula> peliculas = PeliculaDAO.getPeliculasByGenero(GeneroDAO.read(2));
//        peliculas.forEach(pelicula -> {
//            System.out.println(pelicula);
//        });

        //Por título
        List<Pelicula> peliculas = PeliculaDAO.findPeliculasByTitulo("aT");
        peliculas.forEach(pelicula -> {
            System.out.println(pelicula);
        });

        SessionManager.finishSession();
    }
    private static void createMovies(Genero genero){
        PeliculaDAO.create(new Pelicula("El Replandor", "Kubrick", 1978, genero));
        PeliculaDAO.create(new Pelicula("The Cabinet of Dr. Caligari", "Robert Wiene", 1920, genero));
        PeliculaDAO.create(new Pelicula("Metropolis", "Fritz Lang", 1927, genero));
        PeliculaDAO.create(new Pelicula("City Lights", "Charles Chaplin", 1931, genero));
        PeliculaDAO.create(new Pelicula("Gone with the Wind", "Victor Fleming", 1939, genero));
        PeliculaDAO.create(new Pelicula("Citizen Kane", "Orson Welles", 1941, genero));
        PeliculaDAO.create(new Pelicula("Casablanca", "Michael Curtiz", 1942, genero));
        PeliculaDAO.create(new Pelicula("Bicycle Thieves", "Vittorio De Sica", 1948, genero));
        PeliculaDAO.create(new Pelicula("Sunset Boulevard", "Billy Wilder", 1950, genero));
        PeliculaDAO.create(new Pelicula("Seven Samurai", "Akira Kurosawa", 1954, genero));
        PeliculaDAO.create(new Pelicula("The Searchers", "John Ford", 1956, genero));
        PeliculaDAO.create(new Pelicula("Psycho", "Alfred Hitchcock", 1960, genero));
        PeliculaDAO.create(new Pelicula("Lawrence of Arabia", "David Lean", 1962, genero));
        PeliculaDAO.create(new Pelicula("The Good, the Bad and the Ugly", "Sergio Leone", 1966, genero));
        PeliculaDAO.create(new Pelicula("2001: A Space Odyssey", "Stanley Kubrick", 1968, genero));
        PeliculaDAO.create(new Pelicula("The Godfather", "Francis Ford Coppola", 1972, genero));
        PeliculaDAO.create(new Pelicula("Jaws", "Steven Spielberg", 1975, genero));
        PeliculaDAO.create(new Pelicula("Star Wars", "George Lucas", 1977, genero));
        PeliculaDAO.create(new Pelicula("Apocalypse Now", "Francis Ford Coppola", 1979, genero));
        PeliculaDAO.create(new Pelicula("The Shining", "Stanley Kubrick", 1980, genero));
        PeliculaDAO.create(new Pelicula("Blade Runner", "Ridley Scott", 1982, genero));
        PeliculaDAO.create(new Pelicula("The Terminator", "James Cameron", 1984, genero));
        PeliculaDAO.create(new Pelicula("Back to the Future", "Robert Zemeckis", 1985, genero));
        PeliculaDAO.create(new Pelicula("Platoon", "Oliver Stone", 1986, genero));
        PeliculaDAO.create(new Pelicula("The Princess Bride", "Rob Reiner", 1987, genero));
        PeliculaDAO.create(new Pelicula("Die Hard", "John McTiernan", 1988, genero));
        PeliculaDAO.create(new Pelicula("Cinema Paradiso", "Giuseppe Tornatore", 1988, genero));
        PeliculaDAO.create(new Pelicula("Goodfellas", "Martin Scorsese", 1990, genero));
        PeliculaDAO.create(new Pelicula("The Silence of the Lambs", "Jonathan Demme", 1991, genero));
        PeliculaDAO.create(new Pelicula("Jurassic Park", "Steven Spielberg", 1993, genero));
        PeliculaDAO.create(new Pelicula("Pulp Fiction", "Quentin Tarantino", 1994, genero));
        PeliculaDAO.create(new Pelicula("The Shawshank Redemption", "Frank Darabont", 1994, genero));
        PeliculaDAO.create(new Pelicula("Se7en", "David Fincher", 1995, genero));
        PeliculaDAO.create(new Pelicula("Titanic", "James Cameron", 1997, genero));
        PeliculaDAO.create(new Pelicula("The Matrix", "Wachowskis", 1999, genero));
        PeliculaDAO.create(new Pelicula("Gladiator", "Ridley Scott", 2000, genero));
        PeliculaDAO.create(new Pelicula("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001, genero));
        PeliculaDAO.create(new Pelicula("City of God", "Fernando Meirelles", 2002, genero));
        PeliculaDAO.create(new Pelicula("Finding Nemo", "Andrew Stanton", 2003, genero));
        PeliculaDAO.create(new Pelicula("The Dark Knight", "Christopher Nolan", 2008, genero));
        PeliculaDAO.create(new Pelicula("Avatar", "James Cameron", 2009, genero));
        PeliculaDAO.create(new Pelicula("Inception", "Christopher Nolan", 2010, genero));
        PeliculaDAO.create(new Pelicula("The Social Network", "David Fincher", 2010, genero));
        PeliculaDAO.create(new Pelicula("Parasite", "Bong Joon-ho", 2019, genero));
    }
}
