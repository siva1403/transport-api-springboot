package com.transfort.management.transport.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "route_stops")
public class RouteStopsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stopid", nullable = false)
    private StopEntity stop;

    @ManyToOne
    @JoinColumn(name = "routeid", nullable = false)
    private RouteEntity route;

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

	public StopEntity getStop() {
		return stop;
	}

	public void setStop(StopEntity stop) {
		this.stop = stop;
	}

	public RouteEntity getRoute() {
		return route;
	}

	public void setRoute(RouteEntity route) {
		this.route = route;
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
