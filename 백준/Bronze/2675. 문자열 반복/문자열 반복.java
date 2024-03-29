import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int cnt = Integer.parseInt(str[0]);
            String alp = str[1];
            for (int j = 0; j < alp.length(); j++) {
                for (int k = 0; k < cnt; k++) {
                    sb.append(alp.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
