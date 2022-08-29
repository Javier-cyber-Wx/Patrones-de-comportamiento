package visitor;

public class Customer {
	public static void main(String[] args)
	{
		Item[] items=new Item[] {
				new Computer(20000, "1245"), new Computer(14000, "3456"),
				new Printer(1000, 6, "HP 302X"), new Printer(900, 7, "HP 300Z")
		};
		int totalCost = calculatePrice(items); 
		System.out.println("Total cost: "+totalCost);
	}
	private static int calculatePrice(Item[] items)
	{
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for(Item item:items)
		{
			sum = sum+item.accept(visitor);
		}
		return sum;
	}

}
