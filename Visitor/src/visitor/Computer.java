package visitor;

public class Computer implements Item {
	private int cost;
	private String SerialNumber;
	public Computer(int cost, String SerialNumber)
	{
		this.cost=cost;
		this.SerialNumber=SerialNumber;
	}
	public int getPrice()
	{
		return cost;
	}
	public String getSerialNumber()
	{
		return SerialNumber;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
