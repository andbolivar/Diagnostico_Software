package movie;

import lombok.*;

import javax.persistence.*;

@Data

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovie;

    private String Movie_name;
    
    private int Duration;
    
    private int Year_Released;
    
    private float Cost;

    @ManyToOne
    @JoinColumn
    private MovieGenrs movieGenrs;

    public Movie(String Movie_name) {
        this.Movie_name = Movie_name;
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
