# Das ist eine Wiederholung der objektorientierten Konzepte.

Bitte versuche als Übung alles in Markdown zu beantworten. Hier ist ein [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. Was ist das Ziel der Objektorientierung?
 - ### Um Daten und Code in �bersichtlichen und wiedervewendbare Module spirch Objekte zu spiechern. Dadur 
 - ### wir auch das mehrfache Schreiben von Programmcode vermieden.
 
2. Gibt es OOP nur in Java?
- ### nein! OOP ist in fast allen modernen Programmiersprachen verf�gbar.
- ### Ansatzweise sogar in Skriptsprachen.
 
3. Was ist der Unterschied zwischen Objekt und Klasse?
- ### Klasse ist wuasi der Bauplan. Ein Objekt ist dann das Produkt aus der Klasse
--- 
4. Wie erzeuge ich eine neue Instanz? (Welches Schlüsselwort gibt es dafür)
 - ### eine Instanz wird mit dem Schl�sselwort new erzeugt 
---
5. Was bedeutet das Schlüsselwort `static` und wo kann es überall verwendet werden?
 - ### static beduetet das die Programmstruktur nicht an ein Objekt gebunden sind.
 - #### static kann vorkommen  in :
 - ##### variablen die als Klassenvariable gekennzeichent werden
 - ##### Methoden ohne Objektbildung vorkommen 
 - ##### Statemants als Block um Klassenvariablen zu initialisieren
---
6. Wozu dient die Vererbung?
 - ### Dient dazu um gewisse Klassenvariablen an andere Klassen weiter zu geben 
 - ### z.B Die Klasse Fahrzeug beinhaltet Farbe PS Ladung
 - ### die Klassen Auto kann mit dem Schl�sselwort extends Faharzeug die Attribute erben.
 ---
7. Kann in Java von mehreren Klassen geerbt werden? Wenn ja wie?
 - ### Nein das ist in Java nicht m�glich. Java kann nur von einer Klasse zur n�chsten vererben.
--- 
8. Welche Vererbungshierarchien kennst du? (Ein Bild reicht aus)
![alt-text](https://falconbyte.net/gfxAi/vererbung.svg) 
---
9. Was beudeted Casten und wie ist die Syntax in Java dafür?
 - ### Casten beudetet das man einen Datentyp in einen anderen umwandelt 
 - ### Es gibt das impliziete Typcasteing das austonatisch passiert wenn 
 - ### niederwetige Datentypen in h�herwerteige umgewandelt werden
 ```java
 int wert = 10;
 double wert1 = 30;
 wert1 = wert;
 ```
 - ### explizietes Typcasting wird mittels cast Operator durchgef�hrt
 ```java
 int wert = 10;
 double wert1 = 32.4;
 wert = (int) wert1;
 ```
 ---
10. Was ist der Unterschied zwischen explizieten und implizieten Typecasting?
 - ### niederwetige Datentypen in h�herwerteige umgewandelt werden
 ```java
 int wert = 10;
 double wert1 = 30;
 wert1 = wert;
 ```
 - ### explizietes Typcasting wird mittels cast Operator durchgef�hrt
 ``` java
 int wert = 10;
 double wert1 = 32.4;
 wert = (int) wert1;
 ```
--- 
11. Erkläre die folgenden Schlüsselwörter: `super`, `this`
 - ### super wird ben�tigt um eine Methode in der Oberklasse aufzurufen
 - ### this leifert eine Referenz auf das Objekt in dem man sich befindet
---
12. Fuer was dient der `instanceof` Operator. Gib ein sinnvolles Beispiel.
- ### Mit instanceof wird �berpr�ft ob referenziertes Objekt zu einem Objekt einer KLasse passt
``` java
	 String string = "42!!!";
 		Object object = new Object();
 		System.out.println(object instanceof String); // liefert false
 		System.out.println(string instanceof String); // liefert true
``` 
---
 Eclipse bietet auch Markdown unterstützung inklusive Preview. Für die Verwendung muss kein Plugin installiert werden.
