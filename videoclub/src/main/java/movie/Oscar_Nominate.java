package movie;

import lombok.*;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

import client.Client_Address;

@Data

@Entity
public class Oscar_Nominate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOscar_nominate;
    
    private String Oscar_Nominate;
    @ManyToOne
    @JoinColumn
    private Movie movie;
    @ManyToOne
    @JoinColumn
    private Actor actor;

    public Oscar_Nominate(String Oscar_Nominate) {
        this.Oscar_Nominate = Oscar_Nominate;
    }
    @OneToMany(mappedBy = "Oscar_Nominate", cascade = CascadeType.ALL)
    private Set<Oscars_has_Oscar_Nominate> oscars_has_Oscar_Nominates;
    
    public Oscar_Nominate(String Oscar_Nominate, Oscars_has_Oscar_Nominate... oscars_has_Oscar_Nominates) {
        this.Oscar_Nominate = Oscar_Nominate;
        this.oscars_has_Oscar_Nominates = Stream.of(oscars_has_Oscar_Nominates).collect(Collectors.toSet());
        this.oscars_has_Oscar_Nominates.forEach(x -> x.setoscars_has_Oscar_Nominate(this));
    }

	public Object setoscar_Nominate(Actor actor2) {
		// TODO Auto-generated method stub
		return null;
	}

    
    
}
