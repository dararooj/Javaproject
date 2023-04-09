package String;

public class NumberOfCharacters {
    void numberofcharacters(){
        String line="My name is arooj";
        int count=0;
        for (int i=0;i<line.length();i++){
            if(line.charAt(i) != ' ')
                count++;
        }
        System.out.println("no of characters is "+count);
    }
}
