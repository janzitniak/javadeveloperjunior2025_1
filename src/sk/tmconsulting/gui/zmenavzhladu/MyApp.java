package sk.tmconsulting.gui.zmenavzhladu;

import javax.swing.*;

public class MyApp {
    public static void main(String[] args) {
        try {
            // Nastavenie Nimbus vzhľadu
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Motif".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // fallback ak sa nepodarí
            e.printStackTrace();
        }


/*        try {
            // Automaticky nastaví natívny vzhľad podľa OS
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        // Teraz môžeme vytvoriť GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Moja aplikácia");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.add(new JButton("Klikni ma"));
            frame.setLocationRelativeTo(null); // centrovanie okna
            frame.setVisible(true);
        });
    }
}

