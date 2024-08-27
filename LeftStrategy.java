import java.util.List;

public class LeftStrategy implements MoveStrategy{
    
    @Override
    public Cell move(List<Cell> possibleLocs) {
        if (possibleLocs.isEmpty()) {
            return null;
        }
        Cell leftMost = possibleLocs.get(0);
        for (Cell cell : possibleLocs) {
            if (cell.getX() < leftMost.getX()) {
                leftMost = cell;
            }
        }
        return leftMost;
    }
 }

