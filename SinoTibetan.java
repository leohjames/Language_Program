public class SinoTibetan extends Language {

    public SinoTibetan(String langName, int numSpeak) {
        super(langName, numSpeak, "Asia", "subject-object-verb");
        if(langName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}