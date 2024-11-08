package com.transfort.management.transport.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_trip_details")
public class UserTripDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userid", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "pickup_stop", nullable = false)
    private StopEntity pickupStop;

    @ManyToOne
    @JoinColumn(name = "drop_stop", nullable = false)
    private StopEntity dropStop;

    @Column(name = "home_address", length = 1024)
    private String homeAddress;

    @Column(name = "status", columnDefinition = "boolean default false")
    private Boolean status;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "modified_on")
    private Timestamp modifiedOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public StopEntity getPickupStop() {
		return pickupStop;
	}

	public void setPickupStop(StopEntity pickupStop) {
		this.pickupStop = pickupStop;
	}

	public StopEntity getDropStop() {
		return dropStop;
	}

	public void setDropStop(StopEntity dropStop) {
		this.dropStop = dropStop;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

}
