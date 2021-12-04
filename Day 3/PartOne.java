package Day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class PartOne {

    public static void main(String[] args) throws IOException {

        StringBuilder gammaRate = new StringBuilder();

        Integer[][] matrix = readFile("C:\\Users\\nzaye\\IdeaProjects\\Advent2021\\src\\Day3\\puzzle_input");

        for (int j = 0; j < matrix[0].length; j++) {

            // putting the counters of 0 and 1 inside the loop, so they will be reset after each iteration

            int counter0 = 0;
            int counter1 = 0;

            for (Integer[] numbers : matrix) {

                if (numbers[j] == 0) {

                    counter0++;

                } else {

                    counter1++;
                }

            }

            if (counter0 > counter1) {

                gammaRate.append(0);

            } else {

                gammaRate.append(1);
            }
        }

        int gammaDec = Integer.parseInt(String.valueOf(gammaRate), 2);

        System.out.println("GammaRate in binary: " + gammaRate);

        System.out.println("GammaRate in Decimal: " + gammaDec);

        StringBuilder epsilon = new StringBuilder();

        for (String elem: String.valueOf(gammaRate).split("")) {

            if (elem.equals("0")) {

                epsilon.append(1);

            } else {

                epsilon.append(0);
            }

        }

        int epsilonRate = Integer.parseInt(String.valueOf(epsilon), 2);

        System.out.println("Epsilon rate in binary: " + epsilon);

        System.out.println("Epsilon Rate in Decimal: " + epsilonRate);

        System.out.println("Result: " + epsilonRate * gammaDec);


    }

    // Method to convert the values in the file into 2D array using Streams taken from SOV:

    public static Integer[][] readFile(String path) throws IOException {

        return Files.lines(Paths.get(path)).filter(line -> !line.trim().isEmpty())
                .map(line -> Arrays.stream(line.split("")).map(Integer::parseInt)
                        .toArray(Integer[]::new)).toArray(Integer[][]::new);
    }

}
