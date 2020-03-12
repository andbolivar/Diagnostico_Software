	package DAOMovie;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "actor_has_Movies")

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActor;

    private String Name;
    
    private String Surname;
    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();

    @OneToMany(mappedBy = "Actor", cascade = CascadeType.ALL)
    private Set<Actor_has_Movie> actor_has_Movies;

    public Actor(String Name, Actor_has_Movie... actor_has_Movies) {
        this.Name = Name;
        this.actor_has_Movies = Stream.of(actor_has_Movies).collect(Collectors.toSet());
        this.actor_has_Movies.forEach(x -> x.setactor_has_Movie(this));
    }
    
    
    @OneToMany(mappedBy = "Actor", cascade = CascadeType.ALL)
    private Set<Oscar_Nominate> oscar_Nominates;

    public Actor(String Name, Oscar_Nominate... oscar_Nominates) {
        this.Name = Name;
        this.oscar_Nominates = Stream.of(oscar_Nominates).collect(Collectors.toSet());
        this.oscar_Nominates.forEach(x -> x.setoscar_Nominate(this));
    }
}