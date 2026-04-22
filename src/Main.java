import ResistenciaF.Resistencia;
import ResistenciaF.*;
import javax.swing.*;

public class Main {
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> {
        Resistencia ui = new Resistencia();
        JFrame frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(ui.getpanel());
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        });
    }
}
