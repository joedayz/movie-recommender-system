package pe.joedayz.movierecommendersystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RecommenderImplementation {


  private Logger logger = LoggerFactory.getLogger(this.getClass());

  private Filter filter;

  @Value("${recommender.implementation.favoriteMovie: Finding Nemo}")
  private String favoriteMovie;


  @PostConstruct
  public void postConstruct(){
    logger.info("In RecommenderImplementation.postConstruct() method");
  }

  public String[] recommendMovies(String movie){
    System.out.println("Name of the filter in use: " + filter +"\n");
    String[] results = filter.getRecommendations(movie);
    return results;
  }

  @Inject
  public void setFilter(@Qualifier("CBF") Filter filter) {
    logger.info("In RecommenderImplementation.setFilter() dependency injection");
    this.filter = filter;
  }

  public Filter getFilter() {
    return filter;
  }

  @PreDestroy
  public void preDestroy(){
    logger.info("In RecommenderImplementation.preDestroy() method");
  }

  public String getFavoriteMovie(){
    return favoriteMovie;
  }


}

