	package client;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "cities")

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCountry;

    private String Country_Name;
    
    @OneToMany(mappedBy = "Country", cascade = CascadeType.ALL)
    private Set<City> cities;
    
    

    public Country(String Country_Name, City... cities) {
        this.Country_Name = Country_Name;
        this.cities = Stream.of(cities).collect(Collectors.toSet());
        this.cities.forEach(x -> x.setCountry(this));
    }
}