package ke.oanisha;

import org.springframework.boot.SpringApplication;

public class TestOanishaApplication {

	public static void main(String[] args) {
		SpringApplication.from(OanishaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
