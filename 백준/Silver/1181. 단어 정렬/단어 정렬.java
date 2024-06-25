import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        Set<String> words = new HashSet<>();
        for (int i = 0; i < cnt; i++) {
            words.add(br.readLine());
        }

        List<String> orderWords = new ArrayList<>(words);
        orderWords.sort((o1, o2) -> (o1.length() != o2.length()) ?  o1.length() - o2.length() : o1.compareTo(o2));

        for (String orderWord : orderWords) {
            System.out.println(orderWord);
        }
    }
}
