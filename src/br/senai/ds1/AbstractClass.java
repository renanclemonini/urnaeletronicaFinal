/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.ds1;

/**
 *
 * @author Renan Clemonini
 */
public abstract class AbstractClass {
    
    private String nome;
    private String vice;
    private int numero;
    private String partido;
    private int votos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    public abstract void updateVoto();
    public abstract void resetVotos();

    @Override
    public String toString() {
        return "\n" + nome + ": " + votos + " votos válidos.";
    }
    
    
    
}
