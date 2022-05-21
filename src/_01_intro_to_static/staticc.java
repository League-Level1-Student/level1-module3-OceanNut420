package _01_intro_to_static;

public class staticc {
	
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    staticc (String name, int speed, int bibNumber){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber = bibNumber;
	    }
	    
	    public void getName() {
			System.out.println("My name is " + name);
		}
	    
	    public void getBibNum() {
			System.out.println("My bib number is " + bibNumber);
		}
	    
	    public void getRaceLoc() {
			System.out.println("My race is located in " + raceLocation);
		}

	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	
	    	staticc fred = new staticc("fred", 11, 1);
	    	staticc bob = new staticc("bob", 33, 2);
	    	
	    	bob.getName();
	    	bob.getBibNum();
	    	bob.getRaceLoc();
	    	
	    	fred.getName();
	    	fred.getBibNum();
	    	fred.getRaceLoc();
	    	
	    }
	
}