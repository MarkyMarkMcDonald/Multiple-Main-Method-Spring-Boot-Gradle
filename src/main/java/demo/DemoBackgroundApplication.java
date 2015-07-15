package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
@Profile("background")
public class DemoBackgroundApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        throw new RuntimeException("Failed to run the background job");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoBackgroundApplication.class, args);
    }
}
