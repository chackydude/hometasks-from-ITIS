import java.io.*;

public class StudentObjectInputStream {

    Student student;
    private ObjectInputStream in;

    public StudentObjectInputStream(DataInputStream in) throws IOException {
        this.in = new ObjectInputStream(in);
    }

    // читаем студента с файла
    public Student readStudent() {
        try {
            student = (Student) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return student;
    }

    // делигировали методы от DataInputStream
    public Object readObject() throws IOException, ClassNotFoundException {
        return in.readObject();
    }

    public Object readUnshared() throws IOException, ClassNotFoundException {
        return in.readUnshared();
    }

    public void defaultReadObject() throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    public ObjectInputStream.GetField readFields() throws IOException, ClassNotFoundException {
        return in.readFields();
    }

    public void registerValidation(ObjectInputValidation obj, int prio) throws NotActiveException, InvalidObjectException {
        in.registerValidation(obj, prio);
    }

    public int read() throws IOException {
        return in.read();
    }

    public int read(byte[] buf, int off, int len) throws IOException {
        return in.read(buf, off, len);
    }

    public int available() throws IOException {
        return in.available();
    }

    public void close() throws IOException {
        in.close();
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

    public char readChar() throws IOException {
        return in.readChar();
    }

    public short readShort() throws IOException {
        return in.readShort();
    }

    public int readUnsignedShort() throws IOException {
        return in.readUnsignedShort();
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

    public void readFully(byte[] buf) throws IOException {
        in.readFully(buf);
    }

    public void readFully(byte[] buf, int off, int len) throws IOException {
        in.readFully(buf, off, len);
    }

    public int skipBytes(int len) throws IOException {
        return in.skipBytes(len);
    }

    @Deprecated
    public String readLine() throws IOException {
        return in.readLine();
    }

    public String readUTF() throws IOException {
        return in.readUTF();
    }

    public ObjectInputFilter getObjectInputFilter() {
        return in.getObjectInputFilter();
    }

    public void setObjectInputFilter(ObjectInputFilter filter) {
        in.setObjectInputFilter(filter);
    }

    public static InputStream nullInputStream() {
        return InputStream.nullInputStream();
    }

    public int read(byte[] b) throws IOException {
        return in.read(b);
    }

    public byte[] readAllBytes() throws IOException {
        return in.readAllBytes();
    }

    public byte[] readNBytes(int len) throws IOException {
        return in.readNBytes(len);
    }

    public int readNBytes(byte[] b, int off, int len) throws IOException {
        return in.readNBytes(b, off, len);
    }

    public long skip(long n) throws IOException {
        return in.skip(n);
    }

    public void mark(int readlimit) {
        in.mark(readlimit);
    }

    public void reset() throws IOException {
        in.reset();
    }

    public boolean markSupported() {
        return in.markSupported();
    }

    public long transferTo(OutputStream out) throws IOException {
        return in.transferTo(out);
    }
}
