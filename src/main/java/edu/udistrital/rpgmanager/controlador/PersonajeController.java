package edu.udistrital.rpgmanager.controlador;

import edu.udistrital.rpgmanager.modelo.Personaje;
import edu.udistrital.rpgmanager.modelo.PersonajeRepository;
import io.javalin.http.Context;

public class PersonajeController {

    public static void obtenerTodos(Context ctx) {
        ctx.json(PersonajeRepository.obtenerPersonajes());
    }

    public static void crear(Context ctx) {
        Personaje nuevoPersonaje = ctx.bodyAsClass(Personaje.class);
        PersonajeRepository.agregarPersonaje(nuevoPersonaje);
        ctx.json(nuevoPersonaje);
    }
}