package Ejercicio7a4;
//Hacer un programa que cree una clase Persona, con estos atributos: String nombre, int edad, String dni.
//Crear un constructor que de valores a los atributos, 
//métodos: void esMayorDeEdad() 
//int cuantoHaceMayorEdad() 
//boolean asignarDNI()no debe asignar el DNI si éste no es correcto (es correcto si tiene 9
//boolean estaJubilado() devuelve true o false dependiente de si la persona esta jubilada o no
//Se considera que una persona se jubila a los 65.
//Crear una clase Prueba que en su main cree varios objetos de Persona, consulte sus atributos, cambie el valor nuevamente de los atributos y pruebe sus métodos.

public class Persona {

    private String nombre;
    private int edad;
    private String dni;

    //Constructor
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void esMayordeEdad() {
        if (edad >= 18) {
            System.out.println(nombre + "Es mayor de edad");
        } else {
            System.out.println(nombre + "No es mayor de edad");
        }
    }

    public int cuantoHaceMayordeEdad() {
        if (edad >= 18) {
            return (edad - 18);
        } else {
            return 0;
        }
    }

    public boolean asignarDNI(String nuevoDNI) {
        if (dni.length() == 9) {
            dni = nuevoDNI;
            return true;
        } else {
            return false;
        }
    }

    public boolean estaJubilado() {
        if (edad >= 65) {
            System.out.println("La persona está jubilada: verdadero");
            return true;
        } else {
            System.out.println("La persona no está jubilada: falso");
            return false;
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
