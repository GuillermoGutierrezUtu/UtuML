package javaapplication3;

import java.util.*;

public class JavaApplication3 {

    public static void main(String[] args) {

        ArrayList<Integer> ci = new ArrayList<Integer>();
        ci.add(55394567);
        System.out.println("Cedula ingresada: " + ci.get(0));
        Scanner Scanner = new Scanner(System.in);
        int cedula;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su cedula: ");
            cedula = Scanner.nextInt();
            ci.add(cedula);
        }

        for (int i = 0; i < ci.size(); i++) {
            System.out.println(" Cedula ingresada " + ci.get(i));
        }

    }
}
