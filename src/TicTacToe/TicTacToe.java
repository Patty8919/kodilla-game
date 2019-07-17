package TicTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private Image imagback = new Image("file:resources/board.jpg");
    private Image tac = new Image("file:resources/multiply.png");
    private Image toe = new Image("file:resources/circle.png");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(50,50,true,true,true,false);
        BackgroundImage backgroundImage = new BackgroundImage(imagback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BOTTOM_RIGHT);
        grid.setPadding(new Insets(11.5,12.5,13.5,14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(tac);
        cards.getChildren().add(img);

        ImageView img1 = new ImageView(toe);
        cards.getChildren().add(img1);

        grid.add(cards, 0, 0, 3, 1);

        Scene scene = new Scene(grid, 1200, 900, Color.WHITE);

        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

