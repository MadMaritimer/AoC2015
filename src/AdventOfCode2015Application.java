import java.io.File;

public class AdventOfCode2015Application {
    public static void main(String[] args){
        boolean debug = Boolean.parseBoolean(args[0]);

        //Day 1
        int sol1_1 = Day1.part1(new File(args[1]));
        int sol1_2 = Day1.part2(new File(args[1]));
        if (debug){
            System.out.println("Day 1, Part 1: " +sol1_1);
            System.out.println("Day 2, Part 2: " +sol1_2);
        }
    }
}
