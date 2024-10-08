import java.util.Iterator;

public class CellIterator implements Iterator<Cell> {
<<<<<<< Updated upstream
  Cell[][] data;
  int outer;
  int inner;
  boolean runOut;

  public CellIterator(Cell[][] inData) {
    data = inData;
    outer = 0;
    inner = 0;
    runOut = false;
  }

  @Override
  public boolean hasNext() {
    return !runOut;
  }

  @Override
  public Cell next() {
    Cell ret = data[outer][inner];
    inner++;
    if(inner >= data[outer].length) {
      inner = 0;
      outer++;
      if(outer >= data.length) {
        runOut = true;
      }
    }
    return ret;
  }
=======
    private final Cell[][] cells;
    private int row = 0;
    private int col = 0;

    public CellIterator(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public boolean hasNext() {
        return row < cells.length && col < cells[row].length;
    }

    @Override
    public Cell next() {
        Cell cell = cells[row][col];
        col++;
        if (col == cells[row].length) {
            col = 0;
            row++;
        }
        return cell;
    }
>>>>>>> Stashed changes
}
