package java00_case_study_james.classes;


public class Dictionary {
    private String word;
    private String adjective;
    private String noun;
    private String verb;
    private String synonym;
    private String pronunciation;

    public Dictionary(String word, String adjective, String noun, String verb, String synonym, String pronunciation) {
        this.word = word;
        this.adjective = adjective;
        this.noun = noun;
        this.verb = verb;
        this.synonym = synonym;
        this.pronunciation = pronunciation;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }


}
