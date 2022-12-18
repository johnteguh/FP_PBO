package gamenya;

import java.awt.Point;
import java.util.stream.Stream;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class GameInvernya {

    private static final int GRID_SIZE_IN_CELLS = 5;
    private static final int CELL_SIZE = 100;

    private Pane root;



    public Parent createContent() {
        root = new Pane();
        root.setPrefSize(GRID_SIZE_IN_CELLS * CELL_SIZE, GRID_SIZE_IN_CELLS * CELL_SIZE);

        for (int y = 0; y < GRID_SIZE_IN_CELLS; y++) {
            for (int x = 0; x < GRID_SIZE_IN_CELLS; x++) {
                final int finalX = x;
                final int finalY = y;

                Cell cell = new Cell(x, y);

                cell.setOnMouseClicked(e -> {

                    cell.flip();

                    Stream.of(
                            new Point(finalX + 1, finalY),
                            new Point(finalX - 1, finalY),
                            new Point(finalX, finalY + 1),
                            new Point(finalX, finalY - 1)
                    )
                            .filter(p -> isValid(p))
                            .map(p -> getCell(p.x, p.y))
                            .forEach(Cell::flip);

                    // TODO: check all are flipped, if so player wins
                });

                root.getChildren().add(cell);
            }
        }

        return root;
    }

    private Cell getCell(int x, int y) {
        return root.getChildren()
                .stream()
                .map(n -> (Cell) n)
                .filter(c -> c.x == x && c.y == y)
                .findAny()
                .get();
    }

    private boolean isValid(Point p) {
        return p.x >= 0 && p.x < GRID_SIZE_IN_CELLS
                && p.y >= 0 && p.y < GRID_SIZE_IN_CELLS;
    }


}
