package agentinsurancesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@EnableAsync
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

