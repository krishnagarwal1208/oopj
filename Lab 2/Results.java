class Rectangle {
    int len, br;
    
    void arrec() {
        System.out.println("Area of Rectangle = "+(len*br));
    }

    void perrec() {
        System.out.println("Perimeter of Rectangle = "+(2*(len+br)));
    }
}

class Square {
    int side;

    void arsq() {
        System.out.println("Area of square = "+(side*side));
    }

    void prsq() {
        System.out.println("Perimeter of square = "+(4*side));
    }
}

class Circle {
    int rad;

    void arcir() {
        System.out.println("Area of Circle = "+(3.14*rad*rad));
    }

    void prcir() {
        System.out.println("Perimeter of Circle = "+(2*3.14*rad));
    }
}
public class Results {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        r1.len = 4;
        r1.br = 27;
        r1.arrec();
        r1.perrec();

        Square s1 = new Square();
        s1.side = 28;
        s1.arsq();
        s1.prsq();

        Circle c1 = new Circle();
        c1.rad = 26;
        c1.arcir();
        c1.prcir();
    }
}
