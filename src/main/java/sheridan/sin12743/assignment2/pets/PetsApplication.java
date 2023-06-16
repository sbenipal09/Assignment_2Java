package sheridan.sin12743.assignment2.pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sheridan.sin12743.assignment2.pets")
public class PetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetsApplication.class, args);
    }

}
