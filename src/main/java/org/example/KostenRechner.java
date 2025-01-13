package org.example;

public enum KostenRechner {
    UMSCHLAG(3),
    FARBE(3),
    PLANUNG(3),
    NOTIZ(3);

    private final int kosten;

    // Constructor  enum
    KostenRechner(int kosten) {
        this.kosten = kosten;
    }

    public int getKosten() {
        return kosten;
    }

    // Methoden Gesamtspreis
    public static int berechneGesamtpreis(boolean planung, boolean notiz) {
        int gesamtpreis = UMSCHLAG.getKosten() + FARBE.getKosten();
        if (planung) {
            gesamtpreis += PLANUNG.getKosten();
        }
        if (notiz) {
            gesamtpreis += NOTIZ.getKosten();
        }
        return gesamtpreis;
    }
}

