package BasicPrograms;

public class BinayString {
    void binarystring(){
        String one="101010";
        String two="110010";
        int k;
        int i=Integer.parseInt(one,2);
        int j=Integer.parseInt(two,2);
        k=i+j;
        System.out.println(Integer.toBinaryString(k));
    }
}
