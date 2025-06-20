package code.week8;

import java.util.Base64;

public class Password implements Encryptable 
{
    private String password;
    private boolean encrypted;

    public Password(String password)
    {
        this.password = password;
        encrypted = false;
    }
    
    public void encrypt()
    {
        if (!encrypted) {
            password = new String(Base64.getEncoder().encodeToString(password.getBytes()));
            encrypted = true;
        }
        
    }

    public String decrypt()
    {
        if (encrypted) {
            byte[] decodedBytes = Base64.getDecoder().decode(password);
            password = new String(decodedBytes);
            encrypted = false;
        }
        return password;
    }

    public String toString()
    {
        return password;
    }
}