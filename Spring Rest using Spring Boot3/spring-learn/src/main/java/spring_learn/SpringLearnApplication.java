package spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        LOGGER.info("START");

        displayCountry();

        SpringApplication.run(SpringLearnApplication.class, args);

        LOGGER.info("END");
    }

    public static void displayCountry() {

        LOGGER.info("Inside displayCountry()");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        LOGGER.info("country.xml loaded successfully");

        Country country =
                context.getBean("country", Country.class);

        LOGGER.info("Country : {}", country);
    }
}