package Dinamica;

import java.util.ArrayList;

public class SecOptima2022 {

    static void subcSuma0MaxElemAux(int[] v, boolean[] solucion, boolean[] mejorSolucion, int valor, Entero mejorvalor, int nivel, int suma) {

        if (nivel == v.length) {
            if ((valor > mejorvalor.getValor()) && (suma == 0)) {
                mejorvalor.setValor(valor);
                for (int i = 0; i < solucion.length; i++)
                    mejorSolucion[i] = solucion[i];

            }
        } else {
            int c = 0;
            while (c < 2) {
                solucion[nivel] = (c == 1);
                suma = suma + (v[nivel] * c);
                valor = valor + c;
                nivel += 1;
                subcSuma0MaxElemAux(v, solucion, mejorSolucion, valor, mejorvalor, nivel, suma);
                nivel--;
                valor = valor - c;
                suma -= v[nivel] * c;
                solucion[nivel] = false;
                c++;
            }

        }
    }

    public static boolean[] subcSuma0MaxElemA(int[] v) {

        boolean[] solucion = new boolean[v.length];
        boolean[] mejorSolucion = new boolean[v.length];

        for (int i = 0; i < solucion.length; i++) {
            solucion[i] = true;
            mejorSolucion[i] = true;
        }

        int valor = 0;
        Entero mejorValor = new Entero(0);
        int nivel = 0;
        int suma = 0;

        subcSuma0MaxElemAux(v, solucion, mejorSolucion, valor, mejorValor, nivel, suma);

        return mejorSolucion;
    }

    public static void main(String[] args) {

        int[] vector = {-4, 3, 5, -5, 0, 1, 8, 10, -21};


        boolean[] miarray = subcSuma0MaxElemA(vector);

        for (int i = 0; i < vector.length; i++)
            if(vector[i]>=0) {
                if (vector[i] > 9)
                    System.out.print("[ " + vector[i] + "]" + " ");
                else System.out.print("[ " + vector[i] + " ]" + " ");
            }
            else {
                if(vector[i]<-9)
                    System.out.print("[" + vector[i] +"]"+ " ");
                else System.out.print("[ " + vector[i] +"]"+ " ");
            }

        System.out.println(" ");

        for (int i = 0; i < vector.length; i++)

            if(miarray[i])
                System.out.print("[ T ] ");
            else System.out.print("[ F ] ");


    }


}
