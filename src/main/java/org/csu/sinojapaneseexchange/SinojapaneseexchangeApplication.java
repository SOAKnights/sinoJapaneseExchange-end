package org.csu.sinojapaneseexchange;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csu.sinojapaneseexchange.persistence")
public class SinojapaneseexchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SinojapaneseexchangeApplication.class, args);
    }

}

