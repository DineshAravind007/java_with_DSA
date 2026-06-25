import java.util.*;

class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        str = str.trim();  

        String[] words = str.split(" ");

        String lastWord = words[words.length - 1];

        System.out.println("Length of last word: " + lastWord.length());
    }
}