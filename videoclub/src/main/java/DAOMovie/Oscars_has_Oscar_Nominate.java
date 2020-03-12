package DAOMovie;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;


@Data

@Entity
public class Oscars_has_Oscar_Nominate {

    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();

    @ManyToOne
    @JoinColumn
    private Oscars oscars;
    @ManyToOne
    @JoinColumn
    private Oscar_Nominate oscar_Nominates;
    

	public Object setoscars_has_Oscar_Nominate(Oscar_Nominate oscar_Nominate) {
		// TODO Auto-generated method stub
		return null;
	}


	public Object setoscars_has_Oscar_Nominate(Oscars oscars2) {
		// TODO Auto-generated method stub
		return null;
	}

	

    
}
