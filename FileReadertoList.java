package ur11;

import java.io.*;
import java.util.ArrayList;

public class FileReadertoList {
    int n;
    FileReadertoList(int a){
        n=a;
    }
    ArrayList<Integer> read(){
        ArrayList<Integer> arrayList=new ArrayList<>();

        try {
            File file=new File("src\\ur11\\Resourses\\inputData.txt");
            FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            for (int i = 0; i < n; i++) {
                arrayList.add(Integer.parseInt(bufferedReader.readLine()));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
