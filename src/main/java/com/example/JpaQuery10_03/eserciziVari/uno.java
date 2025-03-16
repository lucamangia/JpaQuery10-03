package com.example.JpaQuery10_03.eserciziVari;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class uno {


    @SpringBootApplication
    public static class GreetingApplication {
        public static void main(String[] args) {
            SpringApplication.run(GreetingApplication.class, args);
        }
    }

    @RestController
    static
    class GreetingController {
        @GetMapping("/v1/ciao")
        public String greet(@RequestParam String nome, @RequestParam String provincia) {
            return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        }
    }
}
