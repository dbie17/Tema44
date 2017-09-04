/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author Dionisio Antonio Bie
 */
public class Estatistica {
    private double moda;
    Vector<Integer> valores;

    /**
     * o metodo recebe recebe um vector prenchido numeros inteiros e o tamanhos
     * do mesmo soma todos elementos do vector e divide pelo seu tamanho retorna
     * a media
     *@Dionisio Bie
     * @param vector
     * @param numero
     *
     */
    private static double media(Vector<Integer> vector, int numero) {
        double media = 0;
        numero = vector.capacity();
        for (int i = 0; i < numero; i++) {
            media = media + vector.get(i);
        }
        return media / numero;
    }

    /**
     * O metodo recebe um vector prenchido de numeros inteiros Oredena os
     * elementos de forma crescente Retorna a mediana que e o lemento que
     * ecncontra no meio do vector
     *
     * @param vector
     * @param numero
     *
     */
    private static double mediana(Vector<Integer> vector, int numero) {
        int inicio = 0;
        int fim = vector.capacity() - 1;
        double mediana;

        Collections.sort(vector);

        return mediana = vector.elementAt((inicio + fim) / 2);
    }
/** o metodo recebe um vector prenchidos de numeros inteiros
 * retorna o valor mais repetido no vector
 * 
 * @param vector
 * @param numero
 * @return 
 */
    private static int moda(Vector<Integer> vector, int numero) {
        int vezes;
       
        int compara = 0;
        int moda = 0;

        numero = vector.capacity();

        for (int i = 0; i < numero ; i++) {
            vezes = 0;
            for (int j = i + 1; j < numero ; j++) {
                if (vector.get(i).equals(vector.get(j))) {
                    vezes++;

                }

            }

            if (vezes > compara) {
                moda = vector.get(i);
                compara = vezes;

            }

        }

        return moda;
    }

    public static void main(String[] args) {
        Estatistica e = new Estatistica();
        e.valores = new Vector<>(6);
        e.valores.add(20);
        e.valores.add(9);
        e.valores.add(16);
        e.valores.add(12);
        e.valores.add(12);
        e.valores.add(12);
        System.out.println(" a media dos valores inseridos e " + media(e.valores, 0));
        System.out.println(" a mediana dos valores inseridos e " + mediana(e.valores, 0));
        System.out.println(" a moda dos valores inseridos e " + moda(e.valores, 0));
    }
    
}
