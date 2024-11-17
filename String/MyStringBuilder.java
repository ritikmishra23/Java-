
//String=>immutable
//StringBuilder=>Mutable
import java.util.*;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ritik");

        // char at index 0
        System.out.println(sb.charAt(0));// R

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);// Pitik

        // inserting at index 0
        sb.insert(0, 'p');
        System.out.println(sb);// pPitik

        // deletion
        sb.delete(0, 1);
        System.out.println(sb);// Pitik
        sb.setCharAt(0, 'R');

        sb.append("Mishra");
        System.out.println(sb);// RitikMishra

        // Reversing string
        // time complexity O(n)
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);// arhsiMkitiR
    }

}
