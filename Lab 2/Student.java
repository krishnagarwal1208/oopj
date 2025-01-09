public class Student {
    int roll;
    int m1,m2,m3,m4,m5;

    void fullmark() {
        int full = m1+m2+m3+m4+m5;
        System.out.println("roll no. = "+roll);
        System.out.println("Full Marks = "+full);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.roll=2727;
        s1.m1=60;
        s1.m2=70;
        s1.m3=80;
        s1.m4=90;
        s1.m5=100;

        s1.fullmark();
    }
    
}
