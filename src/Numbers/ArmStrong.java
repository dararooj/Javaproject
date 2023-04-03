package Numbers;

public class ArmStrong {
    public void armstrong() {
        int no = 1634;
        int temp = no;
        int leng = 0;
        while (temp != 0) {
            leng = leng + 1;
            temp = temp / 10;
        }
        int temp1 = no;
        int arm = 0;
        int rem;
        int mul = 1;
        while (temp1 != 0) {
            rem = temp1 % 10;
            for (int i = 0; i <= leng; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            temp1 = temp1 / 10;
        }
        if (arm == no) {
            System.out.println(no + " is armstrong");
        } else {
            System.out.println(no + " is not armstrong");
        }
    }
}
