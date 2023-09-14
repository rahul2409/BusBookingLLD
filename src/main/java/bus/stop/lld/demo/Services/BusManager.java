package bus.stop.lld.demo.Services;

import bus.stop.lld.demo.Entities.Bus;
import bus.stop.lld.demo.Entities.Location;
import bus.stop.lld.demo.exceptions.BusAlreadyExistsException;
import bus.stop.lld.demo.exceptions.BusNotFoundException;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BusManager {
    Map<String, Bus> busses = new HashMap<>();

    // Create the bus object
    public void createBus(@NonNull final Bus bus){
        if(busses.containsKey(bus.getBusNo())){
            throw new BusAlreadyExistsException();
        }
        busses.put(bus.getBusNo(), bus);
    }
    // Get the bus based on ID
    public Bus getBus(@NonNull final String busId){
        if (!busses.containsKey(busId)) {
            throw new BusNotFoundException();
        }
        return busses.get(busId);
    }

    public void updateBusAvailability(@NonNull final String busNo, boolean availability){
        if (!busses.containsKey(busNo)) {
            throw new BusNotFoundException();
        }
        busses.get(busNo).setAvailability(availability);
    }

    public void updateBusLocation(@NonNull final String busNo, Location l1){
        if (!busses.containsKey(busNo)) {
            throw new BusNotFoundException();
        }
        busses.get(busNo).setLocation(l1);
    }
}
