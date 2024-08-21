package com.example.webflux_r2dbc.controller;

import com.example.webflux_r2dbc.firstdb.entity.FirstEntity;
import com.example.webflux_r2dbc.firstdb.repository.FirstRepository;
import com.example.webflux_r2dbc.seconddb.entity.SecondEntity;
import com.example.webflux_r2dbc.seconddb.repository.SecondRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final FirstRepository firstRepository;

    private final SecondRepository secondRepository;

    @GetMapping("/")
    public String mainPage() {
        Flux<FirstEntity> data1 = firstRepository.findAll();
        data1.subscribe(x -> {
            System.out.println(x);
        });

        Flux<SecondEntity> data2 = secondRepository.findAll();
        data2.subscribe(x -> {
            System.out.println(x);
        });

        return "h1";
    }
}
