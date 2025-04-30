package Hilos.Test;

import Hilos.Clase.*;

public class Test {
    public static void main(String[] args) {
        /*Persona p = new Persona();
        p.setNombre("Ariel Asqui");
        p.setFechaNacimiento("16 de septiembre del 2002");
        p.setDireccion("Quito, La Comuna");

        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Fecha de Nacimiento: "+p.getFechaNacimiento());
        System.out.println("Direccion: "+p.getDireccion());*/

        Runnable y = new ProcesoE("Hola como estas");
        Thread e = new Thread(y);
        ProcesoA a = new ProcesoA("Ariel");
        ProcesoB b = new ProcesoB(1000);
        ProcesoC c = new ProcesoC(9);
        //ProcesoD d = new ProcesoD(100);
        Runnable x = new ProcesoD(100);
        Thread d = new Thread(x);


        Runnable z = new ProcesoF();
        Thread f = new Thread(z);

        //c.dividir(5);
        //a.saludar("Ariel");
        //b.contar(10);

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();


    }
}
