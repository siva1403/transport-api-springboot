package com.transfort.management.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transfort.management.transport.entities.StopEntity;


public interface StopRepository extends JpaRepository<StopEntity, Long> {

}
