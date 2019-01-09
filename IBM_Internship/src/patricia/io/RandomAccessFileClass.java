package patricia.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileClass {
    public static void writeToFile(RandomAccessFile raf, int i1, int i2, int i3, int i4) throws IOException {
        try{
//            raf.writeInt(i1);
//            raf.writeInt(i2);
//            raf.writeInt(i3);
//            raf.writeInt(i4);
            raf.writeUTF("1234");
            System.out.println("Succes");
        }catch (IOException e){
            throw new IOException("Cannot write the integers");
        }
    }

    public static void readFromFile(RandomAccessFile raf) throws IOException{
        try{
            String s = raf.readUTF();
        }catch (IOException e){
            throw new IOException("Cannot read");
        }
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\DaliaCaspriac\\IdeaProjects\\IBM_Internship\\src\\patricia\\io\\file.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            try {
                writeToFile(raf, 123, 3999, 1, 29);
                readFromFile(raf);
            }catch (IOException e){
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
