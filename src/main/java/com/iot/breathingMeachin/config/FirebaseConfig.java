package com.iot.breathingMeachin.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseConfig {
    public static void initializeFirebase() throws IOException {
        System.out.println("Bat dau");
        FileInputStream serviceAccount =
                new FileInputStream("E://Term 1 Year 4//IOT//breathingMeachin//src//main//java//com//iot//breathingMeachin//config//firebase_config.json");
        System.out.println("doc file thanh cong");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://demoioT-fir-iot-ac6b9.firebaseio.com")
                .build();
        FirebaseApp.initializeApp(options);
    }
}
