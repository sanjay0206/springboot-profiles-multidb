package com.spring.multidatasource;

import com.spring.multidatasource.entity.Flight;
import com.spring.multidatasource.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightApplication.class, args);
		System.out.println("FlightApplication is running...");
	}


	@Bean
	CommandLineRunner commandLineRunner(FlightRepository flightRepository) {
		return args -> {

			List<Flight> flights = Arrays.asList(
					new Flight("Flight 101", "Miami", "New York"),
					new Flight("Flight 102", "Dallas", "Los Angeles"),
					new Flight("Flight 103", "Houston", "Chicago"),
					new Flight("Flight 104", "Seattle", "San Francisco")
			);

			flightRepository.saveAll(flights);

		};
	}

}
