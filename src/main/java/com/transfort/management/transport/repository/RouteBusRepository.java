package com.transfort.management.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transfort.management.transport.entities.RouteBusEntity;


public interface RouteBusRepository extends JpaRepository<RouteBusEntity, Long> {

}
