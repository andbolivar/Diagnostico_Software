package DAOMovie;

import lombok.*;

import java.time.LocalDate;

import javax.persistence.*;

@Data

@Entity
public class Actor_has_Movie {

    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();

    @ManyToOne
    @JoinColumn
    private Movie movie;
    @ManyToOne
    @JoinColumn    
    private Actor actor;
    
	public Object setactor_has_Movie(Actor actor2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object setactor_has_Movies(Movie movie2) {
		// TODO Auto-generated method stub
		return null;
	}
}
