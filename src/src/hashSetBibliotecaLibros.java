
//2. BibliotecaLibros.java


import java.util.HashSet;

public class hashSetBibliotecaLibros {

    public static void main(String[] args) {

        HashSet<String> libros = new HashSet<>();

        agregarLibro(libros, "El Principito");
        agregarLibro(libros, "Don Quijote");
        agregarLibro(libros, "Cien años de soledad");
        agregarLibro(libros, "El Principito"); // duplicado

        mostrarLibros(libros);

        verificarLibro(libros, "Don Quijote");

        System.out.println("Total libros únicos: " + libros.size());
    }

    public static void agregarLibro(HashSet<String> libros, String libro) {
        libros.add(libro);
    }

    public static void mostrarLibros(HashSet<String> libros) {
        System.out.println("\nLibros disponibles:");
        for (String libro : libros) {
            System.out.println("- " + libro);
        }
    }

    public static void verificarLibro(HashSet<String> libros, String libro) {
        if (libros.contains(libro)) {
            System.out.println(libro + " sí está disponible.");
        } else {
            System.out.println(libro + " no está disponible.");
        }
    }
}