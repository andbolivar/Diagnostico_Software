	package DAOMovie;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "movies")

@Entity
public class MovieGenrs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGenrs;

    private String Genr;
    LocalDate updated_at = LocalDate.now();
    LocalDate deleted_at = LocalDate.now();

    @OneToMany(mappedBy = "movieGenrs", cascade = CascadeType.ALL)
    private Set<Movie> movies;
    
    

    public MovieGenrs(String Genrs, Movie... movies) {
        this.Genr = Genr;
        this.movies = Stream.of(movies).collect(Collectors.toSet());
        this.movies.forEach(x -> x.setMovieGenrs(this));
    }
}