import java.util.*;
public class InputHelper{
    public static void main(String[] args) {
        
    }

    public static int getInt(Scanner in, String prompt){
        Boolean sentinel = true;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                sentinel = false;
            }else{
                System.out.println("Try Again");
            }
        } while (sentinel);
        return x;
    }

    public static int getRangedInt(Scanner in, String prompt, int min, int max){
        int x = 0;
        boolean sentinel = true;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (min < x && max > x) {
                    sentinel = false;
                }
            }else{
                System.out.println("Try Again");
            }
        } while (sentinel);
        return x;
    }

    public static String getRegExString(String Prompt, Scanner in, String regEx){
        String input;
        boolean valid = false;
        do {
            System.out.println(Prompt);
            input = in.nextLine();
            if (input.matches(regEx)) {
                valid = true;
            }else{
                System.out.println("Invalid Input");
            }
        } while (!valid);
        return input;
    }

    public static String getNonZeroLenString(Scanner in, String prompt){
        boolean sentinel = true;
        System.out.println(prompt);
        String temp;
        do {
            temp = in.nextLine();
            if (temp.length() > 0) {
                sentinel = false;
                
            }else{
                System.out.println("Enter a string with length higher then 0");
            }
        } while (sentinel);
        return temp;
    }

    public static double getDouble(Scanner in, String prompt){
        Boolean sentinel = true;
        double x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                sentinel = false;
            }else{
                System.out.println("Try Again");
            }
        } while (sentinel);
        return x;
    }

    public static double getRangedDouble(Scanner in, String prompt, double min, double max){
        double x = 0;
        boolean sentinel = true;
        System.out.println(prompt);
        do {
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                if (min < x && max > x) {
                    sentinel = false;
                }
            }else{
                System.out.println("Try Again");
            }
        } while (sentinel);
        return x;
    }

    public static int getPositiveNonZeroInt(Scanner in, String prompt){
        int x = 0;
        System.out.println(prompt);
        boolean sentinel = true;
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x > 0) {
                    sentinel = false;
                }
            }else{
                System.out.println("Enter a non-zero positive int");
            }
        } while (sentinel);
        return x;
    }
    public static HashSet<String> getYNConfirm(Scanner in, String prompt){
        HashSet<String> set = new HashSet<>();
        boolean sentinel = true;
        String temp;
        while (sentinel) {
            System.out.println(prompt);
            temp = in.nextLine();
            if (temp.equalsIgnoreCase("y") || temp.equalsIgnoreCase("n")) {
                sentinel = false;
            }else{
                set.add(temp);
            }
        }
        return set;
    }
}