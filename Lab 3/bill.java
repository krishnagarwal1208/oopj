public class bill {
    public static void main(String args[]) {
        double unit,bill;
        unit=300;
        if(unit<=50) {
            bill=unit*50.0;
        }
        else if(unit<=150) {
            bill=50*0.5+(unit-50)*0.75;
        }
        else if(unit<=250){
            bill = 50*0.5+100*0.75+(unit-150)*1.2;
        }
        else {
            bill = 50*0.5+100*0.75+100*1.20+(unit-250)*1.50;
        }

        bill=bill+(bill*0.2);
        System.out.println("bill="+bill);
    }
}
