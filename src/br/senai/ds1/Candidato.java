/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.ds1;

/**
 *
 * @author rclem
 */
public class Candidato extends AbstractClass {
    
    public Candidato() {
    }

    public Candidato(String nome, String vice, int numero, String partido) {
        setNome(nome);
        setVice(vice);
        setNumero(numero);
        setPartido(partido);
        setVotos(0);
    }
    
    public Candidato(String nome, int votos){
        setNome(nome);
        setVotos(0);
    }

    @Override
    public void updateVoto() {
        setVotos(getVotos()+1);
    }

    @Override
    public void resetVotos() {
        setVotos(0);
    }
    
    
    
}
