## Use Case: Raadplegen gegevens gebouw

Wie gegevens over een gebouw wil raadplegen moet veelal informatie opvragen vanuit meerdere bronnen, o.m.

1.  **Basisregistratie Adressen en Gebouwen (BAG):** In het algemeen worden alle gebouwen welke afsluitbaar en betreedbaar zijn opgenomen als Pand in de BAG. Een Verblijfsobject met een bepaalde gebruiksdoel (bijv. woonfunctie) maakt onderdeel uit van een Pand. De geometrie van een Pand is op basis van het bovenaanzicht.
2.  **Basisregistratie Grootschalige Topografie (BGT):** In de BGT worden de panden uit de BAG met maaiveldgeometrie opgenomen. Dit is om een landsdekkend bestand op maaiveldniveau te realiseren. Daarnaast worden overige bouwwerken welke geen onderdeel uit maken van de BAG opgenomen, bijvoorbeeld een schuur (=niet verplicht voor BAG 2.0), open loods (=niet afsluitbaar) etc. Met BAG 2.0 worden windturbines (welke afsluitbaar en betreed
3.  **Basisregistratie Topografie (BRT):** In de BRT worden gebouwblokken opgenomen als Gebouw. In de BRT heeft een Gebouw een typering.
4.  **3D basis bestand**.

### User story

We hanteren de volgende user story:

*Als* gebruiker

*wil ik* samengestelde verzameling van gegevens van een gebouw kunnen opvragen,

*zodat ik* niet verschillende bronnen hoef te bevragen en data te combineren.

### Uitgangspunten

Voor deze use case hanteren we de volgende uitgangspunten / requirements:

MH = Must Have, SH = Should Have, CH = Could have, NH = Nice to have

-   Gebruiker kan gegevens over een Gebouw opvragen via het Adres. (MH)
-   Gegevens over Gebouw worden samengesteld uit BAG Pand en BGT Pand (MH)
-   Gegevens over Gebouw worden samengesteld uit BGT OverigBouwwerk van het type ‘windturbine’, ‘schuur’, ‘overkapping’ en ‘open loods’. (SH)
-   Gegevens over Gebouw worden samengesteld uit BRT Gebouw en 3D Basisbestand (NH).
-   De relatie tussen het productmodel Gebouw en productmodel Adres wordt gelegd: Een Gebouw heeft als adres 0 of meer Adressen. (MH)
-   Gebruiker kan alle adressen opvragen van een Gebouw. (NH)
-   Een Gebouw heeft een maaiveldgeometrie uit de BGT en, indien dit Gebouw ook aanwezig is in de BAG een bovenaanzichtgeometrie. (MH)
-   Gebouw heeft een 3D geometrie op basis van 3D Basisbestand (NH).
-   De gegevens van Gebouw zijn inclusief historie op basis van BAG en BGT (SH):
    -   Een bouwjaar en sloopjaar als tijdlijnGeldigheid uit BAG.
    -   tijdstipRegistratie en eindRegistratie als tijdlijnRegistratie van de Registratiegegevens uit de BAG en/of BGT.
-   Gebouw heeft een typering op basis van het gebruiksdoel van één of meer verblijfsobjecten die onderdeel uitmaken van een BAG Pand. Gebruiksdoelen in BAG worden -voor zover mogelijk- vertaald naar een type Gebouw in het productmodel, bijvoorbeeld woonfunctie naar woning, woonfunctie + zorgfunctie = woonzorgcomplex. (MH)
-   Gebouw heeft een typering op basis van het type van BGT Overig Bouwwerk. (SH)
-   Gebouw heeft een typering op basis van het type van BRT Gebouw. (NH).
-   Een samengestelde gegeven van een Gebouw in het productmodel heeft een verwijzing naar de herkomst in de bronregistratie conform het lineagemodel. (MH)

### Buiten scope

n.v.t.

### Ontwerpprincipes

Voor het productmodel Gebouw hanteren we de volgende ontwerpprincipes. De ontwerpprincipes bepalen de modelleerkeuzes in het model.

-   Gebouw en Adres worden als apart domein gemodelleerd. Gebouw verwijst naar een Adres.
-   Registratiegegevens met tijdlijnRegistratie zijn opgenomen als apart objecttype. Gebouw en Adres zijn geregistreerd met Registratiegegevens.
-   De herkomst van gegevens wordt met stereotypering opgenomen in het productmodel. Dit stereotype verwijst naar een element GeorkestreerdGegeven.
