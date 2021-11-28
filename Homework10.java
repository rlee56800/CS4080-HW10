import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                int num = myReader.nextInt();
                if(num > 100 || num < -100) {
                    myReader.close();
                    throw new OutOfBounds("Out of bounds!!");
                }
                System.out.print(num + " ");
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
          } catch (InputMismatchException e) {
              System.out.println("Error: input is not an integer");
          } catch (OutOfBounds e) {
              System.out.println("Error: input out of bounds");
          }
    }
}
