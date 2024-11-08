package com.transfort.management.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transfort.management.transport.entities.RouteStopsEntity;


public interface RouteStopsRepository extends JpaRepository<RouteStopsEntity, Long> {

}
