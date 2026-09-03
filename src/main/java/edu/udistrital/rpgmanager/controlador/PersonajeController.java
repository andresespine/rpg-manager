package edu.udistrital.rpgmanager.controlador;

import edu.udistrital.rpgmanager.modelo.Personaje;
import edu.udistrital.rpgmanager.modelo.PersonajeRepository;
import io.javalin.http.Context;

public class PersonajeController {

    public static void obtenerTodos(Context ctx) {
        ctx.json(PersonajeRepository.obtenerPersonajes());
    }

    public static void crear(Context ctx) {
        // 1. Leer los datos enviados por el formulario HTML
        String nombre = ctx.formParam("nombre");
        String clase = ctx.formParam("clase");
        int nivel = Integer.parseInt(ctx.formParam("nivel"));
        
        // 2. Definir una vida base por defecto
        int vidaInicial = 100;

        // 3. Crear el objeto Personaje con sus 4 atributos
        Personaje nuevoPersonaje = new Personaje(nombre, clase, nivel, vidaInicial);
        
        // 4. Guardarlo en el repositorio
        PersonajeRepository.agregarPersonaje(nuevoPersonaje);

        // 5. Redirigir de vuelta a la página principal
        ctx.redirect("/");
    }
}