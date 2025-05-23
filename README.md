# hotel-reservation-system

This is a group project that was created for the class ICS-125 (Software Engineering Process) at Camosun College.

We were a team of three, tasked with making a hotel reservation management system that performs CRUD operations on a MariaDB/MySQL database.

## The Design

The system's backend is designed using Java with a Model-View-Controller + Data Access Objects architecture pattern.

This is a Maven project and can be easily compiled and ran on most Java IDEs, but should be developed on NetBeans for their Java Swing GUI editor.

The project uses Java Swing with NetBeans' AbsoluteLayout LayoutManager for GUI elements and MariaDB/MySQL for the database.

This is a more polished version of the project that contains changes that I have made since the course has ended.

## How to Setup the DB
In order to use the app yourself, you will need to follow these steps in order to get the DB working. 

1. Go to /src/main/resources/app/hotelreservationsystem/utils/
2. Execute the CreateScript.sql script in a MariaDB/MySQL database named hotel_reservation_system to generate the tables
3. Make a copy of db.properties.template called db.properties in the same package and enter your database server info in that file (this file will be automatically ignored by git and stay private)

Now the app should work as intended, and perform CRUD operations on all tables for that database :)
