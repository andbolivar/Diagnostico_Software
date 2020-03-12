package movie;

import lombok.*;
import rent.Stock;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

import client.Client_Address;

@Data

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovie;

    private String Movie_Name;
    
    private int Duration;
    
    private int Year_Released;
    
    private float Cost;

    @ManyToOne
    @JoinColumn
    private MovieGenrs movieGenrs;

    public Movie(String Movie_Mame) {
        this.Movie_Name = Movie_Name;
    }
    
    
    @OneToMany(mappedBy = "Movie", cascade = CascadeType.ALL)
    private Set<Actor_has_Movie> actor_has_Movies;
    
    public Movie(String Movie_Name, Actor_has_Movie... actor_has_Movies) {
        this.Movie_Name = Movie_Name;
        this.actor_has_Movies = Stream.of(actor_has_Movies).collect(Collectors.toSet());
        this.actor_has_Movies.forEach(x -> x.setactor_has_Movies(this));
    }

    @OneToMany(mappedBy = "Movie", cascade = CascadeType.ALL)
    private Set<Oscar_Nominate> oscar_Nominates;
    
    public Movie(String Movie_Name, Oscar_Nominate... oscar_Nominates) {
        this.Movie_Name = Movie_Name;
        this.oscar_Nominates = Stream.of(oscar_Nominates).collect(Collectors.toSet());
        this.oscar_Nominates.forEach(x -> x.setoscar_Nominate(this));
    }
    
    @OneToMany(mappedBy = "Movie", cascade = CascadeType.ALL)
    private Set<Stock> stocks;
    
    public Movie(String Movie_Name, Stock... stocks) {
        this.Movie_Name = Movie_Name;
        this.stocks = Stream.of(stocks).collect(Collectors.toSet());
        this.stocks.forEach(x -> x.setstock(this));
    }
    
	public Object setActor_has_Movie(Actor_has_Movie actor_has_Movie) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object setMovieGenrs(MovieGenrs movieGenrs2) {
		// TODO Auto-generated method stub
		return null;
	}
}
