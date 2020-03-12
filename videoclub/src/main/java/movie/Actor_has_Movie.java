package movie;

import lombok.*;

import javax.persistence.*;

@Data

@Entity
public class Actor_has_Movie {

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
}
