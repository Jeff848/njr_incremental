package dbathon.nurikabe;

import java.util.Arrays;
import java.util.Locale;

import dbathon.nurikabe.board.Board;
import dbathon.nurikabe.board.BoardState;
import dbathon.nurikabe.board.BoardUtil;
import dbathon.nurikabe.solver.Solver;
import dbathon.nurikabe.solver.SolverEvents;
import dbathon.nurikabe.solver.SolverStrategy;
import dbathon.nurikabe.solver.strategy.AllValidIslandsStrategy;
import dbathon.nurikabe.solver.strategy.BlackConnectStrategy;
import dbathon.nurikabe.solver.strategy.ExpandStrategy;
import dbathon.nurikabe.solver.strategy.NoBlackBlockStrategy;
import dbathon.nurikabe.solver.strategy.TwoAndBlackStrategy;

public class Main {

  public static final String[] BOARDS_9x9 = {
      "..2.......5...............1.....5.3...........2.5.....3...............1.......3..",
      "............6....7.......6....6...................2....1.......2....2............",
      "....6...3............4.............4.5.....5.2.............2............5...1....",
      ".........6.................2...1.4.............5.8...1.................3.........",
      ".............4..1..9.........3.......2.....2.......1.........2..5..6.............",
      ".................8......3..5......4...........4......5..3......8.................",
      "..............4.......3.3.3.........9.......3.........2.3.4.......7..............",
// $ curl -s http://www.logicgamesonline.com/nurikabe/archive.php?pid=220[1-9] | grep "var puzzle ="
      "......3..3............3......8......4.......1......3......4............2..1......",
      "..2.......5...............1.....5.3...........2.5.....3...............1.......3..",
      ".............2...7...........4....1...........4....2...........3...4.............",
      ".........4..................4.6....3.........1....2.4..................8.........",
      ".............4..1..9.........3.......2.....2.......1.........2..5..6.............",
      ".........6...2.2............6.......2.......6.......2............2.1...4.........",
      ".....2.5..............3....3..........4...4..........3....5..............2.2.....",
      "....6...3............4.............4.5.....5.2.............2............5...1....",
      ".......1..2........................7.5..1..3.5........................4..3.......",
// $ curl -s http://www.logicgamesonline.com/nurikabe/archive.php?pid=21[10-99] | grep "var puzzle ="
      "..............4..6.6.............5...3.....3...3.............1.3..6..............",
      "...................2..4...3......1......7......1......4...5..5...................",
      ".......1.......4.........6......4...............5......6.........2.......1.......",
      "..........7.......1..........3.......1.....5.......4..........1.......8..........",
      ".8....5.......1.............1.......................9.............3.......1....3.",
      "..5..6.2..4...........................................................3..3.4..5..",
      "...1....1.....5..........5......1...............2......6..........5.....3....3...",
      ".........6.................3..3..2.............1..7..6.................4.........",
      "...3............8....3....3...........................4....3....3............6...",
      ".3..6......2..........1...2...........................4...5..........4......6..6.",
      ".......4......6..........5.............2.5.............3..........7......2.......",
      ".2.........1.......3......8......3.............1......4......8.......3.........2.",
      "......6.........5...2.3.............4.......4.............6.1...4.........1......",
      "...5.......6.............1..3.......................5..3.............6.......4...",
      ".........1...............7......1..3.........5..3......8...............3.........",
      ".....1.....3..............3...5...3...........5...1...5..............4.....1.....",
      ".........3.............1.....6.......1.....5.......6.....4.............7.........",
      "..1............7............5...1...............1...1............5............6..",
      "2......4......2....................7...2.6...5....................2......4......3",
      "........1................2.8.4..1...............2..7.5.1................1........",
      "7...........................2...7...5.......7...1...2...........................4",
      "..3....6..1..........1..........3...............5..........3..........1..4....4..",
      ".2.7..........4.........2..8.........................1..8.........1..........2.3.",
      ".........2......................6.3.9.......3.3.3......................1.........",
      ".3...............7.......5...........1.5.2.6...........1.......1...............2.",
      "...2...........4.......5...7..........1...4..........1...3.......2...........3...",
      "....3....4............3....8....5...............5....1....1............5....1....",
      "..............5..7......4.....1...................4.....8......1..4..............",
      "........6.2.....................3.2.5.......3.4.1.....................4.1........",
      "................8.1.2.......3.......................5.......4.3.7................",
      "....5................2.......5.4.................6.4.......2................2....",
      ".1.......................4..5.......2.6...3.1.......2..3.......................5.",
      "...4.........2.......5.....6.........................1.....8.......2.........4...",
      "...........2......2.........7...1...............9...3.........2......4...........",
      ".3.................2.......3...5.................3...5.......6.................9.",
      "...............3.......4....3..........1.2..........6....6.......4...............",
      "........37.........................7.3.....4.7.........................44........",
      "........2.5..............4..2....3.............2....5..4..............1.7........",
      ".......5............2.2.....6...5...............1...8.....3.1............3.......",
      "....4.....1...3..4.............................................6..4...5.....3....",
      ".............4...4.......5...........2..3..2...........3.......1...7.............",
      ".3..2.........4................4.................5................3.........8..4.",
      "........24...5.....5.2.....................................3.3.....8...31........",
      ".....6..9.1....1..............1...................1..............1....4.9..1.....",
      ".......2..5..................3..3...............2..2..................5..4.......",
      "...........1.....7.......2...3.......7.....1.......3...7.......1.....3...........",
      "........1...................3....4.4.........3.9....4...................6........",
      "........8............8.......5.1.................5.2.......3............1........",
      "....4.......3..........4.......2...7.........7...1.......2..........2.......5....",
      ".5.........7..3.......2...................................2.......3..6.........7.",
      ".........4..7..............6....1...............3....6..............2..1.........",
      "2..3.......2....6...........3.......................2...........5....5.......3..2",
      "....2...........2...3...........5...............4...........5...1...........7....",
      ".........................6.4....5....4.....3....7....1.3.........................",
      "..........1...............7.....5.4...........1.1.....3...............7..........",
      "2...............5.2...........2...2...........2...3...........7.2...............1",
      "..........4.....................1..3.2.....5.4..9.....................5..........",
      "..4......1......6...............6.....3...2.....3...............4......1......2..",
      "7.....1....4....5...............................................6....3....4.....4",
      "...........4.3...2............1...................2............2...6.6...........",
      ".........3..2..5.........1....2...................3....2.........8..5..4.........",
      "..............5..........5....2....7.........3....4....2..........2..............",
      ".................45.............1..3..3...3..3..7.............21.................",
      "........6........................2...6.7.3.6...4........................1........",
      ".............1...1.........3....4.1...........8.4....3.........4...3.............",
      "...6..........3...............6....2.1.....3.3....5...............2..........1...",
      "......4.....3...3..............3.................4..............6...3.....5......",
      ".9.5..........6................2.................5................2..........1.3.",
      "....5..2.............1..2.........2...........4.........6..3.............3..4....",
      "...7..1.1.4...5...................................................1...3.4.1..5...",
      ".......2...5................2.3...................5.3................5...2.......",
      "..............4.......3.3.3.........9.......3.........2.3.4.......7..............",
      "....6...........1............5..3...............4..4............2...........2....",
      ".........3...2.5.......5.................................2.......7.5...1.........",
      "......6.........6..........2..........3...5..........5..........6.........4......",
      ".....8...7......2..4.........................................3..6......1...1.....",
      "2.3.............2...3.1...................................5.5...1.............4.8",
      "...............5.....4....3.......5...........3.......4....2.....5...............",
      ".....3....5.2.................1...................3.................4.7....6.....",
      "........1...3...........4....2....1...........2....4....8...........2...4........",
      ".8.1..................3...............6...5...............1..................5.4.",
      ".....2......4..5.4............1...................2............4.4..6......1.....",
      ".......8....6..5......5...................................1......3..8....1.......",
      ".......4...............3....3..........4.2..........3....4...............4.......",
      "....4....1......3....4.........5.................4.........2....2......2....4....",
      "..1...............3......5..3...4...............1...2..4......3...............4..",
      ".1.....................4.2..2..3.................7..3..3.1.....................2.",
      "..........4......75.....5....2.....................2....4.....13......2..........",
      "1.5..........4................5...................7................2..........3.5",
      "............6....7.......6....6...................2....1.......2....2............",
      // random daily ones
      "..6..1.4..1........................2.........4........................6..4.5..3..",
      "......2.2....4.................1.................6.................6....7.6......",
      ".....7...3..3...4...............................................4...2..2...4.....",
      "1.1......................9.....1.3.............3.1.....2......................5.6",
      "...2............8..5....1............3.....4............1....4..7............3...",
      "..........5......2......4.....2....5.........2....2.....1......7......2..........",
      "...2.....4....7.8..............2.................2..............4.3....2.....2...",
      ".................31.....7.........7...........1.........7.....37.................",
      "....6.4.12............6...................................1............26.5.6....",
      "..........1...7..28.............3...............2.............34..3...1..........",
      "......1.4...5...........1.............1...1.............7...........5...8.1......",
      "...3.........4.............2...2..1...........4..9...3.............3.........3...",
      ".......3.....4..................5..4.........3..6..................4.....1.......",
      "......5...5.......3...............2...........1...............6.......7...3......",
      ".....6.....2.7..........7...............................2..........1.5.....3.....",
      ".............5.....2.........7..6...............5..3.........2.....2.............",
      "..3......3...........2.................3.2.................5...........9......6..",
      "..5....4..................1...2.....7.......2.....3...5..................5....3..",
      "..1..............2.8.............5...2.....1...3.............2.5..............2..",
      ".....4.........5..........8...........5...5...........4..........4.........1.....",
      "....5...........5.....5................3.2................4.....2...........5....",
      "..2.........7....4.....3.................................6.....7....3.........4..",
      "..................6.1.3..2....3...................5....3..1.8.4..................",
      "...........1....7..........3......2...8...4...3......4..........3....2...........",
      "..2.....8...3...........1......1.................2......7...........6...3.....2..",
      "..8.4....3................4.........4.......1.........3................3....6.4..",
      "......7.8...............3..............4.3..............7...............4.3......",
      "..4..3.................2.7.......2.............6.......5.4.................5..4..",
      "...2..........2......3..........4...............8..........8......3..........3...",
      ".................5.4...............6...4.4...2...............7.1.................",
      "...3....3.4.............2...2.......................4...1.............8.6....1...",
      "....3............1.......4..4..........1.4..........2..6.......3............8....",
      ".........3.....4.........9.......6.............1.......5.........7.....2.........",
      ".2..............1.8...............3...2...3...3...............5.4..............4.",
      "........45..........6....5.............3.6.............2....2..........41........",
      "..........3......5.......5..4..1.................1..5..4.......1......4..........",
      "........43.........5......6...........4...1...........6......3.........16........",
      ".4..3............2....2...............1...3...............5....3............4..9.",
      "7.1....................1..8..........8.....3..........1..2....................6.1",
      "..............4.6.3.....6...3.......................1...3.....5.4.3..............",
      "...4.....2.8....................4...............2....................6.7.....4...",
      "......7............2.2..3.........7...........8.........1..3.2............6......" };

  public static void main(String[] args) {
    final Board board = BoardUtil.parseStringToBoard("5:5:.... 3.  .7.... ..... 2 ..1....", true);
    System.out.println(board);
    final BoardState boardState = new BoardState(board);
    System.out.println(boardState);
    board.getCell(1, 1).setWhite();
    board.getCell(1, 0).setBlack();
    System.out.println(board);
    boardState.restoreState();
    System.out.println(board);

    final SolverStrategy[] strategies =
        { new AllValidIslandsStrategy(), new ExpandStrategy(), new NoBlackBlockStrategy(),
            new BlackConnectStrategy(), new TwoAndBlackStrategy() };

    final Solver solver = new Solver(Arrays.asList(strategies));

    final Board board2 = BoardUtil.parseStringToBoard("2:2:.1..", true);
    trySolve(solver, board2);

    final Board board3 = BoardUtil.parseStringToBoard("2:2:.4..", true);
    trySolve(solver, board3);

    trySolve(solver, board);

    for (final String boardString : BOARDS_9x9) {
      test(solver, "9:9:" + boardString);
    }
    System.out.println("success: " + successCnt + " - fail: " + failCnt);
  }

  private static void test(Solver solver, String boardString) {
    final Board board = BoardUtil.parseStringToBoard(boardString, true);
    trySolve(solver, board);
  }

  private static class LoggingEvents implements SolverEvents {

    private BoardState lastState;

    @Override
    public void onBeginSolve(Board board, Solver solver) {
      lastState = new BoardState(board);
    }

    @Override
    public void onStrategyExecuted(Board board, SolverStrategy strategy, long nanos, Solver solver) {
      final BoardState newState = new BoardState(board);
      final boolean improved = !newState.equals(lastState);
      System.out.println((improved ? "+ " : "- ")
          + String.format(Locale.ROOT, "%7.2f ", (nanos / 1000000d))
          + strategy.getClass().getSimpleName());
      lastState = newState;
    }

  }

  private static int successCnt = 0, failCnt = 0;

  private static void trySolve(Solver solver, Board board) {
    System.out.println("-------------------------------------------------");
    System.out.println(board);
    final boolean success =
        solver.tryToSolve(board, Arrays.<SolverEvents>asList(new LoggingEvents()));
    if (success) {
      successCnt++;
    }
    else {
      failCnt++;
    }
    System.out.println("try solve: " + success);
    System.out.println(board);
  }

}
