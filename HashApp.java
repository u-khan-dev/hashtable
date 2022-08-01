import java.util.Hashtable;
import java.util.Enumeration;

public class HashApp {
    static Hashtable<String, Integer> ht;

    public static void main(String[] args) {
        ht = new Hashtable<>();
        ht.put("Sue", 100);
        ht.put("Adam", 90);
        ht.put("Lilly", 85);
        ht.put("Cory", 97);
        ht.put("Maggie", 77);
        ht.put("Stan", 87);
        ht.put("Jeff", 65);

        System.out.println("\nhash table mappings: " + ht);
        System.out.println("\nThe hash table contains the key 'Ruth': " + ht.containsKey("Ruth"));
        System.out.println("\nThe hash table contains the key 'Stan': " + ht.containsKey("Stan"));
        System.out.println("\nSue's score on the test was: " + ht.get("Sue"));
        System.out.println("\nSomeone scored 86: " + ht.contains(86)); // method in Hashtable class
        System.out.println("\nSomeone scored 85: " + ht.containsValue(85)); // method in Map interface

        Enumeration<String> keyEnumeration = ht.keys();
        int hashTableSize = ht.size();
        int[] scores = new int[hashTableSize];
        int i = 0;

        while (keyEnumeration.hasMoreElements()) {
            String nextElem = keyEnumeration.nextElement();
            System.out.println("\n" + nextElem);
            scores[i] = ht.get(nextElem);
            i++;
        }

        double sum = 0;

        for (int j = 0; j < hashTableSize; j++)
            sum += scores[j];

        double average = sum / hashTableSize;

        System.out.println("\nThe average score was: " + average + ".");
    }
}
