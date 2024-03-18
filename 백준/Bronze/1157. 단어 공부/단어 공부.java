import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        String str = read.toUpperCase();

        // 알파벳 카운팅
        int[] ch = new int['Z' + 1];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ch[c]++;
        }

        boolean isDuplicated = false;
        char alphabet = 'a';
        int max = 0;
        for (int i = 'A'; i <= 'Z'; i++) {
            if (max < ch[i]) {
                max = ch[i];
                alphabet = (char) i;
                isDuplicated = false;
            } else if(max == ch[i]) {
                isDuplicated = true;
            }
        }

        if (isDuplicated) System.out.println("?");
        else System.out.println(alphabet);
    }
}
