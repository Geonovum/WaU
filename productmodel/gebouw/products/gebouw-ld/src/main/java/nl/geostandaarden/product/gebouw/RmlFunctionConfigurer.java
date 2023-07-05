package nl.geostandaarden.product.gebouw;

import io.carml.engine.rdf.RdfRmlMapper;
import org.dotwebstack.framework.ext.rml.mapping.RmlMapperConfigurer;
import org.springframework.stereotype.Component;

@Component
public class RmlFunctionConfigurer implements RmlMapperConfigurer {

  @Override
  public void configureMapper(RdfRmlMapper.Builder builder) {
    builder.addFunctions(new GebouwFunctions());
  }
}
