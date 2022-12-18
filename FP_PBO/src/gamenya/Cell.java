package gamenya;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Cell extends StackPane {

    private static final int CELL_SIZE = 100;

    public int x;
    public int y;

    private boolean isFlipped = false;

    private Rectangle bg;
    private Text symbol;

    Cell(int x, int y) {
        this.x = x;
        this.y = y;

        setTranslateX(x * CELL_SIZE);
        setTranslateY(y * CELL_SIZE);

        bg = new Rectangle(CELL_SIZE, CELL_SIZE, Color.rgb(243, 255, 159));
        bg.setStroke(Color.WHITE);

        symbol = new Text("0");
        symbol.setFont(Font.font(30));

        getChildren().addAll(bg, symbol);
    }

    void flip() {
        isFlipped = !isFlipped;

        bg.setFill(isFlipped ? Color.rgb(176, 229, 255) : Color.rgb(243, 255, 159));
        symbol.setText(isFlipped ? "1" : "0");
    }
}
