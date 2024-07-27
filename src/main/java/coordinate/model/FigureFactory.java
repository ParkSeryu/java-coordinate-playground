package coordinate.model;

import java.util.ArrayList;

public class FigureFactory {

    public static final String LINE_FIGURE_NAME = "두 점 사이의 거리는 ";
    public static final String FIGURE_TRIANGLE_NAME = "삼각형의 넓이는 ";
    public static final String FIGURE_RECTANGLE_NAME = "사각형 넓이는 ";
    public static String figureName;

    public static Figure matchFigure(int length) {
        if(length == 2){
            figureName = LINE_FIGURE_NAME;
            return new Line(new ArrayList<>());
        }
        if(length == 3){
            figureName = FIGURE_TRIANGLE_NAME;
            return new Triangle(new ArrayList<>());
        }
        if(length == 4){
            figureName = FIGURE_RECTANGLE_NAME;
            return new Rectangle(new ArrayList<>());
        }
        throw new IllegalArgumentException("잘못 입력함");
    }

}
