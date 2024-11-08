package pe.joedayz.movierecommendersystem;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		ContentBasedFilter cbf = (ContentBasedFilter) context.getBean("CBF");
		System.out.println("\nContentBasedFilter bean created with singleton scope: " );
		System.out.println(cbf);


		Movie movie1 = cbf.getMovie();
		Movie movie2 = cbf.getMovie();
		Movie movie3 = cbf.getMovie();

		System.out.println("\nMovie bean created with prototype scope: " );
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		System.out.println("\nTotal instances of Movie created: " + Movie.getInstances());
		System.out.println("Total instances of ContentBasedFilter created: " + ContentBasedFilter.getInstances());


	}

}
