# Vertaalspecificaties (model mapping)

Onderstaande tabel geeft de vertaling (model mapping) van gegevens in de
bronregistratie naar de gegevens in het productmodel.

| Productmodel         |                 |               | Bronregistratie |                                     |                                  |                                                                 |
|----------------------|-----------------|---------------|-----------------|-------------------------------------|----------------------------------|-----------------------------------------------------------------|
| Object               | Attribuut       | Conversie     | Registratie     | Object                              |                                  | Conditie                                                        |
| Graafgebied          | geometrie       |               | IMKL-KLIC       | Graafpolygoon                       |                                  |                                                                 |
| Adres                | omschrijving    | *concatenate* | BAG             | Nummeraanduiding                    | huisnummer                       |                                                                 |
|                      |                 |               |                 |                                     | huisletter                       |                                                                 |
|                      |                 |               |                 |                                     | huisnummertoevoeging             |                                                                 |
|                      |                 |               |                 |                                     | postcode                         |                                                                 |
|                      |                 |               | BAG             | Openbareruimte                      | naam                             |                                                                 |
|                      |                 |               | BAG             | Woonplaats                          | naam                             |                                                                 |
|                      |                 |               | BAG             | *\_AdresseerbaarObject*             | hoofdadres                       |                                                                 |
| Gebouw               | type            |               | BRT             | Gebouw                              | type                             |                                                                 |
|                      | functie         |               | BAG             | Verblijfsobject                     | gebruiksdoel                     |                                                                 |
|                      | bouwjaar        |               | BAG             | Pand                                | oorspronkelijkbouwjaar           |                                                                 |
|                      | geometrie       |               | BGT             | Pand                                | geometrie2dGrondvlak             |                                                                 |
|                      |                 |               | BGT             | OverigBouwwerk                      | geometrie                        | bgt-type="overkapping" bgt-type="open loods" plus-type="schuur" |
| OverigeConstructie   | type            |               | BGT             | OverigBouwwerk                      | bgt-type                         | bgt-type="…"                                                    |
|                      |                 |               | BGT             |                                     | plus-type                        | plus-type="…"                                                   |
|                      |                 |               | BGT             | Kunstwerkdeel                       | bgt-type                         | bgt-type="hoogspanningsmast"                                    |
|                      |                 |               | BGT             | Kast                                | plus-type                        | plus-type="…"                                                   |
|                      |                 |               | BGT             | Mast                                | plus-type                        | plus-type="…"                                                   |
|                      |                 |               | BGT             | Paal                                | plus-type                        | plus-type="…"                                                   |
|                      |                 |               | BGT             | Put                                 | plus-type                        | plus-type="…"                                                   |
| Boom                 | geometrie       |               | BGT             | Vegetatieobject[type="boom"]        | geometrie (punt)                 | plus-type="boom"                                                |
|                      |                 |               | BRT-TOP10NL     | Inrichtingselement[type="boom"]     | geometrie (punt)                 | typeInrichtingselement="boom"                                   |
|                      |                 |               |                 | Inrichtingselement[type="bomenrij"] | geometrie (lijn)                 | typeInrichtingselement="bomenrij"                               |
| Bodemsamenstelling   | type            |               | BRO:Bodemkaart  | Soilunit                            | code                             |                                                                 |
|                      |                 |               |                 | Soilunit                            | geometrie                        |                                                                 |
| Waterkering          | type            |               | RP-IMRO         | Dubbelbestemming                    | waterstaat - \*                  |                                                                 |
|                      | geometrie       |               | RP-IMRO         | Dubbelbestemming                    | geometrie                        |                                                                 |
| ArcheologischeWaarde | klasse          | 1             | RP-IMRO         | Dubbelbestemming                    | waarde - archeologische waarde 1 |                                                                 |
|                      | klasse          | 2             | RP-IMRO         | Dubbelbestemming                    | waarde - archeologische waarde 2 |                                                                 |
|                      | klasse          | 3             | RP-IMRO         | Dubbelbestemming                    | waarde - archeologische waarde 3 |                                                                 |
|                      | klasse          | 4             | RP-IMRO         | Dubbelbestemming                    | waarde - archeologische waarde 4 |                                                                 |
|                      | klasse          | 5             | RP-IMRO         | Dubbelbestemming                    | waarde - archeologische waarde 5 |                                                                 |
|                      | geometrie       |               | RP-IMRO         | Dubbelbestemming                    | geometrie                        |                                                                 |
| Beperking            | grondslag       |               | BRK             | Publiekrechtelijke beperking        | grondslag                        |                                                                 |
|                      | geometrie       |               | BRK/BGT         | BGT-ObjectRef                       | *BGT:lokaalid\\geometrie*        |                                                                 |
|                      |                 |               | BRK/BRT         | BRT-ObjectRef                       | *BRT:lokaalid\\geometrie*        |                                                                 |
|                      |                 |               | BRK/BAG         | BAG-ObjectRef                       | *BAG:identificatie\\geometrie*   |                                                                 |
|                      |                 |               | BRK             | Vrije contour                       | geometrie                        |                                                                 |
| Overheidsorganisatie | contactgegevens |               | OWMS            | Organisatie                         | Contactgegevens                  |                                                                 |
|                      | naam            |               | OWMS            | Organisatie                         | naam                             |                                                                 |
| Gemeente             | geometrie       |               | DiS-Geo         | Gemeentegebied                      | geometrie                        |                                                                 |
| Waterschap           | geometrie       |               | DiS-Geo         | Waterschapsgebied                   | geometrie                        |                                                                 |
| Veiligheidsregio     | geometrie       |               | DiS-Geo         | Veiligheidsregiogebied              | geometrie                        |                                                                 |
