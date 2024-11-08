package pe.joedayz.movierecommendersystem;

import org.springframework.stereotype.Service;

@Service("CF")
public class CollaborativeFilter implements Filter {

  public CollaborativeFilter() {
    System.out.println("CollaborativeFilter constructor called");
  }

  public String[] getRecommendations(String movie){
    //logic of content based filter
    return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
  }
}
