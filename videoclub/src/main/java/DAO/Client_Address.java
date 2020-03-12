package DAO;


import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.*;

@Data
@EqualsAndHashCode(exclude = "clients")

@Entity
public class Client_Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient_Address;

    private String Client_Address_direction;
    private String Client_Address_latitude;
    private String Client_Address_longitud;
    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();


    @ManyToOne
    @JoinColumn
    private City city;

    public Client_Address(String Client_Address_direction) {
        this.Client_Address_direction = Client_Address_direction;
    }
    @OneToMany(mappedBy = "Client", cascade = CascadeType.ALL)
    private Set<Client> clients;
    
    public Client_Address (String Client_Address_direction, Client... clients) {
        this.Client_Address_direction = Client_Address_direction;
        this.clients = Stream.of(clients).collect(Collectors.toSet());
        this.clients.forEach(x -> x.setcity(this));
    }

	public Object setclient_Address(City city2) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
