import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        RNN rnn = new RNN(4, 1);
        double[] task3 = {0.5, 0.5, 0.6, 0.6, 0.9};

        ArrayList list3 = new ArrayList();
        for (int i=0;i<task3.length;i++){
            list3.add(task3[i]);
        }
        int count = 20000;
        while(count>0) {
            ArrayList list1 = new ArrayList();
            double sum = 0;
            for (int i=0;i<4;i++){
                double t = Math.random();
                sum+=t;
                list1.add(t);
            }
            list1.add(sum/4.0);
            //System.out.print(rnn.getV()+"\t");
            rnn.train(list1);
            count--;
        }
        rnn.getResult(list3);


    }
}
