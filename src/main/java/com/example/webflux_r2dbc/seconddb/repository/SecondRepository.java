package com.example.webflux_r2dbc.seconddb.repository;

import com.example.webflux_r2dbc.firstdb.entity.FirstEntity;
import com.example.webflux_r2dbc.seconddb.entity.SecondEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface SecondRepository extends R2dbcRepository<SecondEntity, Integer> {
}
