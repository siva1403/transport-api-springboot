package com.transfort.management.transport.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.transfort.management.transport.entities.BusEntity;
import com.transfort.management.transport.entities.RouteEntity;


public interface RouteRepository extends JpaRepository<RouteEntity, Long> {

}
