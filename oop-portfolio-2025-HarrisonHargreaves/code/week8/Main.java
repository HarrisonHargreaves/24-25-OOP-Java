package code.week8;

public class Main 
{

/**
 * @param args
 */
public static void main(String[] args)
  {
    Password password = new Password("mySecretPassword");
    System.out.println("Original Password: " + password.decrypt());
    password.encrypt();
    System.out.println("Encrypted Password: " + password);
  }
}

