package com.curso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoUdemyApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(CursoUdemyApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(CursoUdemyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Iniciando Run...");
        int valor = 4;
        System.out.println("o valor é:" + valor);
        System.out.println("Finalizando Run...");
    }
}
