package _06_cow_timer;

public class Student {
	



	      static int nextId;



	      static String School="Carmel Valley ";



	      int id;



	      String name;



	      int currentLevel;



	      Student (String name, int currentLevel, int id){

	    	  this.id = id;

	          this.name = name; 

	          this.currentLevel = currentLevel; } 



	      public static void main(String[] args){ 



	      //create 2 students. 
	    	  
	    Student dog = new Student("dog",1,1);
	    Student cat = new Student("cat",2,2);

	      //print their names, ids and school.
	    	  
	    System.out.println(dog.name);
	    System.out.println(dog.id);
	    System.out.println(School);
	    
	    System.out.println(cat.name);
	    System.out.println(cat.id);
	    System.out.println(School);
	      
	      }} 



