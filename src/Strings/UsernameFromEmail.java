package Strings;

import java.util.Scanner;

public class UsernameFromEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email : ");
        String email = sc.next();

        String username = "";

        for (int i=0; i<email.length(); i++){
            if (email.charAt(i) == '@') {
               break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println("User name is : " + username);
    }
}


// Method 2nd
//        for (int i=0; i<email.length(); i++){
//            int idx = email.indexOf("@");
//            if (email.charAt(i) == '@') {
//                username = (String) email.subSequence(0, idx);
//            } else {
//                username += email.charAt(i);
//            }
//        }
