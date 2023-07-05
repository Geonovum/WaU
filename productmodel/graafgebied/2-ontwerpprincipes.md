# Ontwerpprincipes

Grondroerders zijn verplicht om voor hun graafwerkzaamheden een melding te doen
bij het Kabels en Leiding Informatie Centrum. Op basis van een ingevoerde
graafpolygoon wordt de ligging van kabels en leidingen binnen dit polygoon als
XML-bestand en PDF-kaart aan de grondroerder verstrekt.

Voor grondroerders wordt verondersteld dat de volgende extra informatie van nut
kan zijn bij het plannen en/of uitvoeren van graafwerkzaamheden:

-   Adressen

-   Ligging van gebouwen

-   Ligging van overige constructies, zoals overige bouwwerken, kasten, masten,
    palen en putten.

-   Ligging van bomen

-   Samenstelling van de bodem, zoals veengrond, kleigrond, zandgrond.

-   Aanwezigheid van waterstaatkundige werken, zoals dijken/waterkeringen.

-   Aanwezigheid van archeologische waarden.

-   Aanwezigheid van publiekrechtelijke beperkingen.

-   Contactgegevens van overheidsorganisaties, zoals gemeente, veiligheidsregio
    en waterschap

## Adressen

Met informatie over de adressen in een graafgebied wordt verondersteld dat
grondroerders omwonenden kunnen informeren over de werkzaamheden. De gegevens
over adressen zijn opgeslagen in de basisregistratie Adressen en Gebouwen (BAG).

Adressen worden samengesteld uit de BAG-objecten Nummeraanduiding (huisnummer,
\-letter, -toevoeging en postcode), Openbareruimte (straatnaam) en Woonplaats
(plaatsnaam). Voor het productmodel wordt een volledig adres samengesteld uit
deze gegevens en als één omschrijving opgenomen.

Hoofd- en nevenadressen worden via het object Nummeraanduiding gerelateerd aan
een Adresseerbaar object: Ligplaats, Standplaats of Verblijfsobject. Bij deze
adresseerbare objecten wordt de ligging (geometrie) opgenomen.

In de orkestratie engine worden de adressen geselecteerd op basis van de ligging
van adresseerbare objecten binnen het ingevoerde graafgebied in de Product API.

## Ligging van gebouwen

Met de ligging van gebouwen wordt verondersteld dat grondroerders de
bereikbaarheid van kabels en leidingen kunnen controleren en nieuwe tracés
kunnen plannen.

Gegevens over gebouwen zijn opgenomen in 3 geo-basisregistraties:

1.  object Pand in de basisregistratie Adressen en Gebouwen (BAG)

2.  object Pand en OverigBouwwerk in de basisregistratie Grootschalige
    Topografie (BGT)

3.  object Gebouw in de basisregistratie Topografie (BRT).

In het productmodel wordt de ligging (multivlak-geometrie) op maaiveld uit de
BGT, het bouwjaar en de functie(s) uit de BAG, en de typering van gebouwen uit
BGT en BRT overgenomen in een object Gebouw.

In de orkestratie engine worden de gebouwen in BAG, BGT en BRT geselecteerd op
basis van de ligging van gebouwen binnen het ingevoerde graafgebied in de
product API.

## Ligging van overige constructies

Met informatie over overige constructies, zoals kasten, masten, putten en palen,
wordt verondersteld dat grondroerders informatie hebben over de aansluiting van
kabels en leiding op boven- en ondergrondse objecten.

Gegevens over overige constructies zijn opgenomen in de basisregistratie
Grootschalige Topografie (BGT) in o.m. de objecten OverigBouwwerk, Kast, Mast,
Paal, en Put.

Het type en de ligging (omgezet naar puntgeometrie) van deze constructies in de
BGT worden in het productmodel overgenomen in een object OverigConstructie.

In de orkestratie engine worden de overige constructies in de BGT geselecteerd
op basis van de ligging van deze constructies binnen het ingevoerde graafgebied
in de product API.

## Ligging van bomen

Met informatie over bomen wordt verondersteld dat grondroerders de ligging van
boomwortels beter kunnen inschatten en daarmee hun graafwerkzaamheden beter
kunnen plannen.

Gegevens over bomen zijn opgenomen in 2 geo-basisregistraties:

1.  het object Vegetatieobject van het type ‘boom’ in de basisregistratie
    Grootschalige Topografie (BGT)

2.  het object Inrichtingselement van het type ‘boom’ en ‘bomenrij’ in de
    basisregistratie Topografie (BRT).

In het productmodel worden het type en de ligging (punt- of lijngeometrie) van
deze bomen of bomenrij in de BGT en BRT overgenomen in een object
BoomOfBomenrij.

In de orkestratie engine worden de bomen in de BGT en BRT geselecteerd op basis
van de ligging van deze bomen binnen het ingevoerde graafgebied in de Product
API.

## Samenstelling van de bodem

