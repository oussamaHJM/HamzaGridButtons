import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutEg extends JPanel {
    private static final int ROWS = 8;
    private static final int COLS = 8;

    public GridLayoutEg() {
        setLayout(new GridLayout(ROWS, COLS)); // set JPanel's layout
        JButton button = new JButton();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                button = new JButton();
                button.setOpaque(false);
                button.setContentAreaFilled(false);
                add(button);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    private static void createAndShowGui() {
        GridLayoutEg mainPanel = new GridLayoutEg();
        JFrame frame = new JFrame("GridLayoutEg");
        //Si vous voulez ajouter la background du panel
        /*ImageIcon icon = new ImageIcon("URL DE L'IMAGE");
        JLabel thumb = new JLabel();
        thumb.setIcon(icon);*/
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }


}