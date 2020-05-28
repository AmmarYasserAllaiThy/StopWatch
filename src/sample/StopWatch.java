package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class StopWatch {

    private final Timeline timeline;
    private int seconds = 0;

    public StopWatch(Label minLBL, Label secLBL) {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            seconds++;
            minLBL.setText(fix(seconds / 60));
            secLBL.setText(fix(seconds % 60));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    public void start() {
        timeline.play();
    }

    private String fix(int t) {
        return t / 10 == 0 ? "0" + t : String.valueOf(t);
    }
}