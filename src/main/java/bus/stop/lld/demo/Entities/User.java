package bus.stop.lld.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class User {
    private int userId;
    @Setter private String name;
    @Setter private String email;
    @Setter private String password;
    @Setter private String contact;
}
