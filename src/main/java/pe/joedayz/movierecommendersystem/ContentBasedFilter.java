package pe.joedayz.movierecommendersystem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("CBF")
public class ContentBasedFilter implements Filter{

  public ContentBasedFilter() {
    System.out.println("ContentBasedFilter constructor called");
  }

  public String[] getRecommendations(String movie){
    //logic of content based filter
    return new String[]{"Happy Feet", "Ice Age2", "Shark Tale"};
  }
}
