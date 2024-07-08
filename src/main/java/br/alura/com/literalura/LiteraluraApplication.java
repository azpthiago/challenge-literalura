package br.alura.com.literalura;

import br.alura.com.literalura.principal.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
    @Autowired
    private MenuService menuService;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        menuService.showMenu();
    }
}
