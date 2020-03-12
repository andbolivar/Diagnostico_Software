	package movie;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "oscars")

@Entity
public class Oscar_Year {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOscar_Year;

    private int Oscar_Year;
    
    @OneToMany(mappedBy = "oscar_Year", cascade = CascadeType.ALL)
    private Set<Oscars> oscars;
    
    

    public Oscar_Year(int Oscar_year, Oscars... oscars) {
        this.Oscar_Year = Oscar_Year;
        this.oscars = Stream.of(oscars).collect(Collectors.toSet());
        this.oscars.forEach(x -> x.setOscar_Year(this));
    }
}