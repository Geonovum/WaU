# Mapping UML - SKOS begrippen

Elementen in **bold** zijn in nieuw SAM begrippenkader gedefiniëerd. 

## Adres + eigenschappen

| UML element | URI begrip | Opmerkingen |
|-------------|------------|-------------|
| Adres       | http://bag.basisregistraties.overheid.nl/id/begrip/Adres | |
| domein | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/domein | | 
| huisletter | http://bag.basisregistraties.overheid.nl/id/begrip/Huisletter | |
| huisnummer | http://bag.basisregistraties.overheid.nl/id/begrip/Huisnummer | |
| huisnummertoevoeging | http://bag.basisregistraties.overheid.nl/id/begrip/Huisnummertoevoeging | |
| identificatie | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/identificatie | |
| isHoofdadres | http://bag.basisregistraties.overheid.nl/id/begrip/Hoofdadres | |
| **omschrijving** | https://begrippen.geostandaarden.nl/sam/id/begrip/omschrijving | Niet gevonden in BAG | 
| **plaatsnaam** | https://begrippen.geostandaarden.nl/sam/id/begrip/plaatsnaam | Met `closeMatch` naar BAG `Naam` |
| postcode | http://bag.basisregistraties.overheid.nl/id/begrip/Postcode | |
| **straatnaam** | https://begrippen.geostandaarden.nl/sam/id/begrip/straatnaam | Met `closeMatch` naar BAG `Naam` | 

## Gebouw + eigenschappen 

| UML element | URI begrip | Opmerkingen |
|-------------|------------|-------------|
| Gebouw | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/gebouw | |
| bouwjaar | http://bag.basisregistraties.overheid.nl/id/begrip/OorspronkelijkBouwjaar | |
| **sloopjaar** | https://begrippen.geostandaarden.nl/sam/id/begrip/sloopjaar | Met `related` naar BAG `PandGesloopt` |
| **geometrie** | https://begrippen.geostandaarden.nl/sam/id/begrip/geometrie | Met `closeMatch` naar NEN3610 `georeferentie` en `narrowMatch` naar BAG `Geometrie` |
| **3d** | https://begrippen.geostandaarden.nl/sam/id/begrip/3d_geometrie | |
| bovenaanzicht | http://bag.basisregistraties.overheid.nl/id/begrip/Geometrie | |
| **maaiveld** | https://begrippen.geostandaarden.nl/sam/id/begrip/maaiveldgeometrie | ontbreekt in [IMGeo begrippenkader](https://definities.geostandaarden.nl/imgeo/nl/) |
| identificatie | http://definities.geostandaarden.nl/nen3610-2022/id/begrip/identificatie | |
| **type** | https://begrippen.geostandaarden.nl/sam/id/begrip/gebouwtype | Met `narrowMatch` naar BAG `Gebruiksdoel`, BGT `Bgt-type_overigBouwwerk`, BGT `Plus-type_overigBouwwerk`, en BRT `TypeGebouw`. **Vraag**: `narrowMatch` of `related`? |
| **heeft als adres** | http://bag.basisregistraties.overheid.nl/id/begrip/Adres | Is geen apart begrip want voegt niets toe aan het BAG begrip Adres. |
