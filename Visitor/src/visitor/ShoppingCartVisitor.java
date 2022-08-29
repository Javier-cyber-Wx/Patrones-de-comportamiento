package visitor;


//import javax.print.attribute.standard.PrinterName;


public interface ShoppingCartVisitor {
    int visit(Computer computer);
    //int visit(PrinterName printername);
	int visit(Printer printer);
}