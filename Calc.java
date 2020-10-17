package ur11;

import java.util.ArrayList;

public class Calc {
    int sum(ArrayList<Integer>arrayList){
       int a=  arrayList.stream().reduce((x,y)->x+y).get();
        System.out.println(a);
       return a;
    }
    long mO (ArrayList<Integer>arrayList){
        long ret=arrayList.stream().filter((x)->x<0).count();
        System.out.println(ret);
        return ret;
    }
    long bO (ArrayList<Integer>arrayList){
        long ret=arrayList.stream().filter((x)->x>0).count();
        System.out.println(ret);
        return ret;
    }
    long nll (ArrayList<Integer>arrayList){
        long ret=arrayList.stream().filter((x)->x==0).count();
        System.out.println(ret);
        return ret;
    }
    int naim(ArrayList<Integer>arrayList){
        int m=arrayList.stream().reduce((a,b)->Math.min(a, b)).get();
        System.out.println(m);
        return m;
    }
    int naib(ArrayList<Integer>arrayList){
        int m=arrayList.stream().reduce((a,b)->Math.max(a, b)).get();
        System.out.println(m);
        return m;
    }
}
