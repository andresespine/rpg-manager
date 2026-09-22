package edu.udistrital.rpgmanager.servicio;

import edu.udistrital.rpgmanager.modelo.Personaje;

public class PersonajeServicio {

    public static boolean esValido(Personaje personaje) {
        if (personaje.getNombre() == null || personaje.getNombre().trim().isEmpty()) {
            return false;
        }

        if (personaje.getNivel() < 1 || personaje.getNivel() > 100) {
            return false;
        }

        String clase = personaje.getClase();
        if (clase == null ||
            !(clase.equals("Guerrero") || clase.equals("Mago") || clase.equals("Arquero"))) {
            return false;
        }

        return true;
    }
}