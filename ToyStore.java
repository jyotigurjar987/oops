package oops;

public class ToyStore {
	
	private static ToyStore instance;
	private ToyStore () {
		System.out.println("A new ToyStore is created!");
		
	}
	public static ToyStore getInstance() {
		
		if (instance==null) {
			
			instance= new ToyStore();
		}
		return instance;
	}
	

}
