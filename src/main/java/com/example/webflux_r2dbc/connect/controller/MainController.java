//package com.example.webflux_r2dbc.connect.controller;
//
//import com.example.webflux_r2dbc.connect.entity.DataEntity;
//import com.example.webflux_r2dbc.connect.service.MainService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Flux;
//
//@RestController
//@RequiredArgsConstructor
//public class MainController {
//
//    private final MainService mainService;
//
//    @GetMapping("/")
//    public Flux<DataEntity> mainP() {
//        return mainService.getData();
//    }
//}
