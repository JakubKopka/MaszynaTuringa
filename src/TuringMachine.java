import java.util.ArrayList;
import java.util.List;

public class TuringMachine {
    private String tapeAlphabet;
    private String inputAlphabet;
    private String inputWord;
    private String states;
    private String initialState;
    private String acceptingState;
    private List<Transition> transitionRelation = new ArrayList<>();
    private List<String> tapeMachine = new ArrayList<>();
    private int currentSize = 32;
    private final int size = 32;

    public void createTape() {
        String[] iW = inputWord.split("");
        System.out.println(iW.length);
        System.out.println(currentSize);
        for (int i = 1; i < 10000000; i++) {
            if (iW.length < currentSize) {
                break;
            } else {
                currentSize = currentSize + size;
            }
        }
        int center = iW.length / 2;
        // dodawanie słowa na środku taśmy
        int centerTape = currentSize / 2;
        int startWordIndex = centerTape - center - 1; //-1 bo liczymy od 0
        for(int i = 0; i< currentSize; i++){
            if(i < startWordIndex && i > (startWordIndex + iW.length)){
                tapeMachine.add("#");
            }
        }

        System.out.println("-------------");
        for(int i = 0; i<tapeMachine.size(); i++){
            System.out.println(tapeMachine.get(i));
        }
        System.out.println("-------------");

    }

    public void increaseTheTape() { // powiększenie taśmy o 32 bity, 1bit = 1 "mijesce" w liscie

    }

    public String getTapeAlphabet() {
        return tapeAlphabet;
    }

    public void setTapeAlphabet(String tapeAlphabet) {
        this.tapeAlphabet = tapeAlphabet;
    }

    public String getInputAlphabet() {
        return inputAlphabet;
    }

    public void setInputAlphabet(String inputAlphabet) {
        this.inputAlphabet = inputAlphabet;
    }

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getInitialState() {
        return initialState;
    }

    public void setInitialState(String initialState) {
        this.initialState = initialState;
    }

    public String getAcceptingState() {
        return acceptingState;
    }

    public void setAcceptingState(String acceptingState) {
        this.acceptingState = acceptingState;
    }

    public List<Transition> getTransitionRelation() {
        return transitionRelation;
    }

    public void setTransitionRelation(List<Transition> transitionRelation) {
        this.transitionRelation = transitionRelation;
    }

    @Override
    public String toString() {
        return "TuringMachine{" +
                "tapeAlphabet='" + tapeAlphabet + '\'' +
                ", inputAlphabet='" + inputAlphabet + '\'' +
                ", inputWord='" + inputWord + '\'' +
                ", states='" + states + '\'' +
                ", initialState='" + initialState + '\'' +
                ", acceptingState='" + acceptingState + '\'' +
                ", transitionRelation=" + transitionRelation +
                '}';
    }
}
