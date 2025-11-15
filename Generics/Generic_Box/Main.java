package Generic.Generic_Box;

public class Main {
	public static void main(String[] args) {
		Box<String> name = new Box<>();
		name.set("Tanmay");
		System.out.println(name.get());
	}
}
