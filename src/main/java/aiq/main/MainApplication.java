package aiq.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {MainApplication.class})
public class MainApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(MainApplication.class).run(args);

    }

}



