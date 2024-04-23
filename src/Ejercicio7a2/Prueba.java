package Ejercicio7a2;


public class Prueba {
    public static void main(String[] args) {
        Moto miMoto = new Moto();

        System.out.println("Velocidad inicial de la moto: " + miMoto.getVelocidad() + " km/h");
        System.out.println("");

        // Acelerar la moto
        miMoto.Acelerar(100);
        System.out.println("Velocidad actual de la moto: " + miMoto.getVelocidad() + " km/h");
        System.out.println("");
        
        // Frenar la moto
        miMoto.Frenar(50);
        System.out.println("Velocidad actual de la moto: " + miMoto.getVelocidad() + " km/h");
        System.out.println("");

        // Intentar acelerar más allá del límite
        miMoto.Acelerar(100);
        System.out.println("Velocidad actual de la moto: " + miMoto.getVelocidad() + " km/h");        
    }
}
