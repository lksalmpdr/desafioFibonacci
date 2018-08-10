
import java.util.ArrayList;

public class Fibonacci {

    private ArrayList<Integer> seq = new ArrayList();
    private int posicao;

    public boolean testaFibonacciAte(int limite) {
        seq.add(0);
        seq.add(1);
        seq.add(1);
        posicao = seq.size() - 1;

        while (limite > seq.get(posicao)) {
            seq.add(seq.get(posicao - 1) + seq.get(posicao));
            posicao += 1;
        }
        
        if (seq.indexOf(limite) != -1) {
            return true;
        } else {
            return false;
        }
    }
}
