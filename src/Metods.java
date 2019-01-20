
public class Metods {
    boolean isRightTriangle(Triangle triangle) {
        if (Math.pow(triangle.getA (),2)== Math.pow (triangle.getC (),2) + Math.pow (triangle.getB (),2))
            return true;
        else if (Math.pow(triangle.getB (),2) == Math.pow (triangle.getA (),2) + Math.pow (triangle.getC (),2))
            return  true;
        else if (Math.pow(triangle.getC (),2) == Math.pow (triangle.getA (),2) + Math.pow (triangle.getB (),2))
            return  true;
        else
            return false;

        }

    }
