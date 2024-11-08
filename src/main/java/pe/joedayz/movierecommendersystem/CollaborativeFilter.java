package pe.joedayz.movierecommendersystem;

import javax.inject.Named;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Named("CF")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollaborativeFilter implements Filter {

  public CollaborativeFilter() {
    System.out.println("CollaborativeFilter constructor called");
  }

  public String[] getRecommendations(String movie){
    //logic of content based filter
    return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
  }
}
