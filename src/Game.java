import java.awt.*;

/**
 * Game object for tetris
 */
public class Game {

    private int fieldWidth = 10;
    private int fieldHeight = 20;
    private Block field[][];

    public Game() {
        field = new Block[fieldWidth + 2][fieldHeight + 2];
        createArea();
        createWalls();


    }

    private void createWalls() {
        for (int i = 0; i < fieldWidth + 2; i++)
            for (int j = 0; j < fieldHeight + 2; j++)
                if (i == 0 || i == (fieldWidth + 1) || j == 0 || j == fieldHeight + 1)
                    field[i][j] = new Block("wall", Color.gray);
    }

    private void createArea() {
        for (int i = 1; i <= fieldWidth; i++)
            for (int j = 1; j <= fieldHeight; j++)
                field[i][j] = new Block("empty", Color.black);
    }
}
