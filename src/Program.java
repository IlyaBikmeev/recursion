import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Character> alphabet = allCharacters();     //62 символа
        generateStrings(3, alphabet, "");       //62 ^ n
    }

    public static List<Character> allCharacters() {
        List<Character> result = new ArrayList<>();
        for(char c = 'A'; c <= 'Z'; c++) {
            result.add(c);
        }
        for(char c = 'a'; c <= 'z'; c++) {
            result.add(c);
        }

        for(char c = '0'; c <= '9'; c++) {
            result.add(c);
        }
        return result;
    }

    //Печать числа справа налево
    public static void printBackwards(int num) {
        if(num <= 0) {
            System.out.println();
            return;
        }
        System.out.print(num % 10);
        printBackwards(num / 10);
    }

    //Печать каждой цифры числа в новой строке
    public static void printDigitsOneByOne(int num) {
        if(num <= 0) {
            return;
        }
        printDigitsOneByOne(num / 10);
        System.out.println(num % 10);
    }

    public static void generateStrings(int length, List<Character> alphabet, String cur) {
        if(cur.length() == length) {
            System.out.println(cur);
            return;
        }

        for(Character c : alphabet) {
            generateStrings(length, alphabet, cur + c);
        }
    }
}
