package com.transfort.management.transport.service.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transfort.management.transport.entities.BusDriverEntity;
import com.transfort.management.transport.entities.BusEntity;
import com.transfort.management.transport.entities.PolylineEntity;
import com.transfort.management.transport.entities.RouteBusEntity;
import com.transfort.management.transport.entities.RouteEntity;
import com.transfort.management.transport.entities.RouteStopsEntity;
import com.transfort.management.transport.entities.RouteUserEntity;
import com.transfort.management.transport.entities.StopEntity;
import com.transfort.management.transport.entities.UserTripDetailsEntity;
import com.transfort.management.transport.repository.BusDriverRepository;
import com.transfort.management.transport.repository.BusRepository;
import com.transfort.management.transport.repository.PolylinesRepository;
import com.transfort.management.transport.repository.RouteBusRepository;
import com.transfort.management.transport.repository.RouteRepository;
import com.transfort.management.transport.repository.RouteStopsRepository;
import com.transfort.management.transport.repository.RouteUserRepository;
import com.transfort.management.transport.repository.StopRepository;
import com.transfort.management.transport.repository.UserTripRepository;
import com.transfort.management.transport.service.TransportSevice;

@Service
public class TransportSeviceImpl implements TransportSevice {

	@Autowired
	private BusRepository busRepository;

	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private StopRepository stopRepository;
	
	@Autowired
	private RouteStopsRepository routeStopsRepository;
	
	@Autowired
	private RouteBusRepository routeBusRepository;
	
	@Autowired
	private PolylinesRepository polylinesRepository;
	
	@Autowired
	private BusDriverRepository busDriverRepository;
	
	@Autowired
	private UserTripRepository userTripRepository;
	
	@Autowired
	private RouteUserRepository routeUserRepository;
	

