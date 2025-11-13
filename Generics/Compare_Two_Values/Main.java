package Generic.Compare_Two_Values;

public class Main {
	public static <T> void isEqual(T a, T b) {
		if(a.equals(b)) {
			System.out.println(a+" is equal to "+b);;
		}
		else {
			System.out.println(a+" is not equal to "+b);
		}
	}
	public static void main(String[] args) {
		isEqual(5,5);
		isEqual(5,"5");
		isEqual("5",5);
		isEqual("q","Q");
		isEqual("q","q");
	}
}
