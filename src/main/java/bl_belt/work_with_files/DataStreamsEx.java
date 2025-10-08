package bl_belt.work_with_files;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("my_test.bin"));
            DataInputStream dis = new DataInputStream(new FileInputStream("my_test.bin"))){
            dos.writeBoolean(true);
            dos.writeByte(5);
            dos.writeShort(120);
            dos.writeInt(500);
            dos.writeLong(1_000_000L);
            dos.writeFloat(3.14F);
            dos.writeDouble(123.456);

            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readShort());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readFloat());
            System.out.println(dis.readDouble());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

