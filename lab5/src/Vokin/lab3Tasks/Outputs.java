package Vokin.lab3Tasks;

import java.io.FileWriter;
import java.io.IOException;

public class Outputs
{
    static public void WriteDownFile(String what, String where) throws Exception{
        try {
            FileWriter writer = new FileWriter(where);
            writer.write(what);
            writer.close();
            System.out.println("Все ок");
        } catch (IOException ex) {
            throw new IOException("Everything is bad");
        }
    }
}
