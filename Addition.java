package Operations;

public class Addition extends Numbers implements Operation{
	private double sum;


	public Addition() {
		super();
		sum = 0.0;
	}
	public Addition(double sum) {
		this.sum = sum;
		
	}
	public double addition() {
		fillList();
		
		 for (double i: super.list) {
		        sum += i;
		    }
		 displayList();
		return sum;
	}
	public double subtraction() 
	{
		return 0;
	}

	public double multiplication() 
	{
		return 0;
	}

}
