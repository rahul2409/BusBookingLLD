package bus.stop.lld.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@AllArgsConstructor
public class BusStop {
    private String name;
    private Location stopLocation;
}
