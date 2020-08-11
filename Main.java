import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String msg = in.nextLine();
        int key = in.nextInt();

        char[] arr = msg.toCharArray();
        for (char v : arr) {
            if (v > 96 && v < 123) { // validate is letter
                if (v + key > 122) {
                    int r = v + key - 122;
                    char wrap = (char) (96 + r);
                    sb.append(wrap);

                } else {
                    v += key;
                    char ch = (char) v;

                    sb.append(ch);

                }
            } else { // is space or symbol

                sb.append(v);
            }
        }
        System.out.println(sb.toString());

    }
}
/*
a 097 z 122
b 098 y 121
c 099 x 120
d 100 w 119
e 101 v 118
f 102 u 117
g 103 t 116
h 104 s 115
i 105 r 114
j 106 q 113
k 107 p 112
l 108 o 111
m 109 n 110
 */