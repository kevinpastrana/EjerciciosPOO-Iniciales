package Ejercicio7a2;
//Implementar una clase Moto para que la guardamos la velocidad. Tendremos dos métodos uno para
//acelerar (aumentamos su velocidad en una cantidad variable) y otro para frenar (disminuimos la
//velocidad en una cantidad variable). Generar una clase con un main y crear una moto, y acelerarla y
//frenarla para probar la clase.
//MEJORA 1: Hay que controlar que la moto no puede tener una velocidad negativa ni tener una
//velocidad superior a 150

public class Moto {
    //Asignamos variable
    private int velocidad;

    //Constructor
    public Moto() {
        this.velocidad = 0; //Velocidad inicial
    }

    //Método para acelerar la moto
    public void Acelerar(int cantidad) {
        int nuevaVelocidad = this.velocidad + cantidad;     
        if (nuevaVelocidad <= 150) {
            this.velocidad = nuevaVelocidad;
            System.out.println("La moto ha acelerado a " + this.velocidad + " km/h.");
        } else {
            System.out.println("La moto no puede acelerar más de 150 km/h.");
        }
    }

    //Método para frenar la moto
    public void Frenar(int cantidad) {
        int nuevaVelocidad = this.velocidad - cantidad;
        if (nuevaVelocidad >= 0) { //Cumple con que no sea negativo
            this.velocidad = nuevaVelocidad;
            System.out.println("La moto ha frenado a " + this.velocidad + " km/h.");
        } else {
            System.out.println("La moto no puede frenar más, su velocidad es 0 km/h.");
            this.velocidad = 0;
        }
    }

    //Método getter para obtener la velocidad actual de la moto
    public int getVelocidad() {
        return velocidad;
    }
}