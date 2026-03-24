import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;

public class Encryptor {
    private static final int GCM_TAG_LENGTH = 128; // Standard for integrity
    private static final int IV_SIZE = 12; // Best practice for GCM

    public static void main(String[] args) throws Exception {
        String plainText = "Secure Lab Data 2026";
        
        // Generate a 256-bit AES Key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();

        // Setup Cipher for AES/GCM
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] iv = new byte[IV_SIZE]; // In real use, generate randomly
        GCMParameterSpec spec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);

        cipher.init(Cipher.ENCRYPT_MODE, secretKey, spec);
        byte[] cipherText = cipher.doFinal(plainText.getBytes());

        System.out.println("Encrypted String: " + Base64.getEncoder().encodeToString(cipherText));
    }
}
