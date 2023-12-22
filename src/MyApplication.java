import models.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        // implicit casting byte > short > int > long > float > double
        File file = new File("C:\\Users\\BEKSULTAN\\IdeaProjects\\untitled\\src\\Input");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            Point p = new Point(sc.nextDouble(), sc.nextDouble());

        }

    }
}
