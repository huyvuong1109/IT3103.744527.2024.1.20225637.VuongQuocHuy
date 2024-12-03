
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
     public static void main(String[] args) {
        String filename = "C:/Users/Admin/OneDrive/Documents/GitHub/IT3103.744527.2024.1.20225637.VuongQuocHuy/LAB2.20225637.VuongQuocHuy/text.txt";
        byte[] inputBytes = {};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (byte b : inputBytes) {
                sb.append((char) b);
            }
            String outputString = sb.toString();
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
