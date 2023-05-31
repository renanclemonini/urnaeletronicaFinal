package br.senai.ds1;

/**
 *
 * @author Renan Clemonini
 */
public class Candidato extends AbstractClass implements Comparable<Candidato>{
    
    public Candidato() {
    }

    public Candidato(String nome, String vice, int numero, String partido) {
        setNome(nome);
        setVice(vice);
        setNumero(numero);
        setPartido(partido);
        setVotos(0);
    }
    
    public Candidato(String nome){
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

    @Override
    public int compareTo(Candidato o) {
        if(getVotos() < o.getVotos()){
            return 1;
        }
        if(getVotos() > o.getVotos()){
            return -1;
        }
        return 0;
    }
    
    
    
}
