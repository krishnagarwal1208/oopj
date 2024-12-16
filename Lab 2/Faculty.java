public class Faculty {
    int empid;
    String name;
    
    void getdetails(int id, String n) {
        empid = id;
        name = n;
    }

    void showdetails() {
        System.out.println("Employee Id: "+empid+", Name: "+name);
    }

    public static void main(String args[]) {
        Faculty f1 = new Faculty();
        Faculty f2 = new Faculty();
        f1.getdetails(2727,"Krishna");
        f2.getdetails(2628,"Asha");
        f1.showdetails();
        f2.showdetails();
    }
       
}

