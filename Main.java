package oops;

public class Main {
	public static void main(String[] args) {
		ToyStore store1=ToyStore.getInstance();
		ToyStore store2=ToyStore.getInstance();
		System.out.println(store1==store2);
		
	}

}
