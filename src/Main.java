import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            TuringMachine turingMachine = LoadFile.loadFile("C:\\Users\\pw06413\\Desktop\\MaszynaTuringa\\src\\in");
            System.out.println(turingMachine);

    }
}
