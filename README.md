# BeBuch Projekt
## Einführung
**BeBuch** ist eine Java-Swing-Anwendung zur Verwaltung von Buchbestellungen mit folgenden Funktionen:
- Benutzerfreundliche grafische Benutzeroberfläche (GUI).
- Automatische Berechnung der Gesamtkosten basierend auf Benutzerauswahl.
- Anzeige detaillierter Bestellinformationen.
---
## Funktionen
- Erstellung von Bestellungen mit folgenden Angaben:
  - Name der Bestellung.
  - Umschlagtyp (Einfach, Farbig oder Muster).
  - Farbe des Umschlags.
  - Seitenanzahl (zwischen 1 und 99).
  - Notizen oder Auswahl „Planung“.
- Automatische Berechnung der Gesamtkosten.
- Verwaltung und Anzeige der Bestellliste.
- Fehlerbehandlung und Validierung von Benutzereingaben.
- Bereitstellung vorgefertigter Bestellungen über die Liste „BestDesign“.
---
## Technologien
- **Programmiersprache**: Java
- **Bibliotheken**:
  - **Java Swing**: Erstellung der grafischen Benutzeroberfläche.
  - **JUnit**: Automatisiertes Testen.
---
## Installationsanleitung
### Systemvoraussetzungen
- **Java JDK 17+**
- Eine IDE mit Java-Unterstützung, z. B. IntelliJ IDEA, Eclipse oder VS Code.
### Installationsschritte
1. Klonen Sie das Projekt von GitHub:
   ```bash
   git clone https://github.com/username/BeBuch-Project.git
	2.	Öffnen Sie das Projekt in Ihrer bevorzugten IDE.
	3.	Führen Sie die Datei BeBuch.java aus, um die Anwendung zu starten.
### Nutzung
	1.	Starten Sie das Programm:
	•	Öffnen Sie die Datei BeBuch.java in Ihrer IDE und klicken Sie auf “Run”.
	2.	Eingabe von Bestelldaten:
	•	Wählen Sie den Umschlagtyp, die Farbe, die Seitenanzahl und fügen Sie bei Bedarf Notizen hinzu.
	3.	Speichern einer Bestellung:
	•	Klicken Sie auf die Schaltfläche “Speichern”, um die Bestellung zur Liste hinzuzufügen.
	4.	Verwendung von „BestDesign“:
	•	Wählen Sie eine vorgefertigte Bestellung aus der Liste „BestDesign“.
	5.	Kostenberechnung:
	•	Die Gesamtkosten werden automatisch nach Eingabe der Daten angezeigt.
### Tests
	•	Tests werden über die Datei JUnit im Ordner tests/ durchgeführt.
	•	Um die Tests auszuführen:
	1.	Öffnen Sie die Datei BeBuchTest.java.
	2.	Führen Sie die Testmethoden über Ihre IDE aus.
	•	Getestete Szenarien:
	•	Kostenberechnung mit der KostenRechner-Klasse.
	•	Fehlerbehandlung bei ungültigen Eingaben.
### Projektstruktur
### BeBuch-Project/
│
├── src/
│   ├── org/example/
│   │   ├── BeBuch.java          # Hauptdatei der Anwendung
│   │   └── KostenRechner.java   # Enum-Datei zur Kostenberechnung
│
├── tests/
│   └── org/example/
│       └── BeBuchTest.java      # JUnit-Testdatei
│
├── README.md                    # Projektbeschreibung
├── .gitignore                   # Ignorierte Dateien
└── LICENSE                      # (Optional) Lizenzdatei
### Mitwirkung
Beiträge sind willkommen! Wenn Sie ein Feature vorschlagen oder einen Fehler melden möchten, erstellen Sie bitte ein Issue oder senden Sie einen Pull Request.
### Lizenz
Das Projekt ist unter der MIT-Lizenz lizenziert.
### Kontakt
	•	Teamname: [Ihr Name oder Teamname]
	•	E-Mail: [Kontakt-E-Mail]
	•	GitHub: [Link zu Ihrem GitHub-Profil oder Teamseite]
---
### **Anleitung:**
1. Kopieren Sie den obenstehenden Text und fügen Sie ihn in eine Datei namens `README.md` in Ihrem Projektordner ein.
2. Laden Sie diese Datei zusammen mit Ihrem Projektcode auf GitHub hoch.
Falls Sie noch weitere Anpassungen oder Unterstützung benötigen, lassen Sie es mich wissen!

