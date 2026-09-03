package edu.udistrital.rpgmanager;

// 1. Importar la librería de Javalin
import io.javalin.Javalin;

// 2. Importar tu controlador desde el paquete controlador
import edu.udistrital.rpgmanager.controlador.PersonajeController;

public class RpgManager {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public");
        }).start(7071);

        app.get("/personajes", PersonajeController::obtenerTodos);
        app.post("/personajes", PersonajeController::crear);

        System.out.println("Servidor corriendo en http://localhost:7071");
    }
}