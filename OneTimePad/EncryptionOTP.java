package OneTimePad;

import java.util.Random;

public class EncryptionOTP {
    
    // Wort in Hexadezimal umwandeln
    public static  String[] wortInHexa(String wort){
        char[] buchstaben = wort.toCharArray();
        String[] hexaBuchstaben = new String[buchstaben.length];

        for (int i = 0; i < buchstaben.length; i++) {
            hexaBuchstaben[i] = Integer.toHexString(buchstaben[i]);
        }

        return  hexaBuchstaben;
    }
    
    //key mit der Selben länge Erstellen
    public static String[] keyGenerate(String[] hexaWort){
        Random randomizer = new Random();
        String[] key = new String[hexaWort.length]; 

        for(int i = 0; i < hexaWort.length; i++){
            key[i] = Integer.toHexString(randomizer.nextInt(256));

        }

        return key;
    }

    public static String[] encryption(String[] hexaWort,String[] key){
        String[] encryptWort = new String[hexaWort.length];

        for(int i = 0; i < hexaWort.length; i++){
            encryptWort[i] = hexaWort[i] ^ key[i]; //muss es als char array machen
        }
        


        return null;
    }

    public static void main(String[] args) {
        String testWort = "Hallo ich bin ein großer string";
        char [] wort = testWort.toCharArray();
        String [] hexaZahlen = wortInHexa(testWort);
        int [] key = keyGenerate(hexaZahlen);

        for (int i = 0; i < hexaZahlen.length; i++) {
            //System.out.println("Buchstabe: "+wort[i]+" Hexa:"+hexaZahlen[i]);
            System.out.println(Integer.toHexString(key[i]));
        }
    }

    
}
