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

### Opgave 5a
Nee want een interface kan geen constructor hebben.

### Opgave 5b
Nee want een abstracte klasse heeft geen constructor.

### Opgave 5c
Ja, als de superklasse ook een superklasse heeft. ( hihi elke klasse erft van Klasse: Object )

### Opgave 5d
Ja

### Opgave 5e
Ja

### Opgave 5f
Ja, want de bodies van de methodes in een interface zijn er niet, precies zoals bij een abstracte methode.

### Opgave 5g
Ja,
1. Hij compiled niet.

### Opgave 5h
Als klasse A, abstracte klasse B extend, dan is klasse A zowel van het type A als het type B.
Als er dan om het type B wordt gevraagd, kan type A ook worden gegeven.

d.m.v. Interfaces implementeren we gedrag
Met abstracte klasses definieren we een relatie

### Opgave 6a
Ja dit kan. Met als voorbeeld een Persoon <--- Student . 
Een student is ook gewoon een Persoon en heeft geen unieke implementatie van bijvoorbeeld een getNaam() methode.

### Opgave 6b
Ja, anders compiled hij 100% niet ALS dit een concrete klasse is.
Als een Abstracte klasse een andere abstracte klasse extend, hoef je nog geen implementatie te geven van de abstracte methodes en zal hij "gewoon" compilen.

### Opgave 6c
Je kunt de methode een Exception laten 'throwen'. Zo zie je als je het programma later uitvoerd dat deze methode niet is geimplementeerd.

### Opgave 6d
Dit kan niet.

### Opgave 6e
Een final methode in een superklasse kan niet worden overschreven in een subklasse.
Hier is Final voor.


