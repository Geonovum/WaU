package nl.geostandaarden.product.gebouw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.dotwebstack", "nl.geostandaarden.product.gebouw"})
public class GebouwLdApplication {

  public static void main(String[] args) {
    SpringApplication.run(GebouwLdApplication.class, args);
  }
}
