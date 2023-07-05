# Implementatie

## Vertaalspecificaties

Zie ook Mapping UML - SKOS begrippen.

### «Domein» Registratiegegevens

| **Productmodel Gebouw** |                     |              | **Bronregistraties** |                |                     |              |
|-------------------------|---------------------|--------------|----------------------|----------------|---------------------|--------------|
| **objecttype**          | **attribuut**       | **datatype** | **Registratie**      | **objecttype** | **attribuut**       | **datatype** |
| Registratiegegevens     | tijdstipRegistratie | Tijdstip     | BAG                  | Pand           | tijdstipRegistratie | Tijdstip     |
|                         |                     |              | BGT                  | OverigBouwwerk | tijdstipRegistratie | Tijdstip     |
|                         | eindRegistratie     | Tijdstip     | BAG                  | Pand           | eindRegistratie     | Tijdstip     |
|                         |                     |              | BGT                  | OverigBouwwerk | eindRegistratie     | Tijdstip     |

### «Domein» Gebouw

| **Productmodel Gebouw** |                         |                      | **Bronregistraties** |                                                  |                                            |                                         |
|-------------------------|-------------------------|----------------------|----------------------|--------------------------------------------------|--------------------------------------------|-----------------------------------------|
| **objecttype**          | **attribuut**           | **datatype**         | **Registratie**      | **objecttype**                                   | **attribuut**                              | **datatype**                            |
| Gebouw                  | identificatie           | CharacterString {id} |                      | Nummeraanduiding                                 | identificatie                              | Objectnummering                         |
|                         | domein                  | CharacterString {id} |                      |                                                  |                                            |                                         |
|                         | type                    | CharacterString      | BAG                  | Verblijfsobject dat onderdeel uit maakt van Pand | gebruiksdoel                               | Gebruiksdoel                            |
|                         | bouwjaar                | Integer              | BAG                  | Pand                                             | Oorspronkjelijk bouwjaar                   | Jaar                                    |
|                         | sloopjaar               | Integer              | BAG                  | Pand                                             | beginGeldigheid van status ‘Pand gesloopt’ | Datum                                   |
|                         |                         |                      | BGT                  | OverigBouwwerk                                   | bgt-type plus-type                         | TypeOverigBouwwerk TypeOverBouwwerkPlus |
|                         |                         |                      | BRT                  | Gebouw                                           | typeGebouw                                 | TypeGebouw                              |
|                         | geometrie:bovenaanzicht | Vlak                 | BAG                  | Pand                                             | geometrie                                  | Vlak                                    |
|                         | geometrie:maaiveld      | MultiVlak            | BGT                  | Pand OverigBouwwerk                              | geometrie2d geometrie2d                    | Multivlak Vlak of Multivlak             |
|                         | geometrie:3d            | LOD2                 | 3D basisbestand      |                                                  |                                            |                                         |
|                         |                         |                      |                      |                                                  |                                            |                                         |

#### Mapping BAG VBO gebruiksdoel naar PM Gebouw:type

##### BAG gebruiksdoelen

| **Waarden**             | **Omschrijving**                                                                                                                                                                                        |
|-------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Woonfunctie             | Gebruiksfunctie voor het wonen                                                                                                                                                                          |
| Bijeenkomstfunctie      | Gebruiksfunctie voor het samenkomen van personen voor kunst, cultuur, godsdienst, communicatie, kinderopvang, het verstrekken van consumpties voor het gebruik ter plaatse of het aanschouwen van sport |
| Celfunctie              | Gebruiksfunctie voor het dwangverblijf van personen                                                                                                                                                     |
| Gezondheidszorgfunctie  | Gebruiksfunctie voor medisch onderzoek, verpleging, verzorging of behandeling                                                                                                                           |
| Industriefunctie        | Gebruiksfunctie voor het bedrijfsmatig bewerken of opslaan van materialen en goederen, of voor agrarische doeleinden                                                                                    |
| Kantoorfunctie          | Gebruiksfunctie voor administratie                                                                                                                                                                      |
| Logiesfunctie           | Gebruiksfunctie voor het bieden van recreatief verblijf of tijdelijk onderdak aan personen                                                                                                              |
| Onderwijsfunctie        | Gebruiksfunctie voor het geven van onderwijs                                                                                                                                                            |
| Sportfunctie            | Gebruiksfunctie voor het beoefenen van sport                                                                                                                                                            |
| Winkelfunctie           | Gebruiksfunctie voor het verhandelen van materialen, goederen of diensten                                                                                                                               |
| Overige gebruiksfunctie | Niet in dit lid benoemde gebruiksfunctie voor activiteiten waarbij het verblijven van personen een ondergeschikte rol speelt                                                                            |

##### Mapping BAG gebruiksdoel op Gebouw type

