package pl.nkoder.examples.postgresql.embedded;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "things")
public class Thing {

    @Id
    public Integer id;

    public String name;

}
