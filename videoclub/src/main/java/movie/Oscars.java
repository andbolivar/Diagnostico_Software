package movie;

import lombok.*;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

import client.Client_Address;

@Data

@Entity
public class Oscars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOscars;

    private String Winner;
    
    private int Oscar_Cat_idOscar_Cat;
    
    private int Oscar_Year_idOscar_Year;

    @ManyToOne
    @JoinColumn
    private Oscar_Year oscar_Years;
    @ManyToOne
    @JoinColumn
    private Oscar_Cat oscar_Cats;

    
    public Oscars(String Winner) {
        this.Winner = Winner;
    }

    @OneToMany(mappedBy = "Oscars", cascade = CascadeType.ALL)
    private Set<Oscars_has_Oscar_Nominate> oscars_has_Oscar_Nominates;
    
    public Oscars(String Winner, Oscars_has_Oscar_Nominate... oscars_has_Oscar_Nominates) {
        this.Winner = Winner;
        this.oscars_has_Oscar_Nominates = Stream.of(oscars_has_Oscar_Nominates).collect(Collectors.toSet());
        this.oscars_has_Oscar_Nominates.forEach(x -> x.setoscars_has_Oscar_Nominate(this));
    }


    
    
	public Object setOscar_Cat(Oscar_Cat oscar_Cat) {
		// TODO Auto-generated method stub
		return null;
	}




	public Object setOscar_Year(Oscar_Year oscar_Year) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
