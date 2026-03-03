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
        //1. Creación de géneros
        Genero terror = new Genero("Terror");
        GeneroDAO.create(terror);

        //2. Creación de película
        Pelicula elResplandor = new Pelicula("El Replandor", "Kubrick", 1978, terror);
        PeliculaDAO.create(elResplandor);

        SessionManager.finishSession();
    }
}
