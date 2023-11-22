package wilmer.pruebalibro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "wilmer")
public class PruebaLibroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaLibroApplication.class, args);
	}

}
