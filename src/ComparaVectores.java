
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dionisio Antonio Bie
 */
public class ComparaVectores {
     /**
     * o metodo recebe dos vectores prenchidos de elementos booleanos compara o
     * tamanho dos mesmos caso conscida compara os elemento por elemento em cada
     * vector se todos elementos forem iguais retorna true caso contrario false
     *
     * @param vector1
     * @param vector2
     * @return
     */
    public boolean compara(Vector<Boolean> vector1, Vector<Boolean> vector2) {
        boolean verifica = true;
        if (vector1.capacity() == vector2.capacity()) {
            for (int i = 0; i < vector1.capacity(); i++) {
                if (vector1.get(i) != (vector2.get(i))) {
                    verifica = false;
                }
            }
        } else {
            return false;
        }
        return verifica;
    }

    public static void main(String[] args) {
        ComparaVectores v = new ComparaVectores();
        Vector<Boolean> vect1 = new Vector<>(4);
        Vector<Boolean> vect2 = new Vector<>(4);
        vect1.add(false);
        vect1.add(false);
        vect1.add(false);
        vect1.add(false);

        vect2.add(false);
        vect2.add(true);
        vect2.add(false);
        vect2.add(false);
       
        System.out.println(" sao iguas ? " + v.compara(vect1, vect2));

    }
    
}