| **BAG Verblijfsobject: gebruiksdoel** | **PM Gebouw: type**        |
|---------------------------------------|----------------------------|
| Woonfunctie                           | woning                     |
| Bijeenkomstfunctie                    |                            |
| Celfunctie                            | gevangeniscomplex          |
| Gezondheidszorgfunctie                | medisch centrum            |
| Industriefunctie                      |                            |
| Kantoorfunctie                        | kantoorgebouw              |
| Logiesfunctie                         |                            |
| Onderwijsfunctie                      | universiteit, schoolgebouw |
| Sportfunctie                          |                            |
| Winkelfunctie                         |                            |
| Overige gebruiksfunctie               |                            |

##### Combinaties meerdere gebruiksdoelen naar Gebouw type

Twee of meer verblijfsobjecten maken onderdeel uit van een Pand:

| BAG Verblijfsobject: gebruiksdoel  | PM Gebouw: type |
|------------------------------------|-----------------|
| Woonfunctie Kantoorfunctie         | woonkantoor     |
| Woonfunctie gezondheidszorgfunctie | woonzorgcomplex |
|                                    |                 |
|                                    |                 |

### 

### «Domein» Adres

Zie [https://geonovum.github.io/WaU-UC](https://geonovum.github.io/WaU-UC2)1.

## Prioriteit

#### Identificatie

Uitgangs- en aandachtspunten:

-   In beginsel wordt de identificatie (lokaalid) van BGT Pand en BGT
    OverigBouwwerk gehanteerd als identificatie voor Gebouw.

-   Als een Pand wel in BAG voorkomt en niet in BGT dan wordt de BAG
    identificatie gehanteerd als identificatie voor Gebouw.

-   Via de identificatie van het BAG Pand als attribuut bij het BGT Pand kunnen
    gegevens uit de BAG worden gerelateerd aan het Gebouw.

-   Door actualiteitsverschillen kunnen Panden wel in BAG voorkomen en niet in
    BGT en vice versa. Bijvoorbeeld na mutatiesignalering van luchtfoto’s worden
    in de BGT Panden opgenomen, welke pas later (in de regel 4 dagen, in de
    praktijk bij bulksignalering langer) in de BAG worden opgenomen. Als een BAG
    Pand wordt opgevoerd moet deze vanaf status ‘Bouw gestart’ binnen 6 maanden
    worden opgevoerd in de BGT.

-   Als een Pand wel in BGT en niet in de BAG heeft het BGT Pand in bepaalde
    gevallen bestaande BAG-identificatie, bijvoorbeeld 16 nullen, of
    gemeentecode gevolgd door 12 nullen.

-   BGT heeft -met inachtneming van optionele planinformatie van gebouwen- meer
    gebouwen dan BAG.

-   Vanaf BAG-status ‘Bouw gestart’ moet een Pand in de BGT worden opgevoerd met
    status ‘bestaand’. Vanaf BAG-status ‘Bouwvergunning verleend’ mag een Pand
    in de BGT worden opgevoerd met status ‘plan’.

| BAG Pand                         | BGT Pand                                         |
|----------------------------------|--------------------------------------------------|
| Bouwvergunning verleend          | status=plan                                      |
| Bouw gestart                     | status=bestaand                                  |
| Pand in gebruik (niet ingemeten) | status=bestaand                                  |
| Pand in gebruik                  | status=bestaand                                  |
| Pand buiten gebruik              | status=bestaand                                  |
| Verbouwing pand                  | status=bestaand                                  |
| Verbouwing Pand                  | status=bestaand                                  |
| Sloopvergunning verleend         | status=bestaand                                  |
| Pand gesloopt                    | status=bestaand en ObjectEindtijd                |
| Niet gerealiseerd Pand           | status=plan en ObjectEindtijd                    |
| Pand ten onrechte opgevoerd      | status=bestaand of status=plan en ObjectEindtijd |

Voor de High5 Use case 2 Gebouw wordt gemeente Zeewolde als testgebied
geselecteerd: Zeewolde voert panden met status ‘plan’ op in de BGT en in
Zeewolde komen tenminste de overige bouwwerken van het type 'open loods’,
‘windturbine’ en ‘schuur’ voor.

#### Type

1.  bgt- of plus-type van BGT OverigBouwwerk

2.  type van BRT Gebouw

3.  gebruiksdoel van Verblijfsobject dat onderdeel uit maakt van BAG Pand

#### Registratiegegevens

tijdstipRegistratie en eindRegistratie :

Optie 1) waarde van BGT of BAG object met het oudste tijdstip; uitgangspunt de
actualiteit van de gegevens is zo goed/slecht als de minst actuele?

Optie 2) waarde van BGT of BAG object met het nieuwste tijdstip; uitgangspunt de
actualiteit van de gegevens is zo goed/slecht als de meest actuele?
