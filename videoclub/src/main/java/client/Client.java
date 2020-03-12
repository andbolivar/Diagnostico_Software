package client;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;

@Data
@EqualsAndHashCode(exclude = "client_Addresses")

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    private String Client_Name;
    private String Client_Surname;
    private String Client_Email;
    private int Client_Status;

    @ManyToOne
    @JoinColumn
    private Client_Address client_Address;

    public Client(String Rent_Time_end) {
        this.Rent_Time_end = Rent_Time_end;
    }
    @OneToMany(mappedBy = "Client", cascade = CascadeType.ALL)
    private Set<Rent> rents;
    
    public Client(String Client_Name, Rent_Time_end... rent_Time_ends) {
        this.Client_Name = Client_Name;
        
        this.client_Addresses = Stream.of(client_Addresses).collect(Collectors.toSet());
        this.client_Addresses.forEach(x -> x.setclient_Address(this));
    }

	public Object setcity(Client_Address client_Address2) {
		// TODO Auto-generated method stub
		return null;
	}

}