
import sheet.Sheet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import cell.Ceil;
import cell.Cell;
import cell.Exponential;
import cell.Factorial;
import cell.Floor;
import cell.Number;

import java.util.Arrays;
import java.util.List;

/**
 * width height // board
 * number width height value // number cell
 */
public class Terminal {
    private List<String> ONE_NUMBER_CELL_TYPES = Arrays.asList("number", "ceil", "factorial", "floor");
    private List<String> TWO_NUMBER_CELL_TYPES = Arrays.asList("exponential");

    public Sheet readFile(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));

            int width = scanner.nextInt();
            int height = scanner.nextInt();
            Sheet sheet = Sheet.getInstance(width, height);

            while (scanner.hasNextLine()) {
                // Lê a primeira string
                String cellType = scanner.next();

                // Lê as coordenadas
                String location = scanner.next();

                Cell cell = readLine(cellType, scanner);
                sheet.addElement(cell, location);
            }

            scanner.close();
            return sheet;
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            return Sheet.getInstance(0, 0);
        }
    }

    private Cell readLine(String cellType, Scanner scanner) {
        if (ONE_NUMBER_CELL_TYPES.contains(cellType)) {
            float value = scanner.nextFloat();
            if (cellType == "number") {
                return new Number(value);
            } else if (cellType == "ceil") {
                return new Ceil(value);
            } else if (cellType == "factorial") {
                return new Factorial(value);
            } else if (cellType == "floor") {
                return new Floor(value);
            }
        } else if (TWO_NUMBER_CELL_TYPES.contains(cellType)) {
            float base = scanner.nextFloat();
            float exponent = scanner.nextFloat();
            return new Exponential(base, exponent);
        }
        return new Number(0);
    }
}
