package Ejercicia7a3;
//Crea una clase llamada Libro
//La clase debe guardar el título del libro, autor/a, número de ejemplares del libro (número de
//ejemplares totales de un determinado libro) y número de ejemplares prestados (irá cambiando a
//medida que prestamos/devolvemos libros). métodos:
//- Constructor por defecto. - Constructor con parámetros.
//- Métodos setters/getters.
//- Método prestar() que incremente el atributo correspondiente cada vez que se realice un préstamo
//del libro. 
//Devuelve true si se ha podido realizar la operación y false en caso contrario.
//- Método devolver() que decrementa el atributo correspondiente cuando se produzca la devolución
//de un libro.  Devuelve true si se ha podido realizar la operación y false en caso contrario.
//Una vez creada la clase, escribe una clase LibroMain.java con un método main, crea 2 libros y ejecuta
//las operaciones disponibles para probar la funcionalidad de la clase. 

public class Libro {

    private String titulo;
    private String autor;
    private int numdeLibros;
    private int numdeLibrosPrestados;

    //Constructor
    public Libro(String titulo, String autor, int numdeLibros, int numdeLibrosPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numdeLibros = numdeLibros;
        this.numdeLibrosPrestados = numdeLibrosPrestados;
    }

    //Getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumdeLibros() {
        return numdeLibros;
    }

    public int getNumdeLibrosPrestados() {
        return numdeLibrosPrestados;
    }

    //Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumdeLibros(int numdeLibros) {
        this.numdeLibros = numdeLibros;
    }

    public void setNumdeLibrosPrestados(int numdeLibrosPrestados) {
        this.numdeLibrosPrestados = numdeLibrosPrestados;
    }

    //Metodo prestar
    public boolean prestar() {
        if (numdeLibros > numdeLibrosPrestados) {
            numdeLibrosPrestados++;
            return true;
        } else {
            return false;
        }
    }

    //Metodo devolver
    public boolean devolver() {
        if (numdeLibrosPrestados > 0) {
            numdeLibrosPrestados--;
            return true;
        } else {
            return false;
        }
    }
}
