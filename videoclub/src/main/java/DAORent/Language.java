package DAORent;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "stocks")

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLanguage;

    private String Language_Name;
    
    @OneToMany(mappedBy = "Language", cascade = CascadeType.ALL)
    private Set<Stock> stocks;
    
    

    public Language(String Language_Name, Stock... stocks) {
        this.Language_Name = Language_Name;
        this.stocks = Stream.of(stocks).collect(Collectors.toSet());
        this.stocks.forEach(x -> x.setStock(this));
    }
}