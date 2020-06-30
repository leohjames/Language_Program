// This program creates a string providing some information regarding a language given its name and number of speakers
public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String langName, int numSpeak, String regions, String words) {
        this.name = langName;
        this.numSpeakers = numSpeak;
        this.regionsSpoken = regions;
        this.wordOrder = words;
    }
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".\n" + "The language follows the word order: \n" + this.wordOrder);
    }
    public static void main(String[] args) {
        Mayan kiche = new Mayan("Ki'che'", 2330000);
        SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        kiche.getInfo();
        mandarinChinese.getInfo();
        burmese.getInfo();
    }
}
