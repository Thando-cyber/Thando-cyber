
public class Customer {

	private String name;
    private int age;
    private int numBookings;
    private int[] points;
	private char car;


    public Customer(String name,int age,char car){
        this.name = name;
        this.age = age ;
        this.car = car;

    }
    public void setName(String name){
        if (name.length()>3){
            this.name= name;
        }
    }
    public void setAge(int age){
        if (age>0){
            this.age=age;
        }
    }
    public void setPoints(char car){
    	if (car=='f') {
    		
    	}
        numBookings= numBookings +1;


    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int[] getpoints(){
        return points;
    }
    public double getFirstClassPoints(){
        double firstclass=0.0;
        for (int n : points){
            if (n== 5.0){
                firstclass+= 1;
            }
        }
        double firstclasspoints = firstclass*5;
        return firstclasspoints;
    }
    public double getBusinessClassPoints(){
        double secdclass=0.0;
        for (int n : points){
            if (n== 5.0){
                secdclass+= 1;
            }
        }
        double secdclasspoints = secdclass*3;
        return secdclasspoints;
    }
    public double getEconomyClassPoints(){
        double econclass=0.0;
        for (int n : points){
            if (n== 5.0){
                econclass+= 1;
            }
        }
        double econclasspoints = econclass*2;
        return econclasspoints;
    }
        public String displayPoints(){
            String disp = "First class-"+getFirstClassPoints()+","+"Business Class"+getBusinessClassPoints()+","+"Economy class"+getEconomyClassPoints();
            return disp;
        }

    String toString1(){
        String strin = "Name: "+name+","+"Age"+age+","+"Number of Bookings: "+numBookings; 
        return strin;
    }    

}
