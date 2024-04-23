package Ejercicia7a3;

public class Prueba {

    public static void main(String[] args) {
        //String titulo, String autor, int numdeLibros, int numdeLibrosPrestados)
        Libro libro1 = new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", 5, 0);
        Libro libro2 = new Libro("Satanas", "Mario Mendoza", 5, 0);

        System.out.println("======================");
        System.out.println("Libro 1");    
        System.out.println("TÍtulo del libro: " + libro1.getTitulo());
        System.out.println("Autor del libro: " + libro1.getAutor());
        System.out.println("Cuantos libros hay disponibles: " + libro1.getNumdeLibros());
        System.out.println("Prestar Libro 1\n" + libro1.prestar());
        System.out.println("Devolver Libro 1\n" + libro1.devolver());
        System.out.println("======================");
        System.out.println("");
        System.out.println("======================");
        System.out.println("Libro 2");    
        System.out.println("TÍtulo del libro: " + libro2.getTitulo());
        System.out.println("Autor del libro: " + libro2.getAutor());
        System.out.println("Cuantos libros hay disponibles: " + libro2.getNumdeLibros());
        System.out.println("Prestar Libro 2\n" + libro2.prestar());
        System.out.println("Devolver Libro 2\n" + libro2.devolver());
        System.out.println("======================");
        
    }
}
