# Specifying inverse relations in MIM

As per the requirement from orchestration we have need for a way to specify inverse relationships.

For this we create a [relatiesoort](https://docs.geostandaarden.nl/mim/mim/#relatiesoort), using both "relatierolDoel" and "relatierolBron" to define the relationships from each end. The relation still has a direction. This also indicates the property that is explicitly available of which the source is the owner. The inverse property is only available by inference (which could also lead to materialization). 

This is nog equal to simply defining a relatiesoort both ways as this would not result in these relatiesoorten being inverse to each other. When this is the case, one could look at adding a mim:metagegeven connecting the two. For our usecase we defined two properties on one relatiesoort.

This fits since the relatierol itself represents a Property.

![](https://docs.geostandaarden.nl/mim/mim/media/AssociatierollenZonderMetagegevens.png)

Question: Does this mean our relatiesoort is [unidirectional](https://docs.geostandaarden.nl/mim/mim/#metagegeven-unidirectioneel) or not? 

An example looks as follows: 
Here the relatiesoort element is unidentified as it is already encapsulated at the relatieroldoel element.
![](images/example-inverse.png)