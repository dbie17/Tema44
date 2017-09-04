/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

import java.util.Vector;

/**
 *
 * @author Dionisio Antonio Bie
 */
public class Estudante {
    private String nome;
    private Vector<Double> notas;
    private  double  media;

    /**
     *
     * @param nome
     * @param notas
     * @param media
     */
    
    public Estudante() {
        notas = new Vector(3);
    }

    public Estudante(String nome, Vector<Double> notas,double media) {
        this.nome = nome;
        this.notas = notas;
        this.media= media;
        
       
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the notas
     */
    public Vector<Double> getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(Vector<Double> notas) {
        this.notas = notas;
    }

    /**
     * @return the media
     */
    public double getMedia() {
         
         return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }

 public String toString(){

return "Nome:" + this.getNome() +" tem Media: "+ this.getMedia();

}
}
