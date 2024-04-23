package Ejercicio7a5;
//Construir una clase llamada Semáforo que simule un semáforo; 
//tiene un un atributo color, y un método cambio() que cada vez que se llama, 
//cambia el atributo color entre verde, amarillo y rojo en
//ese orden, y además, escribe en consola el nuevo color que tiene.
//Cuando un objeto Semáforo se crea, su color inicial debe ser rojo.
//Crear una clase Prueba que en su main creen objeto de Semáforo y pruebe su método cambio() varias veces.

public class Semaforo {

    private String color; //Atributo

    //Constructor
    public Semaforo(String color) { //Color inicial rojo
        this.color = "Rojo";
    }

    public void Cambiar() {
        color = switch (color) {
            case "Rojo" ->
                "Amarillo";
            case "Amarillo" ->
                "Verde";
            default ->
                "Rojo";
        };
        System.out.println("El color de semaforo ha cambiado: " + color);
    }
}
