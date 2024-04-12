import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] ch = new int['z' + 1];
        Arrays.fill(ch, -1);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ch[c] = str.indexOf(c + "");
        }
        int[] result = Arrays.copyOfRange(ch, 'a' + 0, 'z' + 1);
        StringBuilder sb = new StringBuilder();
        for (int cnt : result) {
            sb.append(cnt).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
