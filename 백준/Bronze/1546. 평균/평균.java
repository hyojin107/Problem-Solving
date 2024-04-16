import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] score = br.readLine().split(" ");

        int max = 0;
        for (int i = 0; i < cnt; i++) {
            if (max < Integer.parseInt(score[i])) {
                max = Integer.parseInt(score[i]);
            }
        }

        double sum = 0.0;
        for (int i = 0; i < cnt; i++) {
            sum +=  Math.round(Double.parseDouble(score[i]) / max * 100 * 100) / 100.0;
        }

        System.out.println(sum / cnt);
    }
}
