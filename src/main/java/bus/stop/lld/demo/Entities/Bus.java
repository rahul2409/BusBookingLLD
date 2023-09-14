package bus.stop.lld.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Bus {
    private String busNo;
    private boolean availability;
    private double pricePerKm;
    private Location location;
    private List<BusStop> stops;
}
