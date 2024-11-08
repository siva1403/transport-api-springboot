package com.transfort.management.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transfort.management.transport.entities.RouteUserEntity;


public interface RouteUserRepository extends JpaRepository<RouteUserEntity, Long> {

}
