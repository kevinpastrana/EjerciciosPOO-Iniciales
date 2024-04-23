package Ejercicio7a1;

public class Prueba {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        //Primer triangulo
        t1.setAltura(4);
        t1.setBase(5);
        System.out.println("\nTriangulo 1:");
        System.out.println("Base: " + t1.getBase());
        System.out.println("Altura: " + t1.getAltura());
        System.out.println("Área: " + t1.Area());

        //Segundo triangulo
        t2.setAltura(2);
        t2.setBase(4);
        System.out.println("\nTriangulo 2:");
        System.out.println("Base: " + t2.getBase());
        System.out.println("Altura: " + t2.getAltura());
        System.out.println("Área: " + t2.Area());

        //Cambiando valores
        //Primer triangulo
        t1.setBase(8);
        t1.setAltura(10);
        System.out.println("\nTriangulo 1 despues de cambiar el area y la base:");
        System.out.println("Base: " + t1.getBase());
        System.out.println("Altura: " + t1.getAltura());
        System.out.println("Área: " + t1.Area());

        //Segundo triangulo
        t2.setBase(4);
        t2.setAltura(8);
        System.out.println("\nTriangulo 2 despues de cambiar el are y la base:");
        System.out.println("Base: " + t2.getBase());
        System.out.println("Altura: " + t2.getAltura());
        System.out.println("Área: " + t2.Area());
    }
}
