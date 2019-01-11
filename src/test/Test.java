package test;

public class Test {
    public static void main(String[] args) {
        char[] str = {'s', 't', 's', 't', 'a'};
        char c = ' ';
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (i == j) {
                    continue;
                }
                if (str[i] == str[j]) {
                    break;
                }
                if (j == str.length) {
                    c = str[i];
                }
            }
            if (c != ' ') {
                break;
            }
        }
        System.out.println(c);
    }
}
