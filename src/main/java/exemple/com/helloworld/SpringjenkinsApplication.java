package exemple.com.helloworld;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringjenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjenkinsApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello Docker World!";
    }
}