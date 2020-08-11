

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Cypher cypher = new Cypher();

        String magic = in.nextLine();
        String msg = in.nextLine();
        int key = in.nextInt();

        switch (magic) {
            case "enc":
                cypher.encrypt(msg, key, sb);
                break;
            case "dec":
                cypher.decrypt(msg, key, sb);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + magic);
        }

        System.out.println(sb.toString());

    }
}

class Cypher {

    public void encrypt(String msg, int key, StringBuilder sb) {
        char[] arr = msg.toCharArray();

        for (char v : arr) {

            int r = v + key;
            char ch = (char) r;
            sb.append(ch);
        }
    }


    public void decrypt(String msg, int key, StringBuilder sb) {

        char[] arr = msg.toCharArray();

        for (char v : arr) {

            int r = v - key;
            char ch = (char) r;
            sb.append(ch);


        }
    }
}
