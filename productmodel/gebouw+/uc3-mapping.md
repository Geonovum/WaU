# Model mapping

## UML - SKOS begrippen

Elementen in **bold** zijn in nieuw SAM begrippenkader gedefiniëerd.

### Adres + eigenschappen

| UML element          | URI begrip                                                               | Opmerkingen                      |
|----------------------|--------------------------------------------------------------------------|----------------------------------|
| Adres                | http://bag.basisregistraties.overheid.nl/id/begrip/Adres                 |                                  |
| domein               | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/domein        |                                  |
| huisletter           | http://bag.basisregistraties.overheid.nl/id/begrip/Huisletter            |                                  |
| huisnummer           | http://bag.basisregistraties.overheid.nl/id/begrip/Huisnummer            |                                  |
| huisnummertoevoeging | http://bag.basisregistraties.overheid.nl/id/begrip/Huisnummertoevoeging  |                                  |
| identificatie        | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/identificatie |                                  |
| isHoofdadres         | http://bag.basisregistraties.overheid.nl/id/begrip/Hoofdadres            |                                  |
| **omschrijving**     | https://begrippen.geostandaarden.nl/sam/id/begrip/omschrijving           | Niet gevonden in BAG             |
| **plaatsnaam**       | https://begrippen.geostandaarden.nl/sam/id/begrip/plaatsnaam             | Met `closeMatch` naar BAG `Naam` |
| postcode             | http://bag.basisregistraties.overheid.nl/id/begrip/Postcode              |                                  |
| **straatnaam**       | https://begrippen.geostandaarden.nl/sam/id/begrip/straatnaam             | Met `closeMatch` naar BAG `Naam` |

### Gebouw + eigenschappen

| UML element                | URI begrip                                                                | Opmerkingen                                                                                                                                                           |
|----------------------------|---------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Gebouw                     | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/gebouw         |                                                                                                                                                                       |
| bouwjaar                   | http://bag.basisregistraties.overheid.nl/id/begrip/OorspronkelijkBouwjaar |                                                                                                                                                                       |
| **sloopjaar**              | https://begrippen.geostandaarden.nl/sam/id/begrip/sloopjaar               | Met `related` naar BAG `PandGesloopt`                                                                                                                                 |
| **geometrie**              | https://begrippen.geostandaarden.nl/sam/id/begrip/geometrie               | Met `closeMatch` naar NEN3610 `georeferentie` en `narrowMatch` naar BAG `Geometrie`                                                                                   |
| **3d**                     | https://begrippen.geostandaarden.nl/sam/id/begrip/3d_geometrie            |                                                                                                                                                                       |
| bovenaanzicht              | http://bag.basisregistraties.overheid.nl/id/begrip/Geometrie              |                                                                                                                                                                       |
| **maaiveld**               | https://begrippen.geostandaarden.nl/sam/id/begrip/maaiveldgeometrie       | ontbreekt in [IMGeo begrippenkader](https://definities.geostandaarden.nl/imgeo/nl/)                                                                                   |
| identificatie              | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/identificatie  |                                                                                                                                                                       |
| **type**                   | https://begrippen.geostandaarden.nl/sam/id/begrip/gebouwtype              | Met `narrowMatch` naar BAG `Gebruiksdoel`, BGT `Bgt-type_overigBouwwerk`, BGT `Plus-type_overigBouwwerk`, en BRT `TypeGebouw`. **Vraag**: `narrowMatch` of `related`? |
| **Gebouw heeft als adres** | <http://bag.basisregistraties.overheid.nl/id/begrip/Adres>                | Is geen apart begrip want voegt niets toe aan het BAG begrip Adres.                                                                                                   |
| **ligtOp**                 | <http://catalogus.kadaster.nl/brk/nl/page/Perceel>                        | Ruimtelijke relatie, afgeleid van ligging Gebouw ten opzichte van Perceel.                                                                                            |
|                            |                                                                           |                                                                                                                                                                       |

### Perceel

| **Perceel**             | https://catalogus.kadaster.nl/brk/nl/page/Perceel                       |   |
|-------------------------|-------------------------------------------------------------------------|---|
| **perceelnummer**       | catalogus.kadaster.nl/brk/nl/page/Perceelnummer                         |   |
| **LaatsteKoopsom**      | https://catalogus.kadaster.nl/brk/nl/page/Koopsom                       |   |
| **LaatsteVerkoopdatum** |                                                                         |   |
| **oppervlakte**         | <http://brk.basisregistraties.overheid.nl/id/begrip/KadastraleGrootte>  |   |
| **geometrie**           | <https://catalogus.kadaster.nl/brk/nl/page/BegrenzingPerceel>           |   |
| **ligtInGemeente**      | https://catalogus.kadaster.nl/brk/nl/page/Gemeente                      |   |
| **ligtInWaterschap**    | https://catalogus.kadaster.nl/brk/nl/page/Gemeente                      |   |

### Gemeente

