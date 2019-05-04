import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream("c:/goods.csv"), "UTF-8"); // 建立一个输入流对象reader
        BufferedReader br = new BufferedReader(reader);
        String readLine = br.readLine();
        readLine = br.readLine();
        System.out.println("readLine = " + readLine);
    }
}
