/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Dionisio Antonio Bie
 */
public class ControleEstudante {
    private Vector<Estudante> estudantes;
    private int totalAlunos;

    Estudante estudante = new Estudante();

    public void Regista() {

        totalAlunos = Integer.parseInt(JOptionPane.showInputDialog(" deseja registar quantos alunos"));
        estudantes = new Vector<>(totalAlunos);
        for (int i = 0; i < totalAlunos; i++) {
            estudantes.add(i, new Estudante(JOptionPane.showInputDialog(" digite o nome"), buscaNotas(), mediaPorAluno(estudante.getNotas())));
            JOptionPane.showMessageDialog(null, " a media dele " + estudantes.get(i).getMedia());
        }
        JOptionPane.showMessageDialog(null, " media total dos alunos" + buscaMediaTotal());
    }

    /**
     * o metodo precorre todos elementos de um vector de estudantes soma a
     * medias de todos estudantes e divide pelo total de estudantes
     *
     * @return media
     */
    public double buscaMediaTotal() {
        double mediaTotal = 0;

        for (int i = 0; i < estudantes.capacity(); i++) {
            mediaTotal += estudantes.get(i).getMedia();
        }
        return mediaTotal = mediaTotal / totalAlunos;

    }

    /**
     * o metodo preenche as as tres notas correspondentes a cada estudante
     * registado
     *
     * @see Estudante
     * @return vector
     */
    public Vector buscaNotas() {
        estudante.getNotas().clear();

        for (int i = 0; i < 3; i++) {

            estudante.getNotas().add(i, (Double.parseDouble(JOptionPane.showInputDialog(" insira a  nota " + i))));
        }
        return estudante.getNotas();
    }

    /**
     * o presente metodo recebe um vector das notas de cada estudante retorna
     * media somando todas as notas e divide pelos total das notas
     *
     * @param notas
     * @return media
     */
    public double mediaPorAluno(Vector notas) {
        double media = 0;
        for (int i = 0; i < notas.capacity(); i++) {
            media += (Double) notas.elementAt(i);

        }
        return media / 3;
    }

    /**
     * o metodo percore todos elementos de vector de estudantes compara as as
     * medias de cada aluno adiciona em um outro vector o aluno com a melhor
     * media ou alunos caso a media conscida
     *
     * @return
     */
    public Vector buscaMelhores() {
        Estudante melhor = estudantes.firstElement();
        Vector<Estudante> melhores = new Vector<>();
        for (int i = 1; i < estudantes.capacity(); i++) {
            if (melhor.getMedia() < estudantes.get(i).getMedia()) {
                melhor = estudantes.get(i);
            }
        }
        melhores.add(melhor);
        return melhores;
    }

}
