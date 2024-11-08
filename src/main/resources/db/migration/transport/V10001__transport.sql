CREATE TABLE bus(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  bus_name VARCHAR(100) NOT NULL,
  bus_capability INT NOT NULL,
  bus_number VARCHAR(100) NOT NULL,
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP
);
CREATE TABLE route(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  route_name VARCHAR(100) NOT NULL, -- ammerpet to hitech city
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP
);
CREATE TABLE stops(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  stop_name VARCHAR(100) NOT NULL, -- ammerpet
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP
);
CREATE TABLE route_stops(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  stopid BIGINT NOT NULL,
  routeid BIGINT NOT NULL,
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP,
  FOREIGN KEY (stopid) REFERENCES stops(id),
  FOREIGN KEY (routeid) REFERENCES route(id)
);
CREATE TABLE route_bus(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  busid BIGINT NOT NULL,
  routeid BIGINT NOT NULL,
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP,
  FOREIGN KEY (busid) REFERENCES bus(id),
  FOREIGN KEY (routeid) REFERENCES route(id)
);
CREATE TABLE polylines(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  routeid BIGINT NOT NULL,
  polyline VARCHAR(512) NOT NULL,
  sort_order INT NOT NULL,
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP,
  FOREIGN KEY (routeid) REFERENCES route(id)
);
CREATE TABLE bus_driver(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  busid BIGINT NOT NULL,
  driver BIGINT NOT NULL,
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP,
  FOREIGN KEY (busid) REFERENCES bus(id)
);      
CREATE TABLE user_trip_details(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  userid BIGINT NOT NULL, -- student
  pickup_stop BIGINT NOT NULL, 
  drop_stop BIGINT NOT NULL, 
  home_address VARCHAR(1024),
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP,
  FOREIGN KEY (pickup_stop) REFERENCES stops(id),
 FOREIGN KEY (drop_stop) REFERENCES stops(id)
); 
CREATE TABLE route_user(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  routeid BIGINT NOT NULL,
  userid BIGINT NOT NULL, -- student
  parentid BIGINT NOT NULL,
  status BOOLEAN DEFAULT FALSE,
  created_on TIMESTAMP,
  modified_on TIMESTAMP,
  FOREIGN KEY (routeid) REFERENCES route(id)
);