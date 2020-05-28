package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    public Button timer1_BTN;
    public Button timer2_BTN;
    public Button timer3_BTN;
    public Button timer4_BTN;

    public Label timer1_min_LBL;
    public Label timer2_min_LBL;
    public Label timer3_min_LBL;
    public Label timer4_min_LBL;

    public Label timer1_sec_LBL;
    public Label timer2_sec_LBL;
    public Label timer3_sec_LBL;
    public Label timer4_sec_LBL;

    public void initialize() {
        timer1_BTN.setOnAction(event -> new StopWatch(timer1_min_LBL, timer1_sec_LBL).start());
        timer2_BTN.setOnAction(event -> new StopWatch(timer2_min_LBL, timer2_sec_LBL).start());
        timer3_BTN.setOnAction(event -> new StopWatch(timer3_min_LBL, timer3_sec_LBL).start());
        timer4_BTN.setOnAction(event -> new StopWatch(timer4_min_LBL, timer4_sec_LBL).start());
    }
}