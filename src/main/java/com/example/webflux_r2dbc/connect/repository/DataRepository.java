package com.example.webflux_r2dbc.connect.repository;

import com.example.webflux_r2dbc.connect.entity.DataEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

public interface DataRepository extends R2dbcRepository<DataEntity, Integer> {
}

//Reactive MongoDB 연결
//public interface DataRepository extends ReactiveMongoRepository<DataEntity, Integer> {
//}
