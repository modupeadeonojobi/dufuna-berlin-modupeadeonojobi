package com.dufuna.berlin.imodupsy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author iModupsy
 * @created 04/07/2022
 */

@SpringBootApplication
@Slf4j
public class DufunaBerlinApplication {
    public static void main(String[] args) {
        SpringApplication.run(DufunaBerlinApplication.class, args);
        log.info(
                "\n\n ============================ APPLICATION LAUNCHED!!! ======================= \n\n");
    }

}
