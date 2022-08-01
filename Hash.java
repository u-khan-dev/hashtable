import java.util.Random;

public class Hash {
    static int hash(String str) {
        char[] strArray = str.toCharArray();
        int len = strArray.length;
        int N = 101;
        int sum = 0;
        int a = 37;
        int scale = 19;
        int shift = 17;

        // get hash code (polynomial accumulation)
        for (int i = 0; i < len; i++)
            sum = (sum * a) + strArray[i];

        // run compression (MAD method)
        return (scale * sum + shift) % N;
    }

    public static void main(String[] args) {
        String str1 = "top";
        String str2 = "pot";

        System.out.println("\nString 1: " + str1 + " has hash: " + hash(str1));
        System.out.println("\nString 2: " + str2 + " has hash: " + hash(str2));

        int totalKeys = 50;

        String[] strings = new String[totalKeys];

        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalKeys; i++) {
            sb.setLength(0);

            for (int j = 0; j < 4; j++)
                sb.append((char)rand.nextInt(97, 123));

            strings[i] = sb.toString();
        }

        for (int i = 0; i < totalKeys; i++)
            System.out.println("\nString " + strings[i] + " has index: " + hash(strings[i]));
    }
}
