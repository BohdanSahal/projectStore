package com.store;

import com.store.entity.Clothes;
import com.store.entity.Color;
import com.store.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StoreApplication{

    @Autowired
    ColorRepository colorRepository ;


	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}


}
