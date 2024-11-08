package pe.joedayz.movierecommendersystem;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

//		RecommenderImplementation recommender = context.getBean(RecommenderImplementation.class);
//
//
//		String[] result = recommender.recommendMovies("Finding Dory");
//		System.out.println(Arrays.toString(result));

//		CollaborativeFilter cf1 = context.getBean(CollaborativeFilter.class);
//		CollaborativeFilter cf2 = context.getBean(CollaborativeFilter.class);
//		CollaborativeFilter cf3 = context.getBean(CollaborativeFilter.class);
//
//		System.out.println(cf1);
//		System.out.println(cf2);
//		System.out.println(cf3);
	}

}
