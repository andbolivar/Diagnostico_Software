package DAO;

import javax.persistence.*;

import DAORent.Rent;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;

@Data
@EqualsAndHashCode(exclude = "rents")

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    private String Client_Name;
    private String Client_Surname;
    private String Client_Email;
    LocalDate Client_Brithday_Date = LocalDate.now();
    LocalDate Client_Register_Date = LocalDate.now();

    private int Client_Status;
    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();

    @ManyToOne
    @JoinColumn
    private Client_Address client_Address;

    public Client(String Client_Name) {
        this.Client_Name = Client_Name;
    }
    @OneToMany(mappedBy = "Client", cascade = CascadeType.ALL)
    private Set<Rent> rents;
    
    public Client(String Client_Name, Rent_Time_end... rent_Time_ends) {
        this.Client_Name = Client_Name;
        
        this.rent_Time_ends = Stream.of(rent_Time_ends).collect(Collectors.toSet());
        this.rent_Time_ends.forEach(x -> x.setRent_Time_end(this));
    }

	public Object setcity(Client_Address client_Address2) {
		// TODO Auto-generated method stub
		return null;
	}

}