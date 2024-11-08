package pe.joedayz.movierecommendersystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named("CBF")
public class ContentBasedFilter implements Filter {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public ContentBasedFilter() {
    logger.info("In ContentBasedFilter constructor method");
  }


  @PostConstruct
  private void postConstruct(){
    logger.info("In ContentBasedFilter.postConstruct() method");
  }

  public String[] getRecommendations(String movie){
    //logic of content based filter
    return new String[]{"Happy Feet", "Ice Age2", "Shark Tale"};
  }

  @PreDestroy
  private void preDestroy(){
    logger.info("In ContentBasedFilter.preDestroy() method");
  }

}
