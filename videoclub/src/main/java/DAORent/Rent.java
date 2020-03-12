package DAORent;


import javax.persistence.*;

import ch.qos.logback.core.net.server.Client;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;

@Data
@EqualsAndHashCode(exclude = "stock_has_Rents")

@Entity
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRent;

    private int Rent_total_paid;
    
    LocalDate Rent_time_start = LocalDate.now();
    LocalDate Rent_Time_end = LocalDate.now();
    
    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();


    @ManyToOne
    @JoinColumn
    private Client client;

    /*public Rent(String City_name) {
        this.City_Name = City_name;
    }*/
    
    @OneToMany(mappedBy = "Rent", cascade = CascadeType.ALL)
    private Set<Stock_has_Rent> stock_has_Rents;
    
    public Rent(int Rent_total_paid, Stock_has_Rent... stock_has_Rents) {
        this.Rent_total_paid = Rent_total_paid;
        this.stock_has_Rents = Stream.of(stock_has_Rents).collect(Collectors.toSet());
        this.stock_has_Rents.forEach(x -> x.setstock_has_Rent(this));
    }

}
