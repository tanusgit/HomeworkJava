package genericClass2InstanceVariable;

public class Tesla {
int price;
int milege;


public Tesla(int price, int milege) {
	super();
	this.price = price;
	this.milege = milege;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public int getMilege() {
	return milege;
}


public void setMilege(int milege) {
	this.milege = milege;
}


@Override
public String toString() {
	return "Tesla [price=" + price + ", milege=" + milege + "]";
}
 
}
