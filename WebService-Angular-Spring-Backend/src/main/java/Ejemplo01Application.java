

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.presupuesto.controller", "com.presupuesto.repository", "com.presupuesto.service", "com.presupuesto.serviceImp"})
public class Ejemplo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo01Application.class, args);
	}

}
