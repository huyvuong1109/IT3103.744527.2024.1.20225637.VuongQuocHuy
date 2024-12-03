

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
   public static void main(String[] args) throws IOException {
        String filename = "C:/Users/Admin/OneDrive/Documents/GitHub/IT3103.744527.2024.1.20225637.VuongQuocHuy/LAB2.20225637.VuongQuocHuy/text.txt";
        byte[] inputBytes = {};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }  
}

