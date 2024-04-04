package TC_501;

import java.util.Random;

public class RandomEmail {
    public static  String[] domains = {"gmail.com"};
    public static  int maxLength = 15;


    public void generateRandomEmailTest() {
        String randomEmail = generateRandomEmail();
        System.out.println("Random Email: " + randomEmail);
    }

    public static String generateRandomEmail() {
        Random random = new Random();
        StringBuilder email = new StringBuilder();


        int length = random.nextInt(maxLength) + 1;
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            email.append(c);
        }

        email.append("@").append(domains[random.nextInt(domains.length)]);

        return email.toString();
    }
//
}

