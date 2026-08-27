package edu.udistrital.rpgmanager.modelo;

import java.util.ArrayList;

public class PersonajeRepository {

    private static ArrayList<Personaje> personajes = new ArrayList<>();

    public static ArrayList<Personaje> obtenerPersonajes() {
        return personajes;
    }

    public static void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}