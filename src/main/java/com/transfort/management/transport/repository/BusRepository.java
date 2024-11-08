package com.transfort.management.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.transfort.management.transport.entities.BusEntity;


public interface BusRepository extends JpaRepository<BusEntity, Long> {

//	@Query(value="select * from admin_user_roles where id=:adminUserRoleId",nativeQuery = true)
//	Optional<AdminUserRolesEntity> getAdminUserRoleById(@Param("adminUserRoleId") Long adminUserRoleId);

}
