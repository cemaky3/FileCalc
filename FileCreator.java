package ur11;

import java.io.*;
import java.util.Random;

public class FileCreator {
     int n;
     int max;

    FileCreator(int a,int b){
     n=a;
     max=b;
    }
    void create(){
        File file=new File("src\\ur11\\Resourses\\inputData.txt");
        try {
            FileWriter writer=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            Random random=new Random();

            for (int i = 0; i <n ; i++) {
                bufferedWriter.write(String.valueOf(random.nextInt(10000)-max/2));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
