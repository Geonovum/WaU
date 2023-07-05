package nl.geostandaarden.product.gebouw;

import io.carml.engine.function.FnoFunction;
import io.carml.engine.function.FnoParam;

public class GebouwFunctions {
  private static final String FN = "http://geostandaarden.nl/id/function/";

  @FnoFunction(FN + "getPredicateIri")
  public String getPredicateIri(@FnoParam(FN + "idParam")String id, @FnoParam(FN + "valueParam")String predicate) {
    if (id == null || predicate == null) {
      return null;
    }

    if (id.startsWith("G")) {
      return "http://modellen.geostaandaarden.nl/def/imgeo#" + predicate ;
    } else {
      return "http://bag.basisregistraties.overheid.nl/def/bag#" + predicate ;
    }
  }

  @FnoFunction(FN + "getTypeIri")
  public String getTypeIri(@FnoParam(FN + "idParam")String id, @FnoParam(FN + "valueParam")String type) {
    if (id == null || type == null) {
      return null;
    }

    if (id.startsWith("G")) {
      return "http://modellen.geostandaarden.nl/def/imgeo#" + type ;
    } else {
      return "http://bag.basisregistraties.overheid.nl/def/bag#" + type ;
    }
  }

  @FnoFunction(FN + "getObjectIri")
  public String getObjectIri(@FnoParam(FN + "idParam")String id, @FnoParam(FN + "valueParam") String type) {
    if (id == null || type == null) {
      return null;
    }

    var lcaseType = type.toLowerCase();

    if (id.startsWith("G")) {
      return "http://bgt.basisregistraties.overheid.nl/bgt/id/" + lcaseType + "/" + id ;
    } else {
      return "http://bag.basisregistraties.overheid.nl/bag/id/" + lcaseType + "/" + id ;
    }
  }
}
