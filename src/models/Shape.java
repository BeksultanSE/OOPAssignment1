package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    public Shape(){
        points = new ArrayList<>();
    }

    public void addPoint(Point point){
        points.add(point);
    }
    public double getAverageSide(){
        return 0;
    }
    public double getLongestSide(){
        return 0;
    }
    private double traverseShapePoints(){
        for(int i = 0; i < points.size(); i++){

        }

        return 0;
    }

}
