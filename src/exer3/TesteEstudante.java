/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

import javax.swing.JOptionPane;

/**
 *
 * @author Dionisio Antonio Bie
 */
public class TesteEstudante {
     public static void main(String[] args) {
        ControleEstudante es= new ControleEstudante();
        es.Regista();
        JOptionPane.showMessageDialog(null,"melhores alunos"+ es.buscaMelhores());
    }
    
}
