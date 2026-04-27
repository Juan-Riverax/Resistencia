package ResistenciaF;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resistencia {
    private JCheckBox a5BandsCheckBox;
    private JComboBox<Colores> box1;
    private JComboBox<Colores> box2;
    private JComboBox<Colores> box3;
    private JComboBox<Colores> box4;
    private JComboBox<Colores> box5;
    private JPanel panel;
    private JLabel band1;
    private JLabel maximo;
    private JLabel minimo;
    private JLabel band2;
    private JLabel band3;
    private JLabel band4;
    private JLabel toti;

    public Resistencia () {
        box1.setModel(new DefaultComboBoxModel<>(Colores.values()));
        box2.setModel(new DefaultComboBoxModel<>(Colores.values()));
        box3.setModel(new DefaultComboBoxModel<>(Colores.values()));
        box4.setModel(new DefaultComboBoxModel<>(Colores.values()));
        box5.setModel(new DefaultComboBoxModel<>(Colores.values()));

        box1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colores valor = (Colores) box1.getSelectedItem();
                int banda1=0;
                switch (valor){
                    case Negro: banda1 = 0; break;
                    case Cafe:  banda1 = 10; break;
                    case Rojo: banda1 = 20; break;
                    case Naranja: banda1 = 30; break;
                    case Amarillo: banda1 = 40; break;
                    case Verde: banda1 = 50; break;
                    case Azul: banda1 = 60; break;
                    case Violeta: banda1 = 70; break;
                    case Gris: banda1 =  80; break;
                    case Blanco: banda1 = 90; break;
                }
                band1.setText(String.valueOf(banda1));
            }
        });
        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colores valor = (Colores) box2.getSelectedItem();
                int banda2=0;
                switch (valor){
                    case Negro: banda2 = 0; break;
                    case Cafe:  banda2 = 1; break;
                    case Rojo: banda2 = 2; break;
                    case Naranja: banda2 = 3; break;
                    case Amarillo: banda2 = 4; break;
                    case Verde: banda2 = 5; break;
                    case Azul: banda2 = 6; break;
                    case Violeta: banda2 = 7; break;
                    case Gris: banda2 =  8; break;
                    case Blanco: banda2 = 9; break;
                }
            band2.setText(String.valueOf(banda2));
            }
        });
        box3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colores valor = (Colores) box2.getSelectedItem();
                int banda3=0;
                switch (valor){
                    case Negro: banda3 = 1; break;
                    case Cafe:  banda3 = 10; break;
                    case Rojo: banda3 = 100; break;
                    case Naranja: banda3 = 1000; break;
                    case Amarillo: banda3 = 10000; break;
                    case Verde: banda3 = 100000; break;
                    case Azul: banda3 = 1000000; break;
                    case Violeta: banda3 = 10000000; break;
                    case Gris: banda3 =  100000000; break;
                    case Blanco: banda3 = 1000000000; break;
            }
        band3.setText(String.valueOf(banda3));
        }});


        box4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getpanel(){
        return panel;
    }
}