package pe.joedayz.movierecommendersystem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Movie {

  private static int instances = 0;

  private int id;
  private String name;
  private String genre;
  private String producer;

  public Movie() {
    instances++;
    System.out.println("Movie constructor called");
  }

  public static int getInstances() {
    return instances;
  }
}
