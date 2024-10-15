import java.util.List;

public class LeftMostMove implements MoveStrategy {
  @Override
  public Cell chooseNextLoc(List<Cell> possibleLocs) {
    Cell leftMostCell = possibleLocs.stream().min((cell1, cell2) -> cell1.leftOfComparison(cell2)).orElse(possibleLocs.get(0));
    return leftMostCell;
  }

  @Override
  public String toString() {
    return "left-most movement";
  }
}
