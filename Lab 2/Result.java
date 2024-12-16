class Rectangle {
    int len,br;  
    
    void arrect() {
        int area1 =len*br;
        System.out.println("Area of rectangle = "+area1);
    }
}

class Circle {
    int rad;

    void arcir() {
        double area2 = 3.14*rad*rad;
        System.out.println("Area of circle = "+area2);
    }
}

class Result {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        r1.len = 3;
        r1.br = 4;
        r1.arrect();

        c1.rad = 9;
        c1.arcir();
    }
}