package bus.stop.lld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/*
	* Build an API to book busses for a user.
	* @Endpoint '/bus/book' - This will book the bus
	* @Endpoint '/bus/update' - This will update the availability of the bus
	* @Endpoint '/bus/add' - This will post a new bus
	*
	* Entities required -
	* 	-> User Entity (Which will hold the user details)
	* 	-> Bus entity (They will have a list of BusStops, availability, Starting Location, Price per km)
	* 	-> Location (This will have the coordinates on the map)
	* 	-> BusStop (This will have the name and the location of the busstops)
	*
	* 	-> Interface Pricing - This can be used to make pricing decisions
	* 	-> Default Princing - This will be used to calculate price for the trip
	* */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
