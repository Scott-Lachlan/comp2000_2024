import java.util.List;
import java.util.Random;

public class RandomStrategy implements MoveStrategy {
    
    Random random;

    @Override
    public Cell move(List<Cell> possibleLocs){
        if (possibleLocs.isEmpty()) {
            return null;
        }
        int index = random.nextInt(possibleLocs.size());
        return possibleLocs.get(index);
    }
}
