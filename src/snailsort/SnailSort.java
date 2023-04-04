package snailsort;

import java.util.ArrayList;

public abstract class SnailSort {

    static int[] sort(int[][] input) {
        ArrayList<Integer> snailSorted = new ArrayList<>();

        int leftBorder = 0;
        int rightBorder = input.length - 1;
        int topBorder = 0;
        int bottomBorder = input.length - 1;

        Direction direction = Direction.RIGHT;

        while (!done(leftBorder, rightBorder, topBorder, bottomBorder)) {
            switch (direction) {

                case RIGHT:
                    for (int i = leftBorder; i <= rightBorder; i++) {
                        snailSorted.add(input[topBorder][i]);
                    }
                    topBorder++;
                    break;

                case DOWN:
                    for (int i = topBorder; i <= bottomBorder; i++) {
                        snailSorted.add(input[i][rightBorder]);
                    }
                    rightBorder--;
                    break;

                case LEFT:
                    for (int i = rightBorder; i >= leftBorder; i--) {
                        snailSorted.add(input[bottomBorder][i]);
                    }
                    bottomBorder--;
                    break;

                case UP:
                    for (int i = bottomBorder; i >= topBorder; i--) {
                        snailSorted.add(input[i][leftBorder]);
                    }
                    leftBorder++;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + direction);
            }
            direction = getNextDirection(direction);
        }

        return snailSorted.stream().mapToInt(Integer::intValue).toArray();

    }

    private static boolean done(int leftBorder, int rightBorder, int topBorder, int bottomBorder) {
        return leftBorder > rightBorder && topBorder > bottomBorder;
    }

    private static Direction getNextDirection(Direction direction) {
        switch (direction) {
            case RIGHT:
                return Direction.DOWN;
            case DOWN:
                return Direction.LEFT;
            case LEFT:
                return Direction.UP;
            case UP:
                return Direction.RIGHT;
            default:
                throw new IllegalStateException();
        }
    }
}
