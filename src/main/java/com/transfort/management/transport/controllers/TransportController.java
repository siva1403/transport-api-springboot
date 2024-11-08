package com.transfort.management.transport.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transfort.management.transport.config.JSONResultEntity;
import com.transfort.management.transport.entities.BusDriverEntity;
import com.transfort.management.transport.entities.BusEntity;
import com.transfort.management.transport.entities.PolylineEntity;
import com.transfort.management.transport.entities.RouteBusEntity;
import com.transfort.management.transport.entities.RouteEntity;
import com.transfort.management.transport.entities.RouteStopsEntity;
import com.transfort.management.transport.entities.RouteUserEntity;
import com.transfort.management.transport.entities.StopEntity;
import com.transfort.management.transport.entities.UserTripDetailsEntity;
import com.transfort.management.transport.service.TransportSevice;

@RestController
public class TransportController {

	@Autowired
	private TransportSevice transportSevice;

	@PermitAll
	@PostMapping("/add/bus")
	public ResponseEntity<?> addBus(@RequestBody BusEntity bus) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addBus(bus);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("/update/bus")
	public ResponseEntity<?> updateBusDetails(@RequestBody BusEntity bus,@RequestParam("busId") long busId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateBusDetails(bus,busId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("/get/bus/details")
	public ResponseEntity<?> getBusDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getBusDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PermitAll
	@PostMapping("/add/route")
	public ResponseEntity<?> addRoute(@RequestBody RouteEntity route) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addRoute(route);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("/update/route")
	public ResponseEntity<?> updateRouteDetails(@RequestBody RouteEntity route,@RequestParam("routeId") long routeId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateRouteDetails(route,routeId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("/get/route")
	public ResponseEntity<?> getRouteDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getRouteDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PostMapping("/add/stop")
	public ResponseEntity<?> addStop(@RequestBody StopEntity stop) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addStop(stop);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("/update/stop")
	public ResponseEntity<?> updateStopDetails(@RequestBody StopEntity stop,@RequestParam("stopId") long stopId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateStopDetails(stop,stopId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("/get/stop/details")
	public ResponseEntity<?> getStopDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getStopDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PostMapping("/add/route/stops")
	public ResponseEntity<?> addRouteStops(@RequestBody RouteStopsEntity routeStop) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addRouteStops(routeStop);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("/update/route/stops")
	public ResponseEntity<?> updateRouteStopDetails(@RequestBody RouteStopsEntity routeStop,@RequestParam("routeStopId") long routeStopId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateRouteStopDetails(routeStop,routeStopId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("/get/route/stops/details")
	public ResponseEntity<?> getRouteStopDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getRouteStopDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@DeleteMapping("/delete/route/stops")
	public ResponseEntity<?> deleteRouteStop(@RequestParam("routeStopId") long routeStopId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.deleteRouteStop(routeStopId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PermitAll
	@PostMapping("route/bus")
	public ResponseEntity<?> addRouteBus(@RequestBody RouteBusEntity routeBus) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addRouteBus(routeBus);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("route/bus")
	public ResponseEntity<?> updateRouteBusDetails(@RequestBody RouteBusEntity routeBus,@RequestParam("routeBusId") long routeBusId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateRouteBusDetails(routeBus,routeBusId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("route/bus")
	public ResponseEntity<?> getRouteBusDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getRouteBusDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@DeleteMapping("route/bus")
	public ResponseEntity<?> deleteRouteBus(@RequestParam("routeBusId") long routeBusId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.deleteRouteBus(routeBusId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PostMapping("polylines")
	public ResponseEntity<?> addPolyline(@RequestBody PolylineEntity polyline) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addPolyline(polyline);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("polylines")
	public ResponseEntity<?> updatePolylineDetails(@RequestBody PolylineEntity polyline,@RequestParam("polylineId") long polylineId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updatePolylineDetails(polyline,polylineId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("polylines")
	public ResponseEntity<?> getPolylineDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getPolylineDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PermitAll
	@PostMapping("bus/driver")
	public ResponseEntity<?> addBusDriver(@RequestBody BusDriverEntity busDriver) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addBusDriver(busDriver);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("bus/driver")
	public ResponseEntity<?> updateBusDriverDetails(@RequestBody BusDriverEntity busDriver,@RequestParam("busDriverId") long busDriverId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateBusDriverDetails(busDriver,busDriverId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("bus/driver")
	public ResponseEntity<?> getBusDriverDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getBusDriverDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@DeleteMapping("bus/driver")
	public ResponseEntity<?> deleteBusDriver(@RequestParam("busDriverId") long busDriverId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.deleteBusDriver(busDriverId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PostMapping("user/trip/details")
	public ResponseEntity<?> addUserTripDetails(@RequestBody UserTripDetailsEntity userTrip) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addUserTripDetails(userTrip);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("user/trip/details")
	public ResponseEntity<?> updateUserTripDetails(@RequestBody UserTripDetailsEntity userTrip,@RequestParam("userTripId") long userTripId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateUserTripDetails(userTrip,userTripId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("user/trip/details")
	public ResponseEntity<?> getUserTripDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getUserTripDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
///////////////////////////////
	@PermitAll
	@PostMapping("route/user")
	public ResponseEntity<?> addRouteUser(@RequestBody RouteUserEntity routeUser) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.addRouteUser(routeUser);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@PutMapping("route/user")
	public ResponseEntity<?> updateRouteUserDetails(@RequestBody RouteUserEntity routeUser,@RequestParam("routeUserId") long routeUserId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.updateRouteUserDetails(routeUser,routeUserId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@GetMapping("route/user")
	public ResponseEntity<?> getRouteUserDetails() {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.getRouteUserDetails();

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PermitAll
	@DeleteMapping("route/user")
	public ResponseEntity<?> deleteRouteUser(@RequestParam("routeUserId") long routeUserId) {
		Map<Object, Object> responseData = new HashMap<Object, Object>();
		JSONResultEntity<HashMap> response = null;
		responseData = transportSevice.deleteRouteUser(routeUserId);

		List<Object> keys = new ArrayList<>(responseData.keySet());
		if (keys.get(0).equals("result")) {
			response = new JSONResultEntity<>(HttpStatus.OK, "success", null, responseData.get("result"), null);
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.OK);
		} else {
			response = new JSONResultEntity<>(HttpStatus.INTERNAL_SERVER_ERROR, "failed", responseData.get("error"),
					null, responseData.get("errorMessage"));
			return new ResponseEntity<JSONResultEntity<?>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
