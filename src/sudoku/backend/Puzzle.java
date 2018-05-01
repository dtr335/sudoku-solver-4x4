package sudoku.backend;

/**
 * Provides a backend interface for creating and solving a 4x4 Sudoku puzzle.
 */
public class Puzzle {

    private Grid grid;

    /**
     * Creates an empty 4x4 Sudoku game board
     */
    public Puzzle() {
        grid = new Grid();
    }

    /**
     * Allows the frontend to set user-filled preset cells, before solving the puzzle.
     * @param position cell's position on the board, from 0 to 15
     * @param value cell's value, from 0 to 4
     * @return false if position or value are invalid, true otherwise
     */
    public boolean setPresetCell(int position, int value) {
        if (position < 0 || position > grid.PUZZLE_SIZE-1
                || value < 0 || value > grid.MAX_DIGIT) {
            return false;
        }
        grid.setCell(position, value);
        return true;
    }

    /**
     * Attempt to solve the puzzle.
     * @return true if a solution was found, false if the puzzle is unsolvable
     */
    public boolean solve() {
        return grid.solve();
    }

    /**
     * Allows the frontend to view the cell's current value. Useful after the puzzle has been solved, for displaying to user.
     * @param position position of cell on board
     * @return value at given position
     */
    public int getCellValue(int position) {
        return grid.getCellValue(position);
    }

}