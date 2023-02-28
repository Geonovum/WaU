# Architecture goals

## Model-driven

The mapping of one or more datasets to a single orchestrated dataset is specified on the level of the logical information model, regardless of the way the data is published (e.g. APIs, serialization formats).

## Heterogeneous data sources

The orchestration engine must be able to retrieve data from data sources providing completely different types of interfaces. For example: one data source can be a REST API, while another data source can be a GraphQL API or a CSV file.

## Lineage tracking

For every object instance, we want to track:
- The origin(s) of every data element
- Which algorithms have been applied
- Which data services have been requested and when
