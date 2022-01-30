package question2;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 * Décrivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class JButtonObserver implements ActionListener{ // à compléter

    private String nom;
    private TextArea contenu;

    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }
  
    public void actionPerformed(ActionEvent ae) {
        JButton button = (JButton) ae.getSource();
        String message = "observateur " + nom + " : clic du bouton "+button.getText();
        contenu.append(message + "\n");
    }

}

