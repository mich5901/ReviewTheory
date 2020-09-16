package Part2;

import java.text.NumberFormat;

public class PopulationGrowth {

    public static void main(String[] args) {
        /*
        Barries population in 2020 is 160000
        grows by 6% every 10 years
        How much will it be in 2120?
         */
        int pop = 160000;
        int growth;
        NumberFormat nf = NumberFormat.getNumberInstance();

        //print column headings
        System.out.format("%5s", "Year");
        System.out.format("%20s", "Population");
        System.out.format("%15s", "Growth");
        System.out.format("%20s\n", "New Population");
          
        System.out.format("%5s", "====");
        System.out.format("%20s", "==========");
        System.out.format("%15s", "======");
        System.out.format("%20s\n", "==============");
        
        for (int year = 2020; year <= 2120; year+=10) {
            System.out.format("%5s", year);
            System.out.format("%20s", nf.format(pop));
            growth = (int)(0.06 * pop); //have to cast to integer
            System.out.format("%15s", nf.format(growth));
            pop += growth;
            System.out.format("%20s\n", nf.format(pop));
            
        }
    }

}
