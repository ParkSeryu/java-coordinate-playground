package coordinate.model;

import java.util.ArrayList;

public class FigureFactory {

    public static Figure matchFigure(int length) {
        if(length == 2){
            return new Line(new ArrayList<>());
        }
        if(length == 3){
            return new Triangle(new ArrayList<>());
        }
        if(length == 4){
            return new Rectangle(new ArrayList<>());
        }
        throw new IllegalArgumentException("잘못 입력함");
    }

}
