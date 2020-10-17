package ur11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileCreator fileCreator=new FileCreator(10000,10000);
        fileCreator.create();
        FileReadertoList fileReadertoList=new FileReadertoList(10000);
        ArrayList<Integer>arrayList=fileReadertoList.read();
        Calc calc= new Calc();
        calc.mO(arrayList);
        calc.bO(arrayList);
        calc.nll(arrayList);
        calc.naim(arrayList);
        calc.naib(arrayList);
    }
}
