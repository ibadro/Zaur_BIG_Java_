package Black_Belt.IO_NIO;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) throws FileNotFoundException {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("my_test.bin"));){
outputStream.writeBoolean(true);
outputStream.writeByte(5);
outputStream.writeInt(500);
outputStream.writeLong(1_111_111_1111L);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
