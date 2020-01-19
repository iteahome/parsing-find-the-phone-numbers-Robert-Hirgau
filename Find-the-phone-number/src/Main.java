import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	/*
        Considering the below text please find using only one regex all phone numbers in this format:
        07xx-xxxxxx
        (07xx)-xxxxx
        07xx xxx xxx
        07xx xxx-xxx
        07xx-xxx-xxx
         */

        String theRegex = "\\(?[0][7]\\d{2}\\)?[-\\s]?\\d{3}[-\\s]?\\d{3}";

        Pattern checkRegex = Pattern.compile(theRegex);

        String stringToCheck = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110";
        Matcher regexMatcher = checkRegex.matcher(stringToCheck);
        System.out.println("Matches are :");
        while (regexMatcher.find()){
            System.out.println(regexMatcher.group());
        }
    }
}
