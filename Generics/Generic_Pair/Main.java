package Generic.Generic_Pair;

public class Main {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("Anmol",20);
		System.out.println(pair.getFirst());
		System.out.println(pair.getLast());
	}
}
