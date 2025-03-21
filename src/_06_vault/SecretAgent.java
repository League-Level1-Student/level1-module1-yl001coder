package _06_vault;

public class SecretAgent {

	SecretAgent(String name) {
		System.out.println("your agent named " + name + " has been created");
		
	}
	void Guess() {
		Vault vault = new Vault();
		for(int i = 0; i > 1000001; i++)
		{
			vault.tryCode(i);
			if(vault.tryCode(i) == true)
			{
				System.out.println("the code is " + i);
			}
			else
			{
				System.out.println("Guessing code... ");
			}
		}
	}
}
