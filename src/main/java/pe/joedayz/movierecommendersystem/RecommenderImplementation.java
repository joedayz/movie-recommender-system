package pe.joedayz.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {


  private Filter contentBasedFilter;


  public RecommenderImplementation(@Qualifier("CBF") Filter contentBasedFilter) {
    this.contentBasedFilter = contentBasedFilter;
  }

  public String[] recommendMovies(String movie){
    System.out.println("Name of the filter in use: " + contentBasedFilter +"\n");
    String[] results = contentBasedFilter.getRecommendations(movie);
    return results;
  }
}

