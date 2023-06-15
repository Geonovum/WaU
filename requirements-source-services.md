# Requirements to connect a source service to the Kadaster orchestration engine

To connect source services to the Kadaster orchestration engine, there are
several requirements that need to be met. This document describes requirements
on service description, query interface, service capabilities, optimization
techniques and service availability.

## Service description

>   Requirement 1. The source service must describe itself using
>   machine-readable language.

### MIM-serialisation

Typically, the data provided by a source service is described in an information
model or data model. A data model is a conceptual representation of data
structures, relationships, and rules that define how data is organized, stored,
and accessed within a system or database.

The orchestration engine needs to know the structure and relationships of the
data provided by a source service in order to query the data. This structure can
be automatically configured in the orchestration engine based on an specific XML
serialization of the information model based on the Metamodel for Information
Modeling (MIM). This requires that the data from the source service is modeled
in an information model based on MIM.

The specific requirements and rules that the MIM sets for an information model
are described in: https://docs.geostandaarden.nl/mim/mim/

### Metadata

The orchestration engine needs information about the source service to
supplement the description of the data's structure and relationships.

This information includes source service name/namespace, ... The metadata must
be made available in machine-readable JSON format.

The specific requirements and syntax of the metadata description of the source
service the orchestration engine requires, are described here: @@URI@@

## Query interface

>   Requirement 2. The source service must be able to expose the data based on
>   the query interface of the orchestration engine.

### Query language

The query interface, also known as a query API, is the component that allows the
orchestration engine to interact with the source service using queries. For the
Kadaster orchestration engine, a well-defined interface is provided through
which queries can be formulated, executed, and results obtained. It uses the
GraphQL query language to request the source service to gain a JSON output.
Geometry is retreived as WKT-format?

The specific implementation and syntax for the query interface the orchestration
engine requires, is described here:

### Adaptor

An adaptor is the component that acts as an intermediary between the
orchestration engine and the source service. It facilitates seamless
communication and integration by translating the specific requirements,
protocols, and data formats of the orchestration engine into a format that the
source service can understand and interact with. The adaptor handles the
necessary transformations and data mappings to ensure compatibility and smooth
information exchange between the orchestration engine and the source service.

Reference implementations of such an adaptor are available in various
formats/standards, e.g. for a source service that provides data based on OGC API
Feature standard, as a REST API or as ...

If a source service provides the data in a different format or standard, a
custom adapter must be programmed to connect the source service to the
orchestration engine.

The specific implementation and syntax for an adaptor to connect a source
service to the orchestration engine, is described here: @@URI@@

## Source service capabilities

>   Requirement 3. The source service must have the capabilities of sorting,
>   paging and filtering.

### Paging

Paging refers to a mechanism used to retrieve large amounts of feature data from
a service in smaller, manageable chunks or pages.

It is common to have datasets that contain a significant number of features,
which may be impractical to retrieve all at once due to bandwidth limitations or
performance considerations. Paging allows the orchestration engine to retrieve
subsets of features in a controlled manner.

By using paging, the orchestration engine can efficiently retrieve large
datasets incrementally, reducing the amount of data transferred and improving
performance. It also enables the orchestration engine to navigate through the
feature set and process the data in smaller, more manageable portions.

The specific implementation and syntax for paging the orchestration engine
requires, is described here: @@URI@@

### Sorting

Sorting refers to the arrangement of data based on a specific attribute or
property, such as alphabetical order or numerical value. It enables the
orchestration engine to organize and retrieve data from a source service based
on the desired criteria, facilitating efficient data analysis and exploration by
users in a front end API.

The specific implementation and syntax for sorting the orchestration engine
requires, is described here: @@URI@@

### Filtering

Filtering is a mechanism that allows users to extract specific data from a
dataset based on specified conditions or criteria. It enables the orchestration
to query and retriev only the relevant data that match the desired attributes or
spatial relationships, enhancing data extraction efficiency and precision.

The specific implementation and syntax for filtering the orchestration engine
requires, is described here: @@URI@@

## Optimization and performance

>   Requirement 4 The source service should support optimization techniques such
>   as eager loading and batch loading.

### Eager loading

When related object types are part of the same source model and thus exposed by
the same source API, the most efficient way would be to support eager loading.
Eager loading is a data retrieval strategy used which aims to optimize
performance by fetching associated data in a single query, rather than relying
on separate queries for each data relationship. This means that when requesting
Building objects, the related Address objects can be retrieved at the same time
within the same request.

By preloading related data upfront, eager loading reduces the number of database
queries and minimizes latency and enhances application performance by
efficiently fetching all required data in a single query.

The specific implementation and syntax for eager loading the orchestration
engine requires, is described here:

### Batch loading

When related object types are part of different source models and thus exposed
by different source APIs, eager loading is not sufficient enough. In that case
the orchestration always needs to query at least two source APIs, but it can
still leverage efficient access patterns to reduce the number of requests
needed.

Batch loading refers to a process of loading data in bulk rather than
individually. It involves retrieving multiple objects in a single request by
passing a set of identifiers. It prevents having to perform many separate
requests for every single object. For each individual identifier, the source API
may or may not yield a matching object, depending on the existence of the object
in the source dataset.

Batch loading can become even more powerful when combined with eager loading.

The specific implementation and syntax for batch loading the orchestration
engine requires, is described here:

## Service availability

>   Requirement 5: The source service must be exposed and accessible.

### Endpoint

The source service must be accessible and available via the Internet, to enable
the orchestration engine to interact with it. This requires that the (GraphQL?)
endpoints to use to communicate and request data from are provided by the source
service.

...

# 
