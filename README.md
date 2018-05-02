# sudoku-solver-4x4
A console-based java program to solve a 4x4 sudoku puzzle using a simple brute force method.

Download the runnable jar file [here](https://github.com/dtr335/sudoku-solver-4x4/raw/master/jar/sudoku-solver-4x4.jar).

Example run:
```
===============================================
Welcome to Sudoku Solver.
Using brute force to solve a 4x4 Sudoku puzzle.
===============================================

To set up the puzzle:
* Choose a cell to modify. Locations range from 0-15, according to the following key:
+-------+-------+
|  0  1 |  2  3 | 
|  4  5 |  6  7 | 
+-------+-------+
|  8  9 | 10 11 | 
| 12 13 | 14 15 | 
+-------+-------+
* Choose a value for the cell. Values range from 1-4. Alternatively, entering a 0 resets a cell, erasing its current value.

To solve the puzzle, press ENTER at any time.

Enter a cell to modify (0-15): 5
Enter a value (0-4): 4

Updated Puzzle:
+-----+-----+
| 0 0 | 0 0 | 
| 0 4 | 0 0 | 
+-----+-----+
| 0 0 | 0 0 | 
| 0 0 | 0 0 | 
+-----+-----+

Key:
+-------+-------+
|  0  1 |  2  3 | 
|  4  5 |  6  7 | 
+-------+-------+
|  8  9 | 10 11 | 
| 12 13 | 14 15 | 
+-------+-------+

Enter a cell to modify (0-15): 8
Enter a value (0-4): 4

Updated Puzzle:
+-----+-----+
| 0 0 | 0 0 | 
| 0 4 | 0 0 | 
+-----+-----+
| 4 0 | 0 0 | 
| 0 0 | 0 0 | 
+-----+-----+

Key:
+-------+-------+
|  0  1 |  2  3 | 
|  4  5 |  6  7 | 
+-------+-------+
|  8  9 | 10 11 | 
| 12 13 | 14 15 | 
+-------+-------+

Enter a cell to modify (0-15): 15
Enter a value (0-4): 1

Updated Puzzle:
+-----+-----+
| 0 0 | 0 0 | 
| 0 4 | 0 0 | 
+-----+-----+
| 4 0 | 0 0 | 
| 0 0 | 0 1 | 
+-----+-----+

Key:
+-------+-------+
|  0  1 |  2  3 | 
|  4  5 |  6  7 | 
+-------+-------+
|  8  9 | 10 11 | 
| 12 13 | 14 15 | 
+-------+-------+

Enter a cell to modify (0-15): 

The puzzle has been solved! Here is a solution:
+-----+-----+
| 1 2 | 3 4 | 
| 3 4 | 1 2 | 
+-----+-----+
| 4 1 | 2 3 | 
| 2 3 | 4 1 | 
+-----+-----+
```
