public class Main {
    public static void main(String[] args) {

        //Declare arrays of type boolean, with true/false values
        boolean[] signal_A = {false, false, true, true};
        boolean[] signal_B = {false, true, false, true};

            //Declare variables of type boolean for the outputs
        //Output for A && B
        boolean[] output1 = new boolean[4];
        //Output for A || B
        boolean[] output2 = new boolean[4];
        //Output for !A && B
        boolean[] output3 = new boolean[4];
        //Output for !(A || B)
        boolean[] output4 = new boolean[4];
        //Output for !A || !B
        boolean[] output5 = new boolean[4];

        //Loop from i = 0 to the number of values, incrementing i by 1
        for (int i = 0; i < 4; i++) {
            //Calculate the outputs for each combination
            output1[i] = signal_A[i] && signal_B[i]; //A && B
            output2[i] = signal_A[i] || signal_B[i]; //A || B
            output3[i] = !signal_A[i] && signal_B[i]; // !A && B
            output4[i] = !(signal_A[i] || signal_B[i]); // !(A || B)
            output5[i] = !signal_A[i] || !signal_B[i]; // !A || !B
        }

        //Display the results
        System.out.println("Truth Table Results:");
        System.out.println("--------------------");
        System.out.println("A\t\tB\t\tA&&B\tA||B\t!A&&B\t!(A||B)\t!A||!B");
        for (int i = 0; i < 4; i++) {
            System.out.println(signal_A[i] + "\t" + signal_B[i] + "\t" +
                    output1[i] + "\t" + output2[i] + "\t" +
                    output3[i] + "\t" + output4[i] + "\t" +
                    output5[i]);
        }
    }
}