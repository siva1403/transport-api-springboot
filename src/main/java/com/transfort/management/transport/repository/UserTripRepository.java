package com.transfort.management.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transfort.management.transport.entities.UserTripDetailsEntity;


public interface UserTripRepository extends JpaRepository<UserTripDetailsEntity, Long> {

}
