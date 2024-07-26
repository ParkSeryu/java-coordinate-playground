package coordinate.controller;

import coordinate.model.Line;
import coordinate.view.InputView;
import java.util.ArrayList;

public class CoordinateCalculator {
    public void run() {
        try {
            String inputString = InputView.guide();
            Line line = new Line(new ArrayList<>());
            line.create(inputString);
        }catch(IllegalArgumentException e){
            InputView.reVibe();
            this.run();
        }

    }
}
