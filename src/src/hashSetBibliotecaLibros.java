
// BibliotecaLibros.java


import java.util.HashSet;

public class hashSetBibliotecaLibros {

    public static void ejecutar() {

        System.out.println("----- BIBLIOTECA -----");

        HashSet<String> libros = new HashSet<>();

        agregarLibro(libros, "El Principito");
        agregarLibro(libros, "Don Quijote");
        agregarLibro(libros, "Cien años de soledad");
        agregarLibro(libros, "El Principito");

        mostrarLibros(libros);

        verificarLibro(libros, "Don Quijote");

        System.out.println("Total únicos: " + libros.size() + "\n");
    }

    public static void agregarLibro(HashSet<String> libros, String libro) {
        libros.add(libro);
    }

    public static void mostrarLibros(HashSet<String> libros) {
        for (String libro : libros) {
            System.out.println("- " + libro);
        }
    }

    public static void verificarLibro(HashSet<String> libros, String libro) {
        if (libros.contains(libro)) {
            System.out.println(libro + " disponible");
        } else {
            System.out.println(libro + " no disponible");
        }
    }
}