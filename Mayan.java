public class Mayan extends Language {
    public Mayan(String langName, int numSpeak) {
        super(langName, numSpeak, "Central America", "verb-object-subject");
    }
    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".\n" + "The language follows the word order: \n" + this.wordOrder);
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }
}
