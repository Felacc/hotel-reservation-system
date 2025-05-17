DROP TABLE IF EXISTS hotel_reservation_db.payment;
DROP TABLE IF EXISTS hotel_reservation_db.booking;
DROP TABLE IF EXISTS hotel_reservation_db.reservation;
DROP TABLE IF EXISTS hotel_reservation_db.room;
DROP TABLE IF EXISTS hotel_reservation_db.employee;
DROP TABLE IF EXISTS hotel_reservation_db.customer;
DROP TABLE IF EXISTS hotel_reservation_db.`user`;


CREATE TABLE hotel_reservation_db.`user` (
	user_id INT auto_increment NOT NULL,
	username varchar(45) NOT NULL,
	password varchar(255) NOT NULL,
	user_type ENUM('guest', 'staff') NOT NULL,
	CONSTRAINT user_pk PRIMARY KEY (user_id),
	CONSTRAINT user_unique UNIQUE KEY (username)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;

CREATE TABLE hotel_reservation_db.customer (
	customer_id INT auto_increment NOT NULL,
	first_name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	email varchar(100) NOT NULL,
	phone varchar(100) NOT NULL,
	unit_number varchar(100) NULL,
	street_address varchar(100) NOT NULL,
	city varchar(100) NOT NULL,
	postal_code varchar(100) NOT NULL,
	country varchar(100) NOT NULL,
	user_id INT NULL,
	CONSTRAINT customer_pk PRIMARY KEY (customer_id),
	CONSTRAINT customer_user_FK FOREIGN KEY (user_id) REFERENCES hotel_reservation_db.`user`(user_id) ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;

CREATE TABLE hotel_reservation_db.employee (
	employee_id INT auto_increment NOT NULL,
	first_name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	email varchar(100) NOT NULL,
	phone varchar(100) NOT NULL,
	sin INT NOT NULL,
	status ENUM('permanent','temporary') NOT NULL,
	unit_number varchar(100) NULL,
	street_address varchar(100) NOT NULL,
	city varchar(100) NOT NULL,
	postal_code varchar(100) NOT NULL,
	country varchar(100) NOT NULL,
	created_by INT NULL,
	user_id INT NOT NULL,
	CONSTRAINT employee_pk PRIMARY KEY (employee_id),
	CONSTRAINT employee_unique UNIQUE KEY (sin),
	CONSTRAINT employee_employee_FK FOREIGN KEY (created_by) REFERENCES hotel_reservation_db.employee(employee_id) ON DELETE SET NULL ON UPDATE CASCADE,
	CONSTRAINT employee_user_FK FOREIGN KEY (user_id) REFERENCES hotel_reservation_db.`user`(user_id) ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;

CREATE TABLE hotel_reservation_db.room (
	room_id INT auto_increment NOT NULL,
	room_number varchar(100) NOT NULL,
	room_type varchar(100) NOT NULL,
	price_per_night DECIMAL NOT NULL,
	status varchar(100) NOT NULL,
	updated_by INT NULL,
	CONSTRAINT room_pk PRIMARY KEY (room_id),
	CONSTRAINT room_employee_FK FOREIGN KEY (updated_by) REFERENCES hotel_reservation_db.employee(employee_id) ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;

CREATE TABLE hotel_reservation_db.reservation (
	reservation_id INT auto_increment NOT NULL,
	customer_id INT NOT NULL,
	room_id INT NOT NULL,
	employee_id INT NOT NULL,
	check_in_date DATE NOT NULL,
	check_out_date DATE NOT NULL,
	status varchar(100) NOT NULL,
	CONSTRAINT reservation_pk PRIMARY KEY (reservation_id),
	CONSTRAINT reservation_customer_FK FOREIGN KEY (customer_id) REFERENCES hotel_reservation_db.customer(customer_id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT reservation_room_FK FOREIGN KEY (room_id) REFERENCES hotel_reservation_db.room(room_id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT reservation_employee_FK FOREIGN KEY (employee_id) REFERENCES hotel_reservation_db.employee(employee_id) ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;

CREATE TABLE hotel_reservation_db.booking (
	booking_id INT auto_increment NOT NULL,
	reservation_id INT NOT NULL,
	booking_date DATE NOT NULL,
	total_price DECIMAL NOT NULL,
	CONSTRAINT booking_pk PRIMARY KEY (booking_id),
	CONSTRAINT booking_reservation_FK FOREIGN KEY (reservation_id) REFERENCES hotel_reservation_db.reservation(reservation_id) ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;

CREATE TABLE hotel_reservation_db.payment (
	payment_id INT auto_increment NOT NULL,
	booking_id INT NOT NULL,
	employee_id INT NOT NULL,
	payment_date DATE NOT NULL,
	amount DECIMAL NOT NULL,
	payment_method varchar(100) NOT NULL,
	status varchar(100) NOT NULL,
	CONSTRAINT payment_pk PRIMARY KEY (payment_id),
	CONSTRAINT payment_booking_FK FOREIGN KEY (booking_id) REFERENCES hotel_reservation_db.booking(booking_id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT payment_employee_FK FOREIGN KEY (employee_id) REFERENCES hotel_reservation_db.employee(employee_id) ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;






