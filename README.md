# WaU

ReSpec documentation: https://geonovum.github.io/WaU/

In this repository we will collect documents related to:

- [Architecture goals](architecture-goals.md)
- [Orchestration principles](orchestration.md)
- [Optimization techniques](optimization-techniques.md)
- [(Possibly) change requests for MIM, and API strategy / design rules](change-requests.md)
- Bottlenecks in establishing cohesive relationships between base and keu registrations
- (Position papers)

## Related repositories

The repositories below contain the specific methodology of use cases and deliverables/results of the project.

### Productmodels and use Cases 
- Productmodel Use Case 1 Adres: https://github.com/Geonovum/WaU/productmodel/adres
- Productmodel Use Case 2 Gebouw: https://github.com/Geonovum/WaU/productmodel/gebouw
- Productmodel Use Case 3 Gebouw+: https://github.com/Geonovum/WaU/productmodel/gebouw+
- Productmodel Use Case 4 Willekeurige vraag: https://github.com/Geonovum/WaU/productmodel/willekeurigevraag
- Productmodel Use Case 5 Graafgebied: https://github.com/Geonovum/WaU/productmodel/graafgebied

## Deliverables

### IMX Geo

We has developed an information model for cross-domain data queries for geo-information: the IMX-Geo. This cross-domain model connects the concepts in geobase and geocore records without having to modify the sources.
https://github.com/Geonovum/IMX-Geo/

### Model mapping

By model mapping, or translation specifications, we mean the translation of data in one model/record to data in the other model/record. We developed a standard, machine-readable language for capturing translation specifications: IMX Model Mapping.
https://github.com/Geonovum/IMX-ModelMapping/

For the IMX-Geo, the translation specifications have been drawn up in Excel and also expressed in YAML.
https://github.com/Geonovum/IMX-Geo/blob/main/mapping/translationspecifications.xlsx
https://github.com/dotwebstack/orchestrate/blob/main/gateway/src/main/resources/mapping/imxgeo-wip.yaml

### Metadata model

We developed an extension to the Metamodel for Information Modelling. This extensive introduction of the metadata “Data element” and “HasMetadata” that were used to link the lineage model (and eventually also other models) to a crossdomain information model. The lineage model describes the data structure for the data lineage metadata.
https://github.com/Geonovum/IMX-Metadata/
https://github.com/Geonovum/IMX-LineageModel

### Orchestration Engine

PLACEHOLDER

### OGC API demo software
We developed a OGC API connector for connecting an OGC API Feature (OAF) service to the orchestration engine. This connector translates the GraphQL queries from the orchestration engine on the source service into API requests that the source service supports.
To connect an OGC product API to the orchestration engine the ldproxy open source software has been extended with a GraphQL Feature Provider.

https://github.com/interactive-instruments/orchestrate-ogcapi
https://github.com/interactive-instruments/ldproxy

### Knowledge Graph

PLACEHOLDER
