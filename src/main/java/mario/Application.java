package mario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Minimal Spring Boot application serving HTML5 version of Mario
 *
 * @author Sebastiaan Renkens
  */
@SpringBootApplication
public class Application {

    /**
     * Default main method to start the application
     *
     * @param args parameters to pass
     * @throws Exception any exception
     */
    public static void main(final String... args) {
        SpringApplication.run(Application.class, args);
    }



}
