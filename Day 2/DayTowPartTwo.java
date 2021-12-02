import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTowPartTwo {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\nzaye\\IdeaProjects\\Advent2021\\src\\input");

        int depth = 0;
        int h_position = 0;
        int aim = 0;

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {

                String move = scanner.next().split(" ")[0];
                int units = Integer.parseInt(scanner.next());

                switch (move) {
                    case "forward" -> {
                        h_position += units;
                        depth += (aim * units);
                    }
                    case "down" -> aim += units;
                    case "up" -> aim -= units;
                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("File not Found");

        }

        System.out.println("Depth: " + depth);

        System.out.println("Horizontal position: " + h_position);

        System.out.println("Aim: " + aim);

        System.out.println("Result: " + depth * h_position);

    }
}
