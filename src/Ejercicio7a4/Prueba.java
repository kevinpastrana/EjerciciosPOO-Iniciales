package Ejercicio7a4;

public class Prueba {

    public static void main(String[] args) {
        Persona p1 = new Persona("Kevin Felipe Pastrana Soto", 20, "123456789");
        Persona p2 = new Persona("David Rodriguez Jorda Kilates", 69, "987654321");

        System.out.println("======================");
        System.out.println("1. Primera persona:");
        System.out.println("Nombre completo: " + p1.getNombre());
        System.out.println("DNI: " + p1.getDni());
        System.out.println("¿Que edad tiene?: " + p1.getEdad() + " años");
        System.out.println("¿Hace cuanto es mayor de edad?: " + "Hace " + p1.cuantoHaceMayordeEdad() + " años");
        System.out.println("¿Se encuentra jubilado?: " + p1.estaJubilado());
        System.out.println("======================");
        System.out.println("");
        System.out.println("======================");
        System.out.println("2. Segunda persona:");
        System.out.println("Nombre completo: " + p2.getNombre());
        System.out.println("DNI: " + p2.getDni());
        System.out.println("¿Que edad tiene?: " + p2.getEdad() + " años");
        System.out.println("¿Hace cuanto es mayor de edad?: " + "Hace " + p2.cuantoHaceMayordeEdad() + " años");
        System.out.println("¿Se encuentra jubilado?: " + p2.estaJubilado());
        System.out.println("======================");
        System.out.println("");

        //Cambiar valores
        p1.setEdad(25);
        p1.setDni("555554321");
        p2.setNombre("Julio Andres Emilio Moles");
        p2.setEdad(55);

        //Consultar los atributos actualizados
        System.out.println("======================");
        System.out.println("Datos actualizados de la primera persona:");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("DNI: " + p1.getDni());
        System.out.println("¿Hace cuanto es mayor de edad?: " + "Hace " + p1.cuantoHaceMayordeEdad() + " años");
        System.out.println("¿Se encuentra jubilado?: " + p1.estaJubilado());
        System.out.println("======================");
        System.out.println("");
        System.out.println("======================");
        System.out.println("Datos actualizados de la segunda persona:");
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Edad: " + p2.getEdad());
        System.out.println("DNI: " + p2.getDni());
        System.out.println("¿Hace cuanto es mayor de edad?: " + "Hace " + p2.cuantoHaceMayordeEdad() + " años");
        System.out.println("¿Se encuentra jubilado?: " + p2.estaJubilado());
        System.out.println("======================");

    }
}
