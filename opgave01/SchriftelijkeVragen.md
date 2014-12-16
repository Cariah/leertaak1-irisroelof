#Schriftelijkse vragen
## Week 4

### Opgave 1c
Java zorgt er zelf voor dat er lege constructor uit wordt gevoerd.

### Opgave 1d
Omdat de methonden van de Klasse Administratie alleen afhankelijk zijn van de
parameters die we meegeven.

### Opgave 1e
Door gebruik te maken van een private constructor, kunnen we dit object niet meer instantieren.
De methodes kunnen alleen worden gebruikt als volgt: `Administratie.methode` .
En niet : Administratie administratie = new Administratie();

### Opgave 1g
#### Activiteitendiagram van berekenDagOmzet

### Opgave 1h
Het keyword `final` geeft aan dat de variabele niet meer kan worden gewijzigd.

### Opgave 1i
Compiler verwacht een `final static` en we hebben alleen `final`.
Static method kan alleen static variables gebruiken.

### Opgave 1j
Het probleem is dat het nu geen Constant meer is. Dit kunnen we oplossen door er
weer `final` in te zetten.

### Opgave 2b
Dit zorgt ervoor dat in iedergeval de parent class goed is geinstantieerd.

## Week 5
### Opgave 1d
Bij gebruik van == vergelijken we de verwijzing naar het object
Bij gebruik van .equals vergelijken we de objecten inhoudelijk
Het is dus handiger om equals te gebruiken als je Strings inhoudelijk wilt vergelijken.

### Opgave 2c
Zodat ook de subklasses deze variabele kunnen gebruiken.

