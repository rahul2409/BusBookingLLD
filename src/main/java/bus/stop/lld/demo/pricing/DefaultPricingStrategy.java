package bus.stop.lld.demo.pricing;

import bus.stop.lld.demo.Entities.Bus;
import bus.stop.lld.demo.Entities.BusStop;

public class DefaultPricingStrategy implements PricingStrategy{
    @Override
    public double getPrice(Bus bus, BusStop stop1, BusStop stop2) {
        // Calculate the distance from stop 1 to stop 2.
        double distance = stop1.getStopLocation().getDistance(stop2.getStopLocation());
        // We have price per km depending on the bus object
        return distance * bus.getPricePerKm();
    }
}
