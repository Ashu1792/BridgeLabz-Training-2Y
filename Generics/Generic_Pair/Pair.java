package Generic.Generic_Pair;

public class Pair<T, U> {
	T val1;
	U val2;
	public Pair(T val1, U val2) {
		this.val1=val1;
		this.val2=val2;
	}
	T getFirst() {
		return val1;
	}
	U getLast() {
		return val2;
	}
}
