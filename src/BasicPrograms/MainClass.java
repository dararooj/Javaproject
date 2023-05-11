package BasicPrograms;

import Year.Factorials;

public class MainClass {
    public static void main(String[] args) {
        SwapNumbersOne SW=new SwapNumbersOne();
         SW.swapnumberone();
         ArmStrong AS=new ArmStrong();
         AS.armstrong();
         SwapNumbersTwo ST=new SwapNumbersTwo();
         ST.swapnumberstwo(30,50);
         LeapYear LY=new LeapYear();
         LY.leapyear();
         EvenOddNumbers EON=new EvenOddNumbers();
         EON.evenoddnumbers(429);
         PrimeNumbers PM=new PrimeNumbers();
         PM.primenumbers();
         LargestAmongThree LAT=new LargestAmongThree();
         LAT.largestamongthree();
         PerimeterOfRectangle POR=new PerimeterOfRectangle();
         POR.perimeter(20,12);
         SimpleInterest SI=new SimpleInterest();
         SI.simpleinterest();
         Factorial F=new Factorial();
         F.factorial();
         fibonacciSeries FS=new fibonacciSeries();
         FS.fibonaicciseries();
         BinayString BS=new BinayString();
         BS.binarystring();
         MultiplyTwoFloatingNo MT=new MultiplyTwoFloatingNo();
         MT.multiply();
         Neon N=new Neon();
         N.neon(9);
         VowelOrConsonent VC=new VowelOrConsonent();
         VC.vowelorconsonent("r");
    }
}
