package com.example.JpaQuery10_03.eserciziVari;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

public class due {


    @SpringBootApplication
    public static class GreetingApplication {
        public static void main(String[] args) {
            SpringApplication.run(GreetingApplication.class, args);
        }
    }

    @RestController
    @RequestMapping("/v2/ciao")
    static
    class GreetingController {
        @GetMapping("/{provincia}")
        public GreetingResponse greet(@PathVariable String provincia, @RequestParam String nome) {
            return new GreetingResponse(nome, provincia, "Ciao " + nome + ", com'è il tempo in " + provincia + "?");
        }
    }

    static class GreetingResponse {
        private String nome;
        private String provincia;
        private String saluto;

        public GreetingResponse(String nome, String provincia, String saluto) {
            this.nome = nome;
            this.provincia = provincia;
            this.saluto = saluto;
        }

        public String getNome() {
            return nome;
        }

        public String getProvincia() {
            return provincia;
        }

        public String getSaluto() {
            return saluto;
        }
    }
}
