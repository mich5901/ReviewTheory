package Part1;

public class BedmasAndCasting {

    public static void main(String[] args) {
        int x = 22;
        int y = x * 2;
        double z = (double) y / 7;
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
        System.out.println("Z is: " + z);

        //mod -> % = remainder of a calculation.
        //44 / 7, remainder = 2
        int leftover = 44 % 7;
        System.out.format("I have %d candy left over", leftover);
        
        //BEDMAS
        System.out.println("\n\nBEDMAS\n=====\n\n");
        int e, f, g;
        e=f=g=5; //assign all to the same value at once
        int ans;
        
        ans = e + f * g;// 30
        System.out.println("ans shouuld be 30 ->" + ans);
        ans = (e + f) * g;//50
        System.out.println("ans should be 50 ->" + ans);
        ans = e + f % g;//5
        System.out.println("ans should be 5 ->" + ans);
        ans = (e + f) % g;//0
        System.out.println("ans should be 0 ->" + ans);
    }

}
