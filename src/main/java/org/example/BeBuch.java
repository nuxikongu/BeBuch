package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeBuch extends JFrame {
    private JComboBox comboBoxUmschlag;
    private JComboBox comboBoxFarbe;
    private JTextField textFieldSeiten;
    private JTextArea textAreaBestellung;
    private JCheckBox checkBoxPlanung;
    private JCheckBox checkBoxNotiz;
    private JButton speichernButton;
    private JButton abbrechenButton;
    private JPanel frame;
    private JTextField textFieldGesamtpreis;
    private JTextField textFieldNotizen;
    private JTextField textFieldName;
    private JComboBox<String> comboBoxBestDesign;

    public BeBuch() {
        setTitle("BeBuch");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 600);
        setContentPane(frame);
        setVisible(true);
        setResizable(false);
        initObjekte(comboBoxBestDesign);}

     private void initObjekte (JComboBox < String > comboBoxBestDesign) {
            //BestDesign
            comboBoxBestDesign.addItem("Name:...,Umschlag: Einfach, Farbe: Grün, Seiten: 50, Gesamtspreis: 9€");
            comboBoxBestDesign.addItem("Name:...,Umschlag: Farbig, Farbe: Blau, Seiten: 30, Gesamtspreis: 9€");
            comboBoxBestDesign.addItem("Name:...,Umschlag: Muster, Farbe: Gelb, Seiten: 20, Gesamtspreis: 9€");
        }


    {

        // ActionListener für den Speichern-Button
        speichernButton.addActionListener(e -> {
            try {
                // Auswahl aus der Benutzeroberfläche abrufen
                boolean planung = checkBoxPlanung.isSelected();
                boolean notiz = checkBoxNotiz.isSelected();

                // Gesamtkosten berechnen mit Enum
                int gesamtpreis = KostenRechner.berechneGesamtpreis(planung, notiz);

                // Seitenzahl überprüfen
                String seitenText = textFieldSeiten.getText();
                if (seitenText.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Bitte geben Sie die Seitenzahl ein!");
                    return;
                }
                int seiten = Integer.parseInt(seitenText);
                if (seiten <= 0 || seiten >= 100) {
                    JOptionPane.showMessageDialog(this, "Die Seitenzahl muss zwischen 1 und 99 liegen!");
                    return;
                }
                // Aktion wenn man BestDesign wählt
                comboBoxBestDesign.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedItem = (String) comboBoxBestDesign.getSelectedItem();
                        JOptionPane.showMessageDialog(BeBuch.this, "BestDesign" + selectedItem);
                    }
                });


                // Gesamtkosten anzeigen
                textFieldGesamtpreis.setText(gesamtpreis + "€");
                //Abbrechen button
                abbrechenButton.addActionListener(e1 -> System.exit(0));

                // Bestellung in das Textfeld hinzufügen
                String bestellung = "Name: " + textFieldName.getText() + "\n"
                        + "Umschlag: " + comboBoxUmschlag.getSelectedItem() + "\n"
                        + "Farbe: " + comboBoxFarbe.getSelectedItem() + "\n"
                        + "Seiten: " + seiten + "\n"
                        + "Papierstil: " + (planung ? "Planung " : "")
                        + (notiz ? "Notiz" : "") + "\n"
                        + "Notizen: " + textFieldNotizen.getText() + "\n"
                        + "Gesamtpreis: " + gesamtpreis + "€\n\n";

                textAreaBestellung.append(bestellung);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Bitte geben Sie eine gültige Zahl für die Seiten ein!");
            }
        });
        //

    }

    public static void main(String[] args) {
        new BeBuch();
    }
}

