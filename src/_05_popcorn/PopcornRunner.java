package _05_popcorn;

public class PopcornRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microwave mw = new Microwave();
		Popcorn popcorn = new Popcorn("unicorn");
		mw.putInMicrowave(popcorn);
		mw.setTime(5);
		mw.startMicrowave();
	}

}
