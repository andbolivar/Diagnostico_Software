	package movie;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "Oscars")

@Entity
public class Oscar_Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOscar_Cat;

    private String Oscar_Cat_Name;
    
    
    @OneToMany(mappedBy = "oscar_Cat", cascade = CascadeType.ALL)
    private Set<Oscars> oscars;
    
    

    public Oscar_Cat(String Oscar_Cat_Name, Oscars... oscars) {
        this.Oscar_Cat_Name = Oscar_Cat_Name;
        this.oscars = Stream.of(oscars).collect(Collectors.toSet());
        this.oscars.forEach(x -> x.setOscar_Cat(this));
    }
}