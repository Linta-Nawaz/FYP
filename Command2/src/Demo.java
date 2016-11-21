
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stock aStock = new Stock();
BuyStock bs= new BuyStock(aStock);
SellStock ss= new SellStock(aStock);

Broker b= new Broker();
b.takeOrder(bs);
b.takeOrder(ss);

b.placeOrders();
	}

}
