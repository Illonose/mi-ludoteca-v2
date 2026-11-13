package presentacion;

import dominio.Ludoteca;
import dominio.Videojuego;
import dominio.VideojuegoDeportivo;
import dominio.VideojuegoEstrategia;
import dominio.VideojuegoOnline;
import dominio.VideojuegoRol;

public class Main {

    public static void main(String[] args) {
        Ludoteca ludoteca = new Ludoteca();

        System.out.println("=== Ludoteca vacía ===");
        System.out.println("[" + ludoteca + "]");

        Videojuego zelda = new Videojuego("Zelda: Tears of the Kingdom", "Switch", 10);
        Videojuego hades = new Videojuego("Hades", "PC", 9);
        Videojuego minecraft = new Videojuego("Minecraft", "PC", 8);

        ludoteca.agregar(zelda);
        ludoteca.agregar(hades);
        ludoteca.agregar(minecraft);

        System.out.println("\n=== Contenido de la ludoteca ===");
        System.out.print(ludoteca);

        System.out.println("\n=== Búsquedas ===");
        mostrarBusqueda(ludoteca, "Hades");
        mostrarBusqueda(ludoteca, "Tetris");

        System.out.println("\n=== Eliminación (ampliación) ===");
        System.out.println("¿Eliminado \"Hades\"? " + ludoteca.eliminarPorTitulo("Hades"));
        System.out.println("¿Eliminado \"Tetris\"? " + ludoteca.eliminarPorTitulo("Tetris"));
        System.out.print(ludoteca);

        System.out.println("\nEl objeto hades sigue existiendo: " + hades);

        VideojuegoDeportivo Fifa = new VideojuegoDeportivo("Fifa", "pc", 100, "Futbol");
        VideojuegoEstrategia Ajedrez = new VideojuegoEstrategia("Ajedrez","tablero", 70, 10);
        VideojuegoOnline AlbionOnline = new VideojuegoOnline("AlbionOnline", "pc", 100, 50000);
        VideojuegoRol WoW = new VideojuegoRol("WoW", "pc", 100, 50);

        ludoteca.agregar(WoW);
        ludoteca.agregar(Fifa);
        ludoteca.agregar(Ajedrez);
        ludoteca.agregar(AlbionOnline);

        System.out.println("=== Contenido de la ludoteca ===");
        System.out.print(ludoteca);


    }

    private static void mostrarBusqueda(Ludoteca ludoteca, String titulo) {
        Videojuego encontrado = ludoteca.buscarPorTitulo(titulo);
        if (encontrado != null) {
            System.out.println("Buscar \"" + titulo + "\": encontrado -> " + encontrado);
        } else {
            System.out.println("Buscar \"" + titulo + "\": no existe en la ludoteca");
        }
    }
}