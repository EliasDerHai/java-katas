package tictactoechecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacToeCheckerTest {

    @Test
    void notFinished() {
        assertEquals(TicTacToeState.IN_PROGRESS, TicTacToeChecker.checkGameState(new int[][] {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        }), "[0, 0, 1]\n[0, 1, 2]\n[2, 1, 0]");
    }
    @Test
    void winner1() {
        assertEquals(TicTacToeState.PLAYER_1_WON, TicTacToeChecker.checkGameState(new int[][] {
                {1, 1, 1},
                {0, 2, 2},
                {0, 0, 0}
        }), "[1, 1, 1]\n[0, 2, 2]\n[0, 0, 0]");

        assertEquals(TicTacToeState.PLAYER_1_WON, TicTacToeChecker.checkGameState(new int[][] {
                {1, 2, 0},
                {0, 1, 2},
                {0, 0, 1}
        }), "[1, 2, 0]\n[0, 1, 2]\n[0, 0, 1]");

    }
    @Test
    void winner2() {
        assertEquals(TicTacToeState.PLAYER_2_WON, TicTacToeChecker.checkGameState(new int[][] {
                {1, 1, 2},
                {0, 2, 0},
                {2, 1, 1}
        }), "[1, 1, 2]\n[0, 2, 0]\n[2, 1, 1]");

        assertEquals(TicTacToeState.PLAYER_2_WON, TicTacToeChecker.checkGameState(new int[][] {
                {2, 1, 0},
                {2, 0, 0},
                {2, 1, 1}
        }), "[2, 1, 0]\n[2, 0, 0]\n[2, 1, 1]");
    }
    @Test
    void draw() {
        assertEquals(TicTacToeState.DRAW, TicTacToeChecker.checkGameState(new int[][] {
                {1, 2, 1},
                {1, 1, 2},
                {2, 1, 2}
        }), "[1, 2, 1]\n[1, 1, 2]\n[2, 1, 2]");

        assertEquals(TicTacToeState.DRAW, TicTacToeChecker.checkGameState(new int[][] {
                {1, 2, 1},
                {2, 1, 1},
                {2, 1, 2}
        }), "[1, 2, 1]\n[2, 1, 1]\n[2, 1, 2]");
    }

}