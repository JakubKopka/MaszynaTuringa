import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadFile {
    public static TuringMachine loadFile(String pathToFile){
        TuringMachine turingMachine = new TuringMachine();
        List<Transition> list = new ArrayList<>();
        File file = new File(pathToFile);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int iterator = 0;
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(iterator == 1){
                turingMachine.setTapeAlphabet(line);
            }
            if(iterator == 3){
                turingMachine.setInputAlphabet(line);
            }
            if(iterator == 5){
                turingMachine.setInputWord(line);
            }
            if(iterator == 7){
                turingMachine.setStates(line);
            }
            if(iterator == 9){
                turingMachine.setInitialState(line);
            }
            if(iterator == 11){
                turingMachine.setAcceptingState(line);
            }

            if(iterator > 12){
                list.add(new Transition(line));
            }
            iterator ++;
        }
        turingMachine.setTransitionRelation(list);
        turingMachine.createTape();
        return turingMachine;
    }
}
