package codesdope.Operator;

import org.testng.annotations.Test;

public class PracticeQuestionsonOperators {


    @Test
    public void calculateAreaAndperimeterOftheRectangle(){

        int length = 5;
        int breadth = 7;

        int area = length * breadth;

        int perimeter = (2*(length*breadth));

        System.out.println("Area is = " +area+ "\nPerimiter = " +perimeter);


    }
}
