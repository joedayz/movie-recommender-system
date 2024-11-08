package pe.joedayz.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class,
        args);

    RecommenderImplementation recommender = context.getBean(RecommenderImplementation.class);
    System.out.println(recommender);
    System.out.println(recommender.getFilter());


  }

}
