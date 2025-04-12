package sk.tmconsulting.gui.prepojenetriedy;

// MainApp.java
import javax.swing.*;
import java.awt.event.*;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Appka");
        JButton button = new JButton("Zobraz údaje");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Vytvorenie objektu z druhej triedy
                Person osoba = new Person("Ján Novák", 45);

                // Zobrazenie údajov v popup okne
                JOptionPane.showMessageDialog(frame, osoba.getInfo(), "Údaje o osobe", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.getContentPane().add(button);
        frame.setLocationRelativeTo(null); // centrovanie okna
        frame.setVisible(true);
    }
}

