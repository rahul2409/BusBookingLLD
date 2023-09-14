package bus.stop.lld.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Location {
    private double x;
    private double y;
    public double getDistance(Location l2){
        return (Math.sqrt( Math.pow(this.x - l2.getX(), 2) + Math.pow(this.y - l2.getY(), 2) ));
    }
}
