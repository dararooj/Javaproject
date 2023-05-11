package BasicPrograms;

public class ArmStrong {
    int armstrong(){
        System.out.println("///////////////////////////");
        int no=153;
        int temp=no;
        int leng=0;
        int rem=0;
        int mul=1;
        int numb=0;
        while ( temp!=0) {
            temp = temp / 10;
            leng = leng + 1;
        }
            while(temp!=0){
                rem=temp % 10;
                for (int i=0;i<leng;i++) {
                    mul = mul * rem;
                }
                  numb=numb+mul;
                temp=temp / 10;
                }

            if (numb == no) {
                System.out.println(no + " is armstrong");
            } else {
                System.out.println(no + " is not armstrong");
            }
return 0;
    }
}
