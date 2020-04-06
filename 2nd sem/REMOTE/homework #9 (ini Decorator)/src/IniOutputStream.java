import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class IniOutputStream extends OutputStream {
    private OutputStream out;

    public IniOutputStream(OutputStream out) {
        this.out = out;
    }

    public void writeIni(ArrayList<ArrayList<String>> ini) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {
            for (int i = 0; i < ini.size();i++) {
               for (int j = 0; j < ini.get(i).size(); j++) {
                   writer.write(ini.get(i).get(j));
                   writer.newLine();
               }
            };
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void write(int b) throws IOException {
    }
}
