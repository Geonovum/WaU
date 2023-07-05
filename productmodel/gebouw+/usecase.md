## Automatisch vertalen van het cross domain model (IMX) naar implementatiebestanden voor KKG en orchestratie-engine

Binnen een basis- of kernregistratie worden de relaties tussen concepten in het
informatiemodel uitgedrukt. Bijvoorbeeld een BAG Nummeraanduiding verwijst naar
een BAG OpenbareRuimte. Het cross domain model (IMX) beschrijft de relaties
tussen concepten in verschillende basis- en kernregistraties. Bijvoorbeeld de
relatie tussen een BRT Gebouw, een BAG Pand en een BGT Pand en Overigbouwwerk.
Het is als het ware een semantische (orchestratie)laag over de verschillende
registraties heen.

De relaties tussen concepten in verschillende informatiemodellen worden in het
cross domain model (IMX) gelegd met o.m. «traces».

Deze «traces» vormen -naast de bestaande relaties in de informatiemodellen- de
input voor de Kadaster Knowledge Graph (KKG) model en de orchestratie-engine om
verbindingen tussen concepten te leggen.

Met deze use case willen we het volgende bereiken:

-   Het MDA geautomatiseerd omzetten van het cross domain model (IMX) naar
    implementatiebestanden als input voor de KKG model en de
    orchestratie-engine.

-   Het aansluiten van één of meer product API’s op de orchestratielaag op basis
    van het productmodel Gebouw+ (zie Gegevensdefinitie) als subset van het
    semantisch model.

![Afbeelding met diagram Automatisch gegenereerde
beschrijving](media/547672f30ca05e9e77ebecc364759e23.png)

### User story

**Als** beheerder van het cross domain model

**Wil ik** met één druk op de knop de implementatiebestanden voor KKG en
orchestration engine kunnen aanmaken,

**Zodat** de semantische relaties geautomatiseerd kunnen worden ingelezen en
bijgewerkt in deze twee modellen.

### Doelstellingen High5-3

-   Toepassen op Gebouw+: Het cross domain model bevat daarvoor tenminste BAG,
    BGT\|IMGeo, Ruimtelijke Plannen en perceel en gemeentegrenzen uit IMKAD.

-   De eisen aan cross domain model en daaruit gegeneerde ontologie voor
    implementatie in Kadaster Knowledgde Graph worden opgesteld.

-   Opstellen formele taal voor model mapping (vertaalspecificaties).

-   ShapeChange o.i.d als tool om cross domain model (IMX) om te zetten naar
    implementatiebestanden voor KKG model en orchestration engine.

-   Uitbreiden capabilities van de orchestration engine en OCG API Provider met
    o.m. paging.
