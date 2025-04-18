package _07_duck;
import java.util.Scanner;
import java.util.Random;
public class Cat {
	String name;
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	Cat(String name){
		this.name = name;
		System.out.println("You have a cat named " + name + " now!");
	}
	void Meow() {
		System.out.println("meeeeeow!!!");
	}
	void Play(String toy)
	{
		System.out.println(name + " wants to play with a " + toy + ".");
	}
	void Jump() {
		System.out.println("Just so you know, your cat might hurt themselves.");
		int hurt = rand.nextInt(6);
		if(hurt == 5)
		{
			System.out.println("Oh no! Your cat is hurt!");
			
		}
	}
}
