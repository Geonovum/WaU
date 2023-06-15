# Change requests

This section describes some possible change requests for existing standards.

## MIM standard

- Mechanism for specifying inverse relations. Orchestration needs to be able to traverse relations in both directions. Therefore, the inverse relation has to be specified (e.g. name and cardinality).
- Mechanism for specifying identification for modelelements. The knowledge graph needs http-URIs to reference modelelements and implement dereferencing. the proposed mechanism is described in [uc3](https://github.com/Geonovum/WaU-UC3/blob/main/mim2rdf.md#generatie-mim-ontologie)
- Mechanism for specifying generalisations for attributes and relations. In order give further context and facilitate analysis it is important to be apply taxonomy to attributes and relations. The proposed mechanism is described in [UC3](https://github.com/Geonovum/WaU-UC3/blob/main/mim2rdf.md#subpropertyof-extention).