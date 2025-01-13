import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.BeBuch;
import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class BeBuchTest {
    private BeBuch beBuch; //Objekt der Klasse BeBuch
    private JComboBox<String> comboBoxBestDesign; //JComboBox für die Tests

    @BeforeEach
    public void setUp() {
        //Initialisierung der Testobjekte
        beBuch = new BeBuch();
        comboBoxBestDesign = new JComboBox<>();
    }

    @Test
    public void testInitObjekte() {
        //Methode initObjekte aufrufen
        beBuch.initObjekte(comboBoxBestDesign);
        //Überprüfen , ob die Anzahl der Elemente korrekt ist
        assertEquals(3, comboBoxBestDesign.getItemCount(), "Số lượng mục không đúng");
        //Überprüfen , ob die Anhalt korrekt ist
        assertEquals("Name:...,Umschlag: Einfach, Farbe: Grün, Seiten: 50, Gesamtspreis: 9€",
                comboBoxBestDesign.getItemAt(0));
        assertEquals("Name:...,Umschlag: Farbig, Farbe: Blau, Seiten: 30, Gesamtspreis: 9€",
                comboBoxBestDesign.getItemAt(1));
        assertEquals("Name:...,Umschlag: Muster, Farbe: Gelb, Seiten: 20, Gesamtspreis: 9€",
                comboBoxBestDesign.getItemAt(2));
    }
}
