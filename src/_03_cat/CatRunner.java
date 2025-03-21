package _03_cat;

public class CatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("Taro");
		cat.printName();
		cat.meow();
		for(int i = 0; i <9; i++)
		{
			cat.kill();
		}
		
	}

}
