package br.senai.ds1;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Renan Clemonini
 */
public interface UrnaInterface {
    
    public void setNumero(JButton btn);
    public void addCandidatoLista();
    public void addVotoValido(Candidato candidato);
    public void reiniciarVotacao();
    public void restartVotacao();
    public void setExibicao();
    public void setNumeroCandidato();
    public void setVotoConfirm();
    public void setExibicaoInicial();
    public void showPopMenu(MouseEvent e);
    public void popUpTrigger(MouseEvent evt);
    public void setEnter(KeyEvent evt);
    public void enterConfirma(KeyEvent evt);
    public void apuracaoTela();
    public void apuracaoConsole();
}
