package com.example.webflux_r2dbc.connect.service;

import com.example.webflux_r2dbc.connect.entity.DataEntity;
import com.example.webflux_r2dbc.connect.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class MainService {

    private final DataRepository dataRepository;

    public Flux<DataEntity> getData() {
        return dataRepository.findAll();
    }
}
