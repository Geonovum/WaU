# Change requests

This section describes some possible change requests for existing standards.

## MIM standard

- Mechanism for specifying inverse relations. Orchestration needs to be able to traverse relations in both directions. Therefore, the inverse relation has to be specified (e.g. name and cardinality). The proposed mechanism is described in [inverse relations](./inverse-relations.md). This is conform the current version of MIM. The change request is to clearly describe this as a MIM-feature.
- Mechanism for specifying identification for modelelements. For a knowledge graph URI's are needed in order to be able to refer to modelelements and implement dereferencing. The proposed mechanism is described in [UC3](https://github.com/Geonovum/WaU-UC3/blob/main/mim2rdf.md#generatie-mim-ontologie)
- Mechanism for specifying generalisations for attributes and relations. In order provide further context and facilitate search and analysis it is important to be able to apply taxonomy to attributes and relations. The proposed mechanism is described in [UC3](https://github.com/Geonovum/WaU-UC3/blob/main/mim2rdf.md#subpropertyof-extention).
- More strict rules regarding naming conventions. This issue is described in [UC3](https://github.com/Geonovum/WaU-UC3/blob/main/mim2rdf.md#conventie-naamgeving). Furthermore, the agreed upon pattern SHOULD include the rule that names always start with a non-numeric character, a letter. This improves usability in programming frameworks.
- Mechanism for describing **data elements** (not to be confused with [data element](https://docs.geostandaarden.nl/mim/mim/#data-element) in Dutch). Our usecase requires attaching lineage information to data elements. The proposed mechanism is described in [Wau-metadata](https://geonovum.github.io/WaU-Metadata/) and [wau-lin](https://github.com/geonovum/WaU-LIN/)

## Individual registrations

- BGT: Include a clean relations from BGT Pand to BAG Pand. In the current BGT model, the identifictieBAGPND attribute of BGT Pand is a CharacterString, but for a good clean connection to the BAG this should be an association relation to the BAG Pand object. Same for OpenbareRuimte(Label).
- BRK-PB: same as BGT ->  From Werkingsgebied it should have an clean relation to BGT, BRT or BRK object instead of defining an own Class for example BGT-ObjectRef.
