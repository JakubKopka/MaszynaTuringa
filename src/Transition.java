public class Transition {
    private String currentState;
    private String characterRead;
    private String targetState;
    private String writtenCharacter;
    private String direction;

    public Transition(String line){
        String[] str = line.split(" ");
        if(str.length != 5) System.out.println("Błąd Transition");
        else {
            currentState = str[0].replaceAll("\\s+","");
            characterRead = str[1].replaceAll("\\s+","");
            targetState = str[2].replaceAll("\\s+","");
            writtenCharacter = str[3].replaceAll("\\s+","");
            direction = str[4].replaceAll("\\s+","");
        }
    }

    @Override
    public String toString() {
        return "Transition{" +
                "currentState='" + currentState + '\'' +
                ", characterRead='" + characterRead + '\'' +
                ", targetState='" + targetState + '\'' +
                ", writtenCharacter='" + writtenCharacter + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}

