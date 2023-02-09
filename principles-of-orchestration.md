# Principles of orchestration

## All properties in a target model should be queryable

When orchestrating one or more services a translation is applied mapping the respective source model(s) to a target model. This translation can include transformations resulting in inferred properties in the target model. Users of the orchestrated service should be able to apply filters and such to these inferredproperties. Sometimes requiring te reverse the declared mapping to be able to match the value to data in source registries.

## Orchestration engine should coerce datatypes based on model information

A property modelled in a target model might not have the same associated datatype as the property it is mapped to in a source model. In this case the engine should apply type coercion

## The orchestration engine should throw an error when a property exists in the source model for which there is no mapping defined. 

The target model should be limited to information that is to be exchanged.
Guidelines for this should be clearly defined. E.g. what about the semantics in a product target model? e.g. supertypes and/or abstract types? Should a product model be a subset of a larger model and would that be a conceptual or a logical model? 

## lineage for null values in orchestrated object

Mapping rules can result in null values for various reasons. The most obvious one being when the source object has no value for the given attribute.
Another is that the defined algorithm yields no result with the given input (which are not null). We should investigate whether lineage information is useful for a property for which the value is null? Note that with a null value that there is no statement which can serve as the subject for the lineage information.
