package DAORent;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "cities")

@Entity
public class Subtitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubtitle;

    private String Subtitle_name;
    
    @OneToMany(mappedBy = "Subtitle", cascade = CascadeType.ALL)
    private Set<Stock> stocks;
    
    

    public Subtitle(String Subtitle_name, Stock... stocks) {
        this.Subtitle_name = Subtitle_name;
        this.stocks = Stream.of(stocks).collect(Collectors.toSet());
        this.stocks.forEach(x -> x.setStock(this));
    }
}