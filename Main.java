

public class Main {
    public static void main(String[] args) {

        Cypher cypher = new Cypher();

        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("-mode")) {
                cypher.magic = args[i + 1];
            } else if (args[i].equals("-key")) {
                cypher.key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-data")) {
                cypher.msg = args[i + 1];
            }
        }

        switch (cypher.magic) {
            case "enc":
                cypher.encrypt();
                break;
            case "dec":
                cypher.decrypt();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + cypher.magic);


        }
        System.out.println(cypher.sb.toString());
        /*System.out.println(cypher.key);
        System.out.println(cypher.magic);
        System.out.println(cypher.msg);*/
    }
}


class Cypher {
    public StringBuilder sb = new StringBuilder();
    String magic = "enc";
    int key = 0;
    String msg = "";

    public void encrypt() {
        char[] arr = msg.toCharArray();

        for (char v : arr) {

            int r = v + key;
            char ch = (char) r;
            sb.append(ch);
        }

    }


    public void decrypt() {

        char[] arr = msg.toCharArray();

        for (char v : arr) {

            int r = v - key;
            char ch = (char) r;
            sb.append(ch);


        }
    }
}


