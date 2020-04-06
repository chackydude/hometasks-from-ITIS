import java.io.*;
import java.util.ArrayList;

public class IniInputStream extends InputStream {
    private InputStream in;

    public IniInputStream(InputStream in) throws IOException{
        this.in = new DataInputStream(in);
    }

    public ArrayList<ArrayList<String>> readIni() {
        ArrayList<ArrayList<String>> iniResult = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;
            ArrayList<String> currentNode = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if (line.charAt(0) == '[') {
                    ArrayList<String> newNode = new ArrayList<>();
                    iniResult.add(newNode);
                    newNode.add(line);
                    currentNode = newNode;
                } else currentNode.add(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return iniResult;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}