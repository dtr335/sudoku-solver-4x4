# sudoku-solver-4x4

***
## See new repository [here](https://github.com/dtr335/sudoku-solver) that includes both 4x4 and 9x9 solving.
***

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
Enter a value (0-4): 3

Updated Puzzle:
+-----+-----+
| - - | - - | 
| - 3 | - - | 
+-----+-----+
| - - | - - | 
| - - | - - | 
+-----+-----+

Key:
+-------+-------+
|  0  1 |  2  3 | 
|  4  5 |  6  7 | 
+-------+-------+
|  8  9 | 10 11 | 
| 12 13 | 14 15 | 
+-------+-------+

Enter a cell to modify (0-15): 12
Enter a value (0-4): 3

Updated Puzzle:
+-----+-----+
| - - | - - | 
| - 3 | - - | 
+-----+-----+
| - - | - - | 
| 3 - | - - | 
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
| - - | - - | 
| - 3 | - - | 
+-----+-----+
| - - | - - | 
| 3 - | - 1 | 
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
| 4 3 | 1 2 | 
+-----+-----+
| 2 1 | 4 3 | 
| 3 4 | 2 1 | 
+-----+-----+
```
