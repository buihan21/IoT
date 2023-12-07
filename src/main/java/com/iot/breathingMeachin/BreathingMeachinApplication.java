package com.iot.breathingMeachin;

import com.iot.breathingMeachin.config.FirebaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BreathingMeachinApplication {

	public static void main(String[] args) {
		try {
			FirebaseConfig.initializeFirebase();
		} catch (IOException e) {
			System.out.println("Ket noi Firebase that bai!!");
			e.printStackTrace();
		}
		SpringApplication.run(BreathingMeachinApplication.class, args);
	}

}
