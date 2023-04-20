package Array;

import Numbers.ArmStrong;

public class MainClass {
    public static void main(String[] args) {
        CopyArrayElements CE=new CopyArrayElements();
        CE.copyelements();
        DuplicateElements DE=new DuplicateElements();
        DE.duplicateelements();
        ReverseElements RE=new ReverseElements();
        RE.reverseelements();
        EvenElements EE=new EvenElements();
        EE.evenelements();
        LargestElement LM=new LargestElement();
        LM.largestelement();
        SumElements SE=new SumElements();
        SE.sumelements();
        AscendingOrder AC=new AscendingOrder();
        AC.ascendingorder();
        int[] A={13,98,78,64,27};
        ThirdLargestElement TLE=new ThirdLargestElement();
        TLE.thirdlargestelement(A);
        MaxMinNumber MM=new MaxMinNumber();
        MM.maxminumber();
        MissingNumber MN=new MissingNumber();
        MN.missingnumber();
    }
}
