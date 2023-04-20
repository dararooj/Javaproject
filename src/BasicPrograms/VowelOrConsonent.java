package BasicPrograms;

public class VowelOrConsonent {
    void vowelorconsonent(String ch){
        if(ch.equalsIgnoreCase("a")|| ch.equalsIgnoreCase("e") ||
                ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("u") ||
                ch.equalsIgnoreCase("u")){
            System.out.println(ch + "is a vowel");
        }
        else{
            System.out.println(ch + "is a consonant");
        }
    }
}
