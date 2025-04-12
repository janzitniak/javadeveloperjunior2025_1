package sk.tmconsulting.gui.zmenavzhladu;

import javax.swing.*;
import java.awt.*;

public class LayoutSwitcher {

    public static void main(String[] args) {
        // Spustenie GUI na Event Dispatch Thread (bezpečný spôsob práce so Swingom)
        SwingUtilities.invokeLater(() -> new LayoutSwitcher().createAndShowGUI());
    }

    private void createAndShowGUI() {
        // Vytvorenie hlavného okna
        JFrame frame = new JFrame("Swing Layout Switcher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);  // Rozmery okna

        // Hlavný panel, kam budeme vkladať tlačidlá podľa zvoleného layoutu
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel, BorderLayout.CENTER);  // Umiestnenie doprostred okna

        // Horný panel s rozbaľovacím menu (ComboBox) na výber layoutu
        JPanel topPanel = new JPanel(new FlowLayout());
        String[] layouts = {"FlowLayout", "BorderLayout", "GridLayout", "BoxLayout", "GridBagLayout", "NullLayout"};
        JComboBox<String> layoutChooser = new JComboBox<>(layouts);
        topPanel.add(new JLabel("Zvoľ Layout:"));   // Popis
        topPanel.add(layoutChooser);                // Výber layoutu
        frame.add(topPanel, BorderLayout.NORTH);    // Umiestnenie navrch

        // Reakcia na zmenu výberu v ComboBoxe
        layoutChooser.addActionListener(e -> {
            String selected = (String) layoutChooser.getSelectedItem();  // Zvolený layout
            updateLayout(mainPanel, selected);       // Aktualizuj hlavný panel podľa výberu
            mainPanel.revalidate();                  // Preráta rozloženie
            mainPanel.repaint();                     // Prekreslí panel
        });

        // Prvý výber pri spustení aplikácie
        updateLayout(mainPanel, "FlowLayout");

        // Centrovanie okna
        frame.setLocationRelativeTo(null);

        // Zobrazí celé okno
        frame.setVisible(true);
    }

    // Metóda na aktualizáciu layoutu a pridanie príslušných tlačidiel
    private void updateLayout(JPanel panel, String layoutName) {
        panel.removeAll();  // Vymaže všetky staré komponenty z panelu

        switch (layoutName) {
            case "FlowLayout":
                // Predvolený jednoduchý layout (zľava doprava)
                panel.setLayout(new FlowLayout());
                panel.add(new JButton("A"));
                panel.add(new JButton("B"));
                panel.add(new JButton("C"));
                break;

            case "BorderLayout":
                // 5 oblastí: NORTH, SOUTH, WEST, EAST, CENTER
                panel.setLayout(new BorderLayout());
                panel.add(new JButton("Sever"), BorderLayout.NORTH);
                panel.add(new JButton("Sever2"), BorderLayout.NORTH);
                panel.add(new JButton("Juh"), BorderLayout.SOUTH);
                panel.add(new JButton("Západ"), BorderLayout.WEST);
                panel.add(new JButton("Východ"), BorderLayout.EAST);
                panel.add(new JButton("Stred"), BorderLayout.CENTER);
                break;

            case "GridLayout":
                // Mriežka: 2 riadky, 2 stĺpce
                panel.setLayout(new GridLayout(1, 1));
                panel.add(new JButton("1"));
                panel.add(new JButton("2"));
                panel.add(new JButton("3"));
                panel.add(new JButton("4"));
                panel.add(new JButton("5"));
                break;

            case "BoxLayout":
                // Zvislé usporiadanie komponentov
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.add(new JButton("Hore"));
                panel.add(Box.createVerticalStrut(10));  // Medzera
                panel.add(new JButton("Nižšie"));
                break;

            case "GridBagLayout":
                // Flexibilné usporiadanie pomocou GridBagConstraints
                panel.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(5, 5, 5, 5);  // Medzery okolo tlačidiel

                gbc.gridx = 0;
                gbc.gridy = 0;
                panel.add(new JButton("0,0"), gbc);

                gbc.gridx = 1;
                gbc.gridy = 0;
                panel.add(new JButton("1,0"), gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                panel.add(new JButton("0,1"), gbc);

                gbc.gridx = 1;
                gbc.gridy = 1;
                panel.add(new JButton("1,1"), gbc);
                break;

            case "NullLayout":
                panel.setLayout(null);  // Vypneme LayoutManager

                JButton b1 = new JButton("Vľavo hore");
                b1.setBounds(10, 10, 120, 30);
                panel.add(b1);

                JButton b2 = new JButton("V strede");
                b2.setBounds(150, 80, 100, 40);
                panel.add(b2);

                JButton b3 = new JButton("Vpravo dole");
                b3.setBounds(250, 180, 120, 30);
                panel.add(b3);
                break;
        }
    }
}