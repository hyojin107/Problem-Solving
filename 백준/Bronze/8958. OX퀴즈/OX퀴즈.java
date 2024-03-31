import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] oxArr = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            oxArr[i] = br.readLine();
        }

        for (String ox : oxArr) {
            int score = 0;
            int sum = 0;
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else if (ox.charAt(j) == 'X') {
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
