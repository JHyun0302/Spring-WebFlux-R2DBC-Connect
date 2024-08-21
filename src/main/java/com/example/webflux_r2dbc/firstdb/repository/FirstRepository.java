package com.example.webflux_r2dbc.firstdb.repository;

import com.example.webflux_r2dbc.firstdb.entity.FirstEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface FirstRepository extends R2dbcRepository<FirstEntity, Integer> {
}
