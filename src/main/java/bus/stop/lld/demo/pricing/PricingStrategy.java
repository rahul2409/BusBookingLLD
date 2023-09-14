package bus.stop.lld.demo.pricing;

import bus.stop.lld.demo.Entities.Bus;
import bus.stop.lld.demo.Entities.BusStop;

public interface PricingStrategy {
    public double getPrice(Bus bus, BusStop stop1, BusStop stop2);
}
