import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if("0".equals(str)) break;

            boolean isEquals = true;
            int endIdx = str.length();
            for (int i = 0; i < str.length() / 2; i++) {
                char startChar = str.charAt(i);
                char endChar = str.charAt(--endIdx);
                if (startChar != endChar) {
                    isEquals = false;
                    break;
                }
            }
            result.append(isEquals ? "yes" : "no").append("\n");
        }
        System.out.println(result);
    }
}
