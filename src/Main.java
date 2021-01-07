import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try{
            inputStream = new FileInputStream(new File("F:\\file1.txt"));
            outputStream = new FileOutputStream(new File("F:\\file2.txt"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length=inputStream.read(buffer))>0){
                outputStream.write(buffer,0,length);
            }
            System.out.println("Hoàn thành");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
