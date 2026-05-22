package OneTimePad;

import java.util.Random;

public class EncryptionOTP {

    public static int[] encryptionWort(String text){
        int[] encryptedChar = new int[text.length()];
        char [] cipherChar = text.toCharArray();
        int[] key = generateKey(text);
        
        for(int i = 0; i < encryptedChar.length;i++){

            encryptedChar[i] = cipherChar[i] ^ key[i];
        }
        
        return encryptedChar;
    }

    public static int[] generateKey(String text){
        Random random = new Random();
        int []key = new int[text.length()];

        System.out.print("Key:\t\t");
        for(int i = 0; i < key.length; i++){
            key[i] = random.nextInt(255);
            System.out.print(" "+key[i]+" ");
        }

        return key;
    }
    
   

    public static void main(String[] args) {

        String text = "Hallo wie geht es dir denn heute";
        char[] cipherChar = text.toCharArray();

        System.out.print("Cipher:\t\t");
        for(int i = 0; i < cipherChar.length; i++){

            System.out.print(" "+(int) cipherChar[i]+" ");

        }

        System.out.println("");

        int[] encryptedChar = encryptionWort(text);

        System.out.println();
        System.out.print("Encrypted:\t");
        for (int j = 0; j < encryptedChar.length; j++) {
            System.out.print(" "+encryptedChar[j]+" ");
        }

      
            

     
        

    }


    
}
