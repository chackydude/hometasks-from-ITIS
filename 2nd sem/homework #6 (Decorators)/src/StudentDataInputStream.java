import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class StudentDataInputStream extends InputStream {

    Student student;
    private DataInputStream in;

    public StudentDataInputStream(InputStream in) throws IOException{
        this.in = new DataInputStream(in);
    }

    // читаем студента с файла
    public Student readStudent() {
        try {
            String name = in.readUTF();
            char gender = in.readChar();
            int date = in.readInt();
            int group = in.readInt();
            this.student = new Student(name, gender, date, group);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return student;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    // делегировали методы от DataInputStream
    public void readFully(byte[] b) throws IOException {
        in.readFully(b);
    }

    public void readFully(byte[] b, int off, int len) throws IOException {
        in.readFully(b, off, len);
    }

    public int skipBytes(int n) throws IOException {
        return in.skipBytes(n);
    }

    public boolean readBoolean() throws IOException {
        return in.readBoolean();
    }

    public byte readByte() throws IOException {
        return in.readByte();
    }

    public int readUnsignedByte() throws IOException {
        return in.readUnsignedByte();
    }

    public short readShort() throws IOException {
        return in.readShort();
    }

    public int readUnsignedShort() throws IOException {
        return in.readUnsignedShort();
    }

    public char readChar() throws IOException {
        return in.readChar();
    }

    public int readInt() throws IOException {
        return in.readInt();
    }

    public long readLong() throws IOException {
        return in.readLong();
    }

    public float readFloat() throws IOException {
        return in.readFloat();
    }

    public double readDouble() throws IOException {
        return in.readDouble();
    }

    @Deprecated
    public String readLine() throws IOException {
        return in.readLine();
    }

    public String readUTF() throws IOException {
        return in.readUTF();
    }

    public static String readUTF(DataInput in) throws IOException {
        return DataInputStream.readUTF(in);
    }
}
