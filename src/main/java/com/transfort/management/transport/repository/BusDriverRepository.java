package com.transfort.management.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transfort.management.transport.entities.BusDriverEntity;


public interface BusDriverRepository extends JpaRepository<BusDriverEntity, Long> {

}
