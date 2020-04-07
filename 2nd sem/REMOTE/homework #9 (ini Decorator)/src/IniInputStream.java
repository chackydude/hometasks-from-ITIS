import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IniInputStream extends InputStream {
    private InputStream in;

    public IniInputStream(InputStream in) throws IOException{
        this.in = new DataInputStream(in);
    }

    public Map<String, String> readIni() {
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
        Map<String, String> iniMap= new HashMap<>();
        for (int i = 0; i < iniResult.size(); i++) {
            for (int j = 0; j < iniResult.get(i).size(); j++) {
                String mapLine = iniResult.get(i).get(j);
                if (mapLine.indexOf('=') != -1) {
                    StringBuffer key = new StringBuffer();
                    StringBuffer value = new StringBuffer();
                    for (int k = 0; k < mapLine.indexOf('='); k++) {
                        key.append(mapLine.charAt(k));
                    }
                    for (int k = mapLine.indexOf('=')+1; k < mapLine.length(); k++) {
                        value.append(mapLine.charAt(k));
                    }
                    iniMap.put(key.toString(), value.toString());
                }
            }
        }
        return iniMap;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}