package StringBuilder;

import java.util.Scanner;

public class UsernameFromEmailSb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        StringBuilder username = new StringBuilder();

        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username.append(email.charAt(i));
            }
        }
        System.out.println(username);
    }
}