	@Override
	public Map<Object, Object> addBus(BusEntity bus) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			bus.setCreatedOn(getCurrentUTCTime());
			bus.setModifiedOn(getCurrentUTCTime());
			bus = busRepository.save(bus);
			response.put("result", bus);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> updateBusDetails(BusEntity bus, long busId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<BusEntity> busEntity = busRepository.findById(busId);
			if (!busEntity.isPresent()) {
				response.put("errorMessage", "bus id is not valid");
				return response;
			}
			bus.setCreatedOn(busEntity.get().getCreatedOn());
			bus.setModifiedOn(getCurrentUTCTime());
			bus = busRepository.save(bus);
			response.put("result", bus);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getBusDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<BusEntity> busList = busRepository.findAll();
			response.put("result", busList);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> addRoute(RouteEntity route) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			route.setCreatedOn(getCurrentUTCTime());
			route.setModifiedOn(getCurrentUTCTime());
			route = routeRepository.save(route);
			response.put("result", route);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> updateRouteDetails(RouteEntity route, long routeId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<RouteEntity> routeEntity = routeRepository.findById(routeId);
			if (!routeEntity.isPresent()) {
				response.put("errorMessage", "route id is not valid");
				return response;
			}
			route.setCreatedOn(routeEntity.get().getCreatedOn());
			route.setModifiedOn(getCurrentUTCTime());
			route = routeRepository.save(route);
			response.put("result", route);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getRouteDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<RouteEntity> routeList = routeRepository.findAll();
			response.put("result", routeList);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> addStop(StopEntity stop) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			stop.setCreatedOn(getCurrentUTCTime());
			stop.setModifiedOn(getCurrentUTCTime());
			stop = stopRepository.save(stop);
			response.put("result", stop);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> updateStopDetails(StopEntity stop, long stopId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<StopEntity> stopEntity = stopRepository.findById(stopId);
			if (!stopEntity.isPresent()) {
				response.put("errorMessage", "stop id is not valid");
				return response;
			}
			stop.setCreatedOn(stopEntity.get().getCreatedOn());
			stop.setModifiedOn(getCurrentUTCTime());
			stop = stopRepository.save(stop);
			response.put("result", stop);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getStopDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<StopEntity> stopsList = stopRepository.findAll();
			response.put("result", stopsList);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> addRouteStops(RouteStopsEntity routeStop) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<RouteEntity> route = routeRepository.findById(routeStop.getRoute().getId());
			if(!route.isPresent() || route.get().getStatus() == false) {
				response.put("errorMessage", "route is blocked");
				return response;
			}
			Optional<StopEntity> stop = stopRepository.findById(routeStop.getStop().getId());
			if(!stop.isPresent() || stop.get().getStatus() == false) {
				response.put("errorMessage", "stop was blocked");
				return response;
			}
			
			routeStop.setCreatedOn(getCurrentUTCTime());
			routeStop.setModifiedOn(getCurrentUTCTime());
			routeStop = routeStopsRepository.save(routeStop);
			response.put("result", stop);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}
	
	@Override
	public Map<Object, Object> updateRouteStopDetails(RouteStopsEntity routeStop, long routeStopId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			
			Optional<RouteEntity> route = routeRepository.findById(routeStop.getRoute().getId());
			if(!route.isPresent() || route.get().getStatus() == false) {
				response.put("errorMessage", "route is blocked");
				return response;
			}
			Optional<StopEntity> stop = stopRepository.findById(routeStop.getStop().getId());
			if(!stop.isPresent() || stop.get().getStatus() == false) {
				response.put("errorMessage", "stop was blocked");
				return response;
			}
			Optional<RouteStopsEntity> routeStopEntity = routeStopsRepository.findById(routeStopId);
			if(!routeStopEntity.isPresent()) {
				response.put("errorMessage", "route stop id is invalid");
				return response;
			}
			
			routeStop.setCreatedOn(routeStopEntity.get().getCreatedOn());
			routeStop.setModifiedOn(getCurrentUTCTime());
			routeStop = routeStopsRepository.save(routeStop);
			response.put("result", routeStop);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getRouteStopDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<RouteStopsEntity> stopsList = routeStopsRepository.findAll();
			response.put("result", stopsList);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> deleteRouteStop(long routeStopId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			routeStopsRepository.deleteById(routeStopId);
			response.put("result", "deleted successfully");
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> addRouteBus(RouteBusEntity routeBus) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<RouteEntity> route = routeRepository.findById(routeBus.getRoute().getId());
			if(!route.isPresent() || route.get().getStatus() == false) {
				response.put("errorMessage", "route is blocked");
				return response;
			}
			Optional<BusEntity> bus = busRepository.findById(routeBus.getBus().getId());
			if(!bus.isPresent() || bus.get().getStatus() == false) {
				response.put("errorMessage", "bus is not travelled");
				return response;
			}
			routeBus.setCreatedOn(getCurrentUTCTime());
			routeBus.setModifiedOn(getCurrentUTCTime());
			routeBus = routeBusRepository.save(routeBus);
			response.put("result", routeBus);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> updateRouteBusDetails(RouteBusEntity routeBus, long routeBusId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<RouteEntity> route = routeRepository.findById(routeBus.getRoute().getId());
			if(!route.isPresent() || route.get().getStatus() == false) {
				response.put("errorMessage", "route is blocked");
				return response;
			}
			Optional<BusEntity> bus = busRepository.findById(routeBus.getBus().getId());
			if(!bus.isPresent() || bus.get().getStatus() == false) {
				response.put("errorMessage", "bus is not travelled");
				return response;
			}
			Optional<RouteBusEntity> routeBusEntity = routeBusRepository.findById(routeBus.getId());
			if(!routeBusEntity.isPresent()) {
				response.put("errorMessage", "route-bus is not valid");
				return response;
			}
			routeBus.setCreatedOn(routeBusEntity.get().getCreatedOn());
			routeBus.setModifiedOn(getCurrentUTCTime());
			routeBus = routeBusRepository.save(routeBus);
			response.put("result", routeBus);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getRouteBusDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<RouteBusEntity> list = routeBusRepository.findAll();
			response.put("result", list);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> deleteRouteBus(long routeBusId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			routeBusRepository.deleteById(routeBusId);
			response.put("result", "deleted successfully");
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}
	
	@Override
	public Map<Object, Object> addPolyline(PolylineEntity polyline) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			polyline.setCreatedOn(getCurrentUTCTime());
			polyline.setModifiedOn(getCurrentUTCTime());
			polyline = polylinesRepository.save(polyline);
			response.put("result", polyline);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> updatePolylineDetails(PolylineEntity polyline, long polylineId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<PolylineEntity> polylineEntity = polylinesRepository.findById(polylineId);
			if (!polylineEntity.isPresent()) {
				response.put("errorMessage", "polyline id is not valid");
				return response;
			}
			polyline.setCreatedOn(polylineEntity.get().getCreatedOn());
			polyline.setModifiedOn(getCurrentUTCTime());
			polyline = polylinesRepository.save(polyline);
			response.put("result", polyline);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getPolylineDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<PolylineEntity> list = polylinesRepository.findAll();
			response.put("result", list);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}
	
	@Override
	public Map<Object, Object> addBusDriver(BusDriverEntity busDriver) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<BusEntity> bus = busRepository.findById(busDriver.getBus().getId());
			if(!bus.isPresent() || bus.get().getStatus() == false) {
				response.put("errorMessage", "bus is not available");
				return response;
			}
			busDriver.setCreatedOn(getCurrentUTCTime());
			busDriver.setModifiedOn(getCurrentUTCTime());
			busDriver = busDriverRepository.save(busDriver);
			response.put("result", busDriver);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}
	
	@Override
	public Map<Object, Object> updateBusDriverDetails(BusDriverEntity busDriver, long busDriverId){
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<BusEntity> bus = busRepository.findById(busDriver.getBus().getId());
			if(!bus.isPresent() || bus.get().getStatus() == false) {
				response.put("errorMessage", "bus is not available");
				return response;
			}
			Optional<BusDriverEntity> busDriverEntity = busDriverRepository.findById(busDriverId);
			if(!busDriverEntity.isPresent()) {
				response.put("errorMessage", "bus-driver id is invalid");
				return response;
			}
			busDriver.setCreatedOn(busDriverEntity.get().getCreatedOn());
			busDriver.setModifiedOn(getCurrentUTCTime());
			busDriver = busDriverRepository.save(busDriver);
			response.put("result", busDriver);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getBusDriverDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<BusDriverEntity> stopsList = busDriverRepository.findAll();
			response.put("result", stopsList);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> deleteBusDriver(long busDriverId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			busDriverRepository.deleteById(busDriverId);
			response.put("result", "deleted successfully");
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}
	
	@Override
	public Map<Object, Object> addUserTripDetails(UserTripDetailsEntity userTrip) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<StopEntity> pickupStop = stopRepository.findById(userTrip.getPickupStop().getId());
			if (!pickupStop.isPresent() || pickupStop.get().getStatus() == false) {
				response.put("errorMessage", "pickup stop is invalid");
				return response;
			}
			Optional<StopEntity> dropStop = stopRepository.findById(userTrip.getPickupStop().getId());
			if (!dropStop.isPresent() || dropStop.get().getStatus() == false) {
				response.put("errorMessage", "drop stop is invalid");
				return response;
			}
			userTrip.setCreatedOn(getCurrentUTCTime());
			userTrip.setModifiedOn(getCurrentUTCTime());
			userTrip = userTripRepository.save(userTrip);
			response.put("result", userTrip);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> updateUserTripDetails(UserTripDetailsEntity userTrip, long userTripId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
		    Optional<StopEntity> pickupStop = stopRepository.findById(userTrip.getPickupStop().getId());
			if (!pickupStop.isPresent() || pickupStop.get().getStatus() == false) {
				response.put("errorMessage", "pickup stop is invalid");
				return response;
			}
			Optional<StopEntity> dropStop = stopRepository.findById(userTrip.getPickupStop().getId());
			if (!dropStop.isPresent() || dropStop.get().getStatus() == false) {
				response.put("errorMessage", "drop stop is invalid");
				return response;
			} 
			Optional<UserTripDetailsEntity> userTripEntity = userTripRepository.findById(userTripId);
			if (!userTripEntity.isPresent()) {
				response.put("errorMessage", "user-trip id is invalid");
				return response;
			}
			userTrip.setCreatedOn(userTripEntity.get().getCreatedOn());
			userTrip.setModifiedOn(getCurrentUTCTime());
			userTrip = userTripRepository.save(userTrip);
			response.put("result", userTrip);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getUserTripDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<UserTripDetailsEntity> list = userTripRepository.findAll();
			response.put("result", list);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}
	private Timestamp getCurrentUTCTime() {
		LocalDateTime currentDateTime = LocalDateTime.now(ZoneOffset.UTC);
		return Timestamp.valueOf(currentDateTime);
	}
	
	@Override
	public Map<Object, Object> addRouteUser(RouteUserEntity routeUser) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<RouteEntity> route = routeRepository.findById(routeUser.getRoute().getId());
			if(!route.isPresent() || route.get().getStatus() == false) {
				response.put("errorMessage", "route is blocked");
				return response;
			}
			routeUser.setCreatedOn(getCurrentUTCTime());
			routeUser.setModifiedOn(getCurrentUTCTime());
			routeUser = routeUserRepository.save(routeUser);
			response.put("result", routeUser);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> updateRouteUserDetails(RouteUserEntity routeUser, long routeUserId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			Optional<RouteEntity> route = routeRepository.findById(routeUser.getRoute().getId());
			if(!route.isPresent() || route.get().getStatus() == false) {
				response.put("errorMessage", "route is blocked");
				return response;
			}
			Optional<RouteUserEntity> routeUserEntity = routeUserRepository.findById(routeUserId);
			if(!routeUserEntity.isPresent()) {
				response.put("errorMessage", "route-user is not valid");
				return response;
			}
			routeUser.setCreatedOn(routeUserEntity.get().getCreatedOn());
			routeUser.setModifiedOn(getCurrentUTCTime());
			routeUser = routeUserRepository.save(routeUser);
			response.put("result", routeUser);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> getRouteUserDetails() {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			List<RouteUserEntity> list = routeUserRepository.findAll();
			response.put("result", list);
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

	@Override
	public Map<Object, Object> deleteRouteUser(long routeUserId) {
		Map<Object, Object> response = new HashMap<Object, Object>();
		try {
			routeUserRepository.deleteById(routeUserId);
			response.put("result", "deleted successfully");
		} catch (Exception e) {
			StringWriter error = new StringWriter();
			e.printStackTrace(new PrintWriter(error));
			response.put("error", error);
			response.put("errorMessage", "Internal Server Error");
		}
		return response;
	}

}
