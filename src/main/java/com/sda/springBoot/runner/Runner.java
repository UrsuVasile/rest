package com.sda.springBoot.runner;

import com.sda.springBoot.dto.CaramidaDTO;
import com.sda.springBoot.service.CaramidaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class,args);

        CaramidaService caramidaService = new CaramidaService();

        List<CaramidaDTO> caramidaDTOList = caramidaService.findCaramida();
        for (int i = 0; i < caramidaDTOList.size(); i++) {
            System.out.println(caramidaDTOList.get(i));
        }

    }
}
