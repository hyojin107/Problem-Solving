import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] times = br.readLine().split(" ");
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);

        LocalTime time = LocalTime.of(hour, minute).minusMinutes(45);
        System.out.println(time.getHour() + " " + time.getMinute());
    }
}
