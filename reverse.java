import java.util.Scanner;
public class reverse {
   Scanner scanner = new Scanner(System.in);

    public String reverseWord(String word){
        StringBuilder sb = new StringBuilder("");
        sb.append(word);
        String rev = sb.reverse().toString();
        System.out.println(rev);
        return rev;
    }


    public static void main(String[] args) {
        reverse obj = new reverse();
        obj.reverseWord("cool");
    }
}
