import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwo {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\nzaye\\IdeaProjects\\Advent2021\\src\\input");

        int depth = 0;
        int h_position = 0;

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {

                String move = scanner.next().split(" ")[0];

                switch (move) {
                    case "forward" -> h_position += Integer.parseInt(scanner.next());
                    case "down" -> depth += Integer.parseInt(scanner.next());
                    case "up" -> depth -= Integer.parseInt(scanner.next());
                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("File not Found");

        }

        System.out.println("Depth: " + depth);

        System.out.println("Horizontal position: " + h_position);

        System.out.println("Result: " + depth * h_position);

    }

}
