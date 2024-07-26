package coordinate.controller;

import coordinate.model.Figure;
import coordinate.model.FigureFactory;
import coordinate.model.Line;
import coordinate.view.InputView;
import java.util.ArrayList;

public class CoordinateCalculator {
    public void run() {
        try {
            String[] input = manufactorString(InputView.guide());
            Figure figure = FigureFactory.matchFigure(input.length);
            figure.create(input);
            OutputView.printResult(figure.calculate());
        } catch (IllegalArgumentException e) {
            InputView.reVibe();
            this.run();
        }

    }

    private String[] manufactorString(String inputString) {
        String cleanedInput = inputString.replaceAll("[()]", "");
        return cleanedInput.split("-");
    }
}