Met informatie over de samenstelling van de bomen wordt verondersteld dat
grondroerders beter hun graafwerkzaamheden en de inzet van mensen en materiaal
kunnen plannen.

De gegevens over de samenstelling van de bodem zijn opgenomen in Bodemkaart van
de basisregistratie Ondergrond (BRO).

In het productmodel wordt het type en de ligging (vlakgeometrie) van de
bodemsamenstelling in de BRO overgenomen in een object Bodemsamenstelling. De
codering van bodemvlakken in de BRO wordt omgezet in een betekenisvolle naam
gebaseerd op de definities van deze BRO-codering.

In de orkestratie engine worden de vlakken met bodemsamenstelling in de
Bodemkaart van de BRO geselecteerd op basis van de ligging van deze bodemvlakken
binnen het ingevoerde graafgebied in de Product API.

## Aanwezigheid van waterstaatkundige werken

Met informatie over de aanwezigheid van waterstaatkundige werken, zoals
dijken/keringen wordt verondersteld dat grondroerders hun graafwerkzaamheden
beter kunnen plannen, omdat mogelijk een omgevingsvergunning voor de
werkzaamheden vereist is, of er aanvullende regels voor bijvoorbeeld
vooronderzoek/-overleg gelden.

Gegevens over waterstaatkundige werken zijn opgenomen in Ruimtelijke Plannen in
het object Dubbelbestemming van het type ‘waterstaat’.

In het productmodel worden de nadere typering van de waterstaat en de ligging
(vlakgeometrie) in Ruimtelijke Plannen overgenomen in een object Waterstaat.

In de orkestratie engine worden de dubbelbestemmingen van het type ‘waterstaat‘
geselecteerd in Ruimtelijke Plannen op basis van de ligging van deze
dubbelbestemmingen binnen het ingevoerde graafgebied in de Product API.

## Aanwezigheid van archeologische waarden

Met informatie over de aanwezigheid van waterstaatkundige werken, zoals
dijken/keringen wordt verondersteld dat grondroerders hun graafwerkzaamheden
beter kunnen plannen, omdat mogelijk een omgevingsvergunning voor de
werkzaamheden vereist is, of er aanvullende regels bijvoorbeeld
vooronderzoek/-overleg gelden.

Gegevens over archeologische waarden zijn opgenomen in de Ruimtelijke Plannen in
het object Dubbelbestemming van het type ‘waarde’ met een nadere typering
archeologische waarde 1 t/m 5.

In het productmodel wordt het niveau van de nadere typering van de
archeologische waarde en de ligging (vlakgeometrie) in Ruimtelijke Plannen
overgenomen in een object ArcheologischeWaarde.

In de orkestratie engine worden de dubbelbestemmingen van het type ‘waarde‘ met
nadere typering archeologische waarde in Ruimtelijke Plannen geselecteerd op
basis van de ligging van deze dubbelbestemmingen binnen het ingevoerde
graafgebied in de Product API.

## Aanwezigheid van publiekrechtelijke beperkingen.

Met informatie over publiekrechtelijke beperkingen wordt verondersteld dat
grondroerders beter hun graafwerkzaamheden kunnen plannen, omdat aanvullende
eisen en regels gelden bijvoorbeeld in het kader van de Wet Bodembescherming of
de Erfgoedwet.

Gegevens over publiekrechtelijke beperkingen zijn opgenomen in de
Basisregistratie Kadaster (BRK).

In het productmodel worden de grondslag en de ligging (vlakgeometrie) van de
publiekrechtelijke beperkingen in de BRK overgenomen in een object Beperking.

In de orkestratie engine worden de dubbelbestemmingen van het type ‘waarde‘ met
nadere typering archeologische waarde in de BRK geselecteerd op basis van de
ligging van deze beperkingen binnen het ingevoerde graafgebied in de Product
API.

## Contactgegevens van overheidsorganisaties

Met informatie over de contactgegevens van overheidsorganisaties wordt
verondersteld dat grondroerders hun graafwerkzaamheden beter kunnen plannen en
uitvoeren, bijvoorbeeld voor vooroverleg met een gemeente of waterschap, de
aanvraag van een omgevingsvergunning, of in het geval van een calamiteit.

Gegevens over de overheidsorganisaties gemeente, veiligheidsregio en waterschap
zijn opgeslagen in

1.  de naam, code en contactgegevens in de OWMS.

2.  de naam, code en het, de door overheidsorganisatie bestuurde of
    gecontroleerde, gebied in DiS-Geo Bestuurlijke gebieden.

In het productmodel worden de naam, contactgegevens en het gebied uit OWMS en
DiS-Geo Bestuurlijke gebieden overgenomen in een object Gemeente,
Veiligheidsregio en Waterschap.

In de orkestratie engine worden de overheidsorganisaties geselecteerd op basis
van de ligging van de gebieden van deze overheidsorganisaties in DiS-Geo
Bestuurlijke gebieden, binnen het ingevoerde graafgebied in de Product API.
