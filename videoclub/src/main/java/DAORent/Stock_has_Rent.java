package DAORent;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Stock_has_Rent {

	
    @ManyToOne
    @JoinColumn
    private Rent rent;
    @ManyToOne
    @JoinColumn    
    private Cost_Day cost_Day;
    @ManyToOne
    @JoinColumn    
    private Stock sotck;
	
	
	
	
	public Object setstock_has_Rent(Stock stock) {
		// TODO Auto-generated method stub
		return null;
	}




	public Object setstock_has_Rent(Rent rent2) {
		// TODO Auto-generated method stub
		return null;
	}

}
