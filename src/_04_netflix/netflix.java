package _04_netflix;

public class netflix {

	public static void main(String[] args) {
	
		Movie car = new Movie("car", 1);
		Movie frog = new Movie("frog", 2);
		Movie aaa = new Movie("aaa", 3);
		Movie dog = new Movie("dog", 4);
		Movie cat = new Movie("cat", 5);
		
		System.out.println(cat.getTicketPrice());
		
		NetflixQueue queue = new NetflixQueue();
		
		queue.addMovie(car);
		queue.addMovie(frog);
		queue.addMovie(aaa);
		queue.addMovie(dog);
		queue.addMovie(cat);
		
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		queue.sortMoviesByRating();
		System.out.println("The second best movie is " + queue.getMovie(1));

	}

}
