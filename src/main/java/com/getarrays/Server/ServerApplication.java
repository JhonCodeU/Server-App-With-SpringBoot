package com.getarrays.Server;

import com.getarrays.Server.enumeration.Status;
import com.getarrays.Server.model.Server;
import com.getarrays.Server.repo.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository){
		return args -> {
			serverRepository.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.58", "Fedora Linux", "8 GB", "Work PC", "http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.60", "MS Windows", "32 GB", "Work PC", "http://localhost:8080/server/image/server3.png", Status.SERVER_DOWN));
			serverRepository.save(new Server(null, "192.168.1.61", "Red Hat Linux", "16 GB", "Work PC", "http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.14", "Ubuntu Linux", "8 GB", "Work PC", "http://localhost:8080/server/image/server5.png", Status.SERVER_UP));
		};
	}
}
