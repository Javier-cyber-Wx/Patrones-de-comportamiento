package visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Computer computer) {
		// TODO Auto-generated method stub
		int cost = 0;
		if(computer.getPrice()>15000)
		{
			cost=computer.getPrice()-50;
		}
		else
		{
			cost=computer.getPrice();
		}
		System.out.println("Computer SerialNumber: "+computer.getSerialNumber()+", cost"+cost);
		return cost;
	}

	@Override
	public int visit(Printer printer) {
		// TODO Auto-generated method stub
		int cost = printer.getPriceOfCartridge() * printer.getNoOfCartridge();
		System.out.println("Printer: "+printer.getModelNumber()+", cost = "+cost);
		return cost;
	}

}
