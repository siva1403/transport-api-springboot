package com.transfort.management.transport.service;

import java.util.Map;

import com.transfort.management.transport.entities.BusDriverEntity;
import com.transfort.management.transport.entities.BusEntity;
import com.transfort.management.transport.entities.PolylineEntity;
import com.transfort.management.transport.entities.RouteBusEntity;
import com.transfort.management.transport.entities.RouteEntity;
import com.transfort.management.transport.entities.RouteStopsEntity;
import com.transfort.management.transport.entities.RouteUserEntity;
import com.transfort.management.transport.entities.StopEntity;
import com.transfort.management.transport.entities.UserTripDetailsEntity;

public interface TransportSevice {

	Map<Object, Object> addBus(BusEntity bus);
	Map<Object, Object> updateBusDetails(BusEntity bus, long busId);
	Map<Object, Object> getBusDetails();

	Map<Object, Object> addRoute(RouteEntity route);
	Map<Object, Object> updateRouteDetails(RouteEntity route, long routeId);
	Map<Object, Object> getRouteDetails();

	Map<Object, Object> addStop(StopEntity stop);
	Map<Object, Object> updateStopDetails(StopEntity stop, long stopId);
	Map<Object, Object> getStopDetails();
	
	Map<Object, Object> addRouteStops(RouteStopsEntity routeStops);
	Map<Object, Object> updateRouteStopDetails(RouteStopsEntity routeStop, long routeStopId);
	Map<Object, Object> getRouteStopDetails();
	Map<Object, Object> deleteRouteStop(long routeStopId);
	
	Map<Object, Object> addRouteBus(RouteBusEntity routeBus);
	Map<Object, Object> updateRouteBusDetails(RouteBusEntity routeBus, long routeBusId);
	Map<Object, Object> getRouteBusDetails();
	Map<Object, Object> deleteRouteBus(long routeBusId);
	
	Map<Object, Object> addPolyline(PolylineEntity polyline);
	Map<Object, Object> updatePolylineDetails(PolylineEntity polyline, long polylineId);
	Map<Object, Object> getPolylineDetails();
	
	Map<Object, Object> addBusDriver(BusDriverEntity busDriver);
	Map<Object, Object> updateBusDriverDetails(BusDriverEntity busDriver, long busDriverId);
	Map<Object, Object> getBusDriverDetails();
	Map<Object, Object> deleteBusDriver(long busDriverId);
	
	Map<Object, Object> addUserTripDetails(UserTripDetailsEntity userTrip);
	Map<Object, Object> updateUserTripDetails(UserTripDetailsEntity userTrip, long userTripId);
	Map<Object, Object> getUserTripDetails();
	
	Map<Object, Object> addRouteUser(RouteUserEntity routeUser);
	Map<Object, Object> updateRouteUserDetails(RouteUserEntity routeUser, long routeUserId);
	Map<Object, Object> getRouteUserDetails();
	Map<Object, Object> deleteRouteUser(long routeUserId);

}
