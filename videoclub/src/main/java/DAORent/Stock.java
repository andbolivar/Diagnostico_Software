package DAORent;


import javax.persistence.*;

import DAOMovie.Movie;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;

@Data
@EqualsAndHashCode(exclude = "client_Addresses")

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStock;

    private int Total_stock;
    private int On_stock;
    private int Borrowed;

    @ManyToOne
    @JoinColumn
    private Movie movie;
    @ManyToOne
    @JoinColumn
    private Language language;
    @ManyToOne
    @JoinColumn
    private Subtitle subtitle;

    public Stock(int Total_stock) {
        this.Total_stock = Total_stock;
    }
    @OneToMany(mappedBy = "Stock", cascade = CascadeType.ALL)
    private Set<Stock_has_Rent> stock_has_Rents;
    
    public Stock(int Total_stock, Stock_has_Rent... stock_has_Rents) {
        this.Total_stock = Total_stock;
        this.stock_has_Rents = Stream.of(stock_has_Rents).collect(Collectors.toSet());
        this.stock_has_Rents.forEach(x -> x.setstock_has_Rent(this));
    }

	public Object setStock(Subtitle subtitle2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object setStock(Language language2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object setStock(Movie movie2) {
		// TODO Auto-generated method stub
		return null;
	}

}
