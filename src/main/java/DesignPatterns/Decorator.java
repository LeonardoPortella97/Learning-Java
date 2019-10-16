package DesignPatterns;

public class Decorator {

	public static void main(String[] args) {
		
		Printer printer = new BasicPrinter();
		
		printer.printMessage("hello world");  
		
		Printer timestampedPrinter = new TimestampedPrinter(printer);
		
		timestampedPrinter.printMessage("Hello world");
		
	    Printer urgentPrinter = new UrgentPrinter(timestampedPrinter);
	    
	    urgentPrinter.printMessage("Hello World");
	    
	    Printer urgentPrinter2 = new UrgentPrinter(printer);
	    
	    urgentPrinter2.printMessage("Hello World");
	    
	    
	

	}

}

class UrgentPrinter implements Printer {
	private Printer printer;

	public UrgentPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void printMessage(String message) {
		printer.printMessage("URGENT:"+ message);
		
	}
}

class BasicPrinter implements Printer {
	public void printMessage(String message) {
		System.out.println(message);
	}
}

interface Printer {
	public void printMessage(String message);

}

class TimestampedPrinter implements Printer {
	private Printer printer;

	public TimestampedPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void printMessage(String message) {
		printer.printMessage("24/09/2019 10:50 -"+ message);
		
	}
	
}