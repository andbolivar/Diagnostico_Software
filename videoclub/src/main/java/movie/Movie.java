package movie;

import lombok.*;

import javax.persistence.*;

@Data

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovie;

    private String name;

    @ManyToOne
    @JoinColumn
    private MovieGenrs movieGenrs;

    public Movie(String name) {
        this.name = name;
    }
}
