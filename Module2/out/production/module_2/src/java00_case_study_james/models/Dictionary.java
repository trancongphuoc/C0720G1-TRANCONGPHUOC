package java00_case_study_james.models;


import java00_case_study_james.menu.MainMenu;

import java.util.List;

public class Dictionary {
    private String word;
    private String adjective;
    private String noun;
    private String verb;
    private String pronunciation;
    private List<String> synonym;

    public Dictionary(String word, String adjective, String noun, String verb, String pronunciation, List<String> synonym) {
        this.word = word;
        this.adjective = adjective;
        this.noun = noun;
        this.verb = verb;
        this.pronunciation = pronunciation;
        this.synonym = synonym;
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

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public List<String> getSynonym() {
        return synonym;
    }

    public void setSynonym(List<String> synonym) {
        this.synonym = synonym;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return obj == this.getWord();
//    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: synonym) {
            stringBuilder.append(s).append(";");
        }



        return word + MainMenu.COMA +
                adjective + MainMenu.COMA +
                noun + MainMenu.COMA +
                verb + MainMenu.COMA +
                pronunciation + MainMenu.COMA +
                stringBuilder;

    }

    public String showInfor() {
        return "Dictionary{" +
                "word='" + word + '\'' +
                ", adjective='" + adjective + '\'' +
                ", noun='" + noun + '\'' +
                ", verb='" + verb + '\'' +
                ", pronunciation='" + pronunciation + '\'' +
                ", synonym=" + synonym +
                '}';
    }
}
