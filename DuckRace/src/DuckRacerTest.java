import com.duckrace.DuckRacer;
import com.duckrace.Reward;

import java.util.Collection;

public class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer1 = new DuckRacer(1, "Amir");

        racer1.win(Reward.DEBIT_CARD);
        racer1.win(Reward.DEBIT_CARD);
        racer1.win(Reward.PRIZES);
        racer1.win(Reward.DEBIT_CARD);

        System.out.println(racer1);  // toString() auto called

        Collection<Reward> rewards = racer1.getRewards(); // read-only view of the underlying collection, 'rewards'
        System.out.println(rewards);

        racer1.win(Reward.PRIZES); // 'rewards' now has 5 in it
        System.out.println(rewards); // reads through to 'rewards', so shows 5 now
    }
}
