import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Day1 {
    public static int part1(File input){
        int sum = 0;
        try( BufferedReader br = new BufferedReader(new FileReader(input))){
            String inputString = br.readLine();
            for (char instruction : inputString.toCharArray()){
                if (instruction == '('){
                    sum++;
                    continue;
                }
                if (instruction == ')'){
                    sum--;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return sum;
    }

    public static int part2(File input){
        int sum = 0, count = 0;
        try( BufferedReader br = new BufferedReader(new FileReader(input))){
            String inputString = br.readLine();
            for (char instruction : inputString.toCharArray()){
                count++;
                if (instruction == '('){
                    sum++;
                }
                if (instruction == ')'){
                    sum--;
                }
                if (sum < 0){
                    return count;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
}