| **Gemeente**              | https://catalogus.kadaster.nl/brk/nl/page/Gemeente         |   |
|---------------------------|------------------------------------------------------------|---|
| **Code**                  |                                                            |   |
| **Naam**                  |                                                            |   |
| **GemeenteHeeftAlsAdres** | <http://bag.basisregistraties.overheid.nl/id/begrip/Adres> |   |

### Waterschap

| **Waterschap**              | https://catalogus.kadaster.nl/brk/nl/page/Gemeente         |   |
|-----------------------------|------------------------------------------------------------|---|
| **Code**                    |                                                            |   |
| **Naam**                    |                                                            |   |
| **WaterschapHeeftAlsAdres** | <http://bag.basisregistraties.overheid.nl/id/begrip/Adres> |   |

## Productmodel op brongegevens

### «Domein» Gebouw

| **Productmodel Gebouw** |                        |                      | **Bronregistraties** |                                                  |                                            |                                         |
|-------------------------|------------------------|----------------------|----------------------|--------------------------------------------------|--------------------------------------------|-----------------------------------------|
| **objecttype**          | **attribuut**          | **datatype**         | **Registratie**      | **objecttype**                                   | **attribuut**                              | **datatype**                            |
| Gebouw                  | identificatie          | CharacterString {id} |                      | Nummeraanduiding                                 | identificatie                              | Objectnummering                         |
|                         | domein                 | CharacterString {id} |                      |                                                  |                                            |                                         |
|                         | type                   | CharacterString      | BAG                  | Verblijfsobject dat onderdeel uit maakt van Pand | gebruiksdoel                               | Gebruiksdoel                            |
|                         | bouwjaar               | Integer              | BAG                  | Pand                                             | Oorspronkjelijk bouwjaar                   | Jaar                                    |
|                         | sloopjaar              | Integer              | BAG                  | Pand                                             | beginGeldigheid van status ‘Pand gesloopt’ | Datum                                   |
|                         |                        |                      | BGT                  | OverigBouwwerk                                   | bgt-type plus-type                         | TypeOverigBouwwerk TypeOverBouwwerkPlus |
|                         |                        |                      | BRT                  | Gebouw                                           | typeGebouw                                 | TypeGebouw                              |
|                         | bovenaanzichtgeometrie | Vlak                 | BAG                  | Pand                                             | geometrie                                  | Vlak                                    |
|                         | maaiveldgeometrie      | MultiVlak            | BGT                  | Pand OverigBouwwerk                              | geometrie2d geometrie2d                    | Multivlak Vlak of Multivlak             |
|                         | Energielabel           | CharacterString      | RVO                  |                                                  |                                            |                                         |
|                         | ligtOp                 | Relatie              | KAD                  | Perceel                                          | perceelnummer                              |                                         |

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

### Perceel

| **Productmodel Gebouw** |                     |                      | **Bronregistraties** |                 |                       |                 |
|-------------------------|---------------------|----------------------|----------------------|-----------------|-----------------------|-----------------|
| **objecttype**          | **attribuut**       | **datatype**         | **Registratie**      | **objecttype**  | **attribuut**         | **datatype**    |
| Perceel                 | perceelnummer       | CharacterString {id} | KAD                  | Perceel         | Perceelnummer         | CharacterString |
|                         | domein              | CharacterString {id} |                      |                 |                       |                 |
|                         | laatsteKoopsom      | CharacterString      | KAD                  | Perceel         | Koopsom               |                 |
|                         | laatsteVerkoopdatum |                      | KAD                  | Perceel         |                       |                 |
|                         | oppervlakte         |                      | KAD                  | Perceel         | Kadastrale groottte   |                 |
|                         | bestemming          |                      | IMRO                 | Enkelbestemming | hoofdBestemmingsgroep |                 |
|                         | Geometrie           | GM_Surface           | KAD                  | Perceel         | Begrenzing            | GM_Surface      |
|                         | ligtinGemeente      |                      | KAD                  | Gemeente        | Code                  |                 |
|                         | ligtinWaterschap    |                      | KAD                  | Waterschap      | Code                  |                 |

### Gemeente

| **Productmodel Gebouw** |               |                      | **Bronregistraties** |                |               |              |
|-------------------------|---------------|----------------------|----------------------|----------------|---------------|--------------|
| **Objecttype**          | **attribuut** | **datatype**         | **Registratie**      | **objecttype** | **attribuut** | **datatype** |
| Gemeente                | Code          | CharacterString {id} |                      |                |               |              |
|                         | Naam          |                      |                      |                |               |              |
|                         | Adres         |                      |                      |                |               |              |

### 

### Waterschap

| **Productmodel Gebouw** |               |                      | **Bronregistraties** |                |               |              |
|-------------------------|---------------|----------------------|----------------------|----------------|---------------|--------------|
| **objecttype**          | **attribuut** | **datatype**         | **Registratie**      | **objecttype** | **attribuut** | **datatype** |
| Waterschap              | Code          | CharacterString {id} |                      |                |               |              |
|                         | Naam          |                      |                      |                |               |              |
|                         | Adres         |                      |                      |                |               |              |

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
