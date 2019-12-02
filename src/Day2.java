import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Day2 {
    public static int part1(File input){
        int sum = 0;
        try( BufferedReader br = new BufferedReader(new FileReader(input))){
            while (br.ready()){
                String inputString = br.readLine();
                int[] dimensions = Arrays.stream(inputString.split("x")).mapToInt(Integer::parseInt).toArray();
                int side1 = dimensions[0] * dimensions[1];
                int side2 = dimensions[0] * dimensions[2];
                int side3 = dimensions[1] * dimensions[2];
                int slack = Math.min(side3, Math.min(side1, side2));
                sum += 2 * (side1 + side2 + side3) + slack;
            }
            return sum;
        } catch (Exception e){
            e.printStackTrace();
        }
        return sum;
    }

    public static int part2(File input){
        int sum = 0;
        try( BufferedReader br = new BufferedReader(new FileReader(input))){
            while (br.ready()){
                String inputString = br.readLine();
                int[] dimensions = Arrays.stream(inputString.split("x")).mapToInt(Integer::parseInt).toArray();
                int side1 = 2 * (dimensions[0] + dimensions[1]);
                int side2 = 2 * (dimensions[0] + dimensions[2]);
                int side3 = 2 * (dimensions[1] + dimensions[2]);
                int strip = Math.min(side3, Math.min(side1, side2));
                int bow = dimensions[0] * dimensions[1] * dimensions[2];
                sum += strip + bow;
            }
            return sum;
        } catch (Exception e){
            e.printStackTrace();
        }
        return sum;
    }
}
