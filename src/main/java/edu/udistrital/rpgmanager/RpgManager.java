package edu.udistrital.rpgmanager;

import edu.udistrital.rpgmanager.controlador.PersonajeController;
import io.javalin.Javalin;

public class RpgManager {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);

        app.get("/personajes", PersonajeController::obtenerTodos);
        app.post("/personajes", PersonajeController::crear);

        System.out.println("Servidor corriendo en http://localhost:7070");
    }
}