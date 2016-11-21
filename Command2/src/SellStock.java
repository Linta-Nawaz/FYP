
public class SellStock implements Order{
	 private Stock aStocks;

	   public SellStock(Stock aStocks){
	      this.aStocks = aStocks;
	   }

	   public void execute() {
	      aStocks.sell();
	   }
}
