package  Feb15HandsOn.Ques2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String file = "/Users/mayanksparsh/Desktop/NewFile.txt";
        File myObj = new File(file);
        myObj.createNewFile();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String curLine;
        while ((curLine = bufferedReader.readLine()) != null) {
            System.out.println(curLine);
        }
        bufferedReader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(myObj));
        writer.write("This is my text");
        writer.close();

    }

}
