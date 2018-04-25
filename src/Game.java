import java.awt.*;

/**
 * Game object for tetris
 */
public class Game {

    private int fieldWidth;
    private int fieldHeight;
    private Block field[][];

    public Game() {
        fieldWidth = 10;
        fieldHeight = 20;
        field = new Block[fieldWidth][fieldHeight];
        createField();
    }

    public Game(int height, int width) {
        fieldWidth = width;
        fieldHeight = height;
        field = new Block[fieldWidth][fieldHeight];
        createField();
    }

//    private void createWalls() {
//        for (int i = 0; i < fieldWidth + 2; i++)
//            for (int j = 0; j < fieldHeight + 2; j++)
//                if (i == 0 || i == (fieldWidth + 1) || j == 0 || j == fieldHeight + 1)
//                    field[i][j] = new Block("wall", Color.gray);
//    }

    private void createField() {
        for (int i = 0; i < fieldWidth; i++)
            for (int j = 0; j < fieldHeight; j++)
                field[i][j] = new Block("empty", Color.black);
    }
}
