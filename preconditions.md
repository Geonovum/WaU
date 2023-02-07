# Preconditions

This document describes the challenges and possible solutions when using existing API's for source retrieval.

## Challenges

In general, REST APIs offer two basic access patterns for a given object type:
- Retrieving a single object by its identifier (passed in the URL)
- Retrieving a paginated collection of objects, combined with filtering & sorting capabilities (using query parameters)

In many cases, an orchestration request needs to query multiple related objects at the same time. An example would be a collection of object type `Building`, enriched with corresponding data elements from object type `Address`. These object types could be part of the same source model, or could be separated in multiple source models.

## Eager loading

When related object types are part of the same source model and thus exposed by the same source API, the most efficiënt way would be to support *eager loading*. This means that when requesting `Building` objects, the related `Address` objects can be retrieved within the same requests.

@TODO describe eager loading in detail for both relations and inverse relations.

Remaining challenge:
* This approach can be problematic for relations with a high cardinality, since the response can become very large, resulting in slow or failing requests. (@TODO: describe alternative approach)

## Batch requests

When related object types are part of different source models and thus exposed by different source APIs, eager loading does not solve this problem. We'll always need to query at least two source APIs, but we can still leverage efficient access patterns to reduce the required number of requests.

Batch loading would make it possible to retrieve multiple objects in a single request by passing a set of identifiers. This would prevent having to perform many separate requests for every single object. For each individual identifier, the source API may or may not yield a matching object, depending on the existence of the object in the source dataset.

Batch loading can become even more powerful when combined with eager loading.

@TODO describe batch requests in detail.
