package DAO;


import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;

@Data
@EqualsAndHashCode(exclude = "client_Addresses")

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCity;

    private String City_Name;
    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();

    @ManyToOne
    @JoinColumn
    private Country country;

    public City(String City_name) {//not sure if is city or country name
        this.City_Name = City_name;
    }
    @OneToMany(mappedBy = "City", cascade = CascadeType.ALL)
    private Set<Client_Address> client_Addresses;
    
    public City(String City_Name, Client_Address... client_Addresses) {
        this.City_Name = City_Name;
        this.client_Addresses = Stream.of(client_Addresses).collect(Collectors.toSet());
        this.client_Addresses.forEach(x -> x.setclient_Address(this));
    }

	public Object setCountry(Country country2) {
		// TODO Auto-generated method stub
		return null;
	}

}
