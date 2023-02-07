# Architecture

## Architecture goals

- **Model-driven**: the mapping of one or more datasets to a single orchestrated dataset is specified on the level of the logical information model, regardless of the way the data is published (e.g. APIs, serialization formats).
- **Heterogeneous data sources**: the orchestration engine must be able to retrieve data from data sources providing completely different types of interfaces. For example: one data source can be a REST API, while another data source can be a GraphQL API or a CSV file.
