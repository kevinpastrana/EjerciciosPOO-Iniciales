package Ejercicio7a1;
//Crear una clase Triangulo que representa un triángulo equilátero, con los atributos enteros base y
//altura. Crear métodos para dar valor y poder consultar los atributos, un método constructor, y un
//método para calcular el área del triángulo. Crear una clase Prueba que en su main cree varios objetos de Triángulo, 
//consulte sus atributos, cambie el valor nuevamente de los atributos y pruebe su método.

public class Triangulo {

    int base;
    int altura;

    //Constrcutor
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(int lado, int altura) {
        this.base = lado;
        this.altura = (int) (lado * altura);
    }

    //Getter
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    //Setter
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Metodo para calcular el area del triangulo
    public double Area() {
        return (base * altura) / 2;
    }

}
