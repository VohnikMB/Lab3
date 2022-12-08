import org.jetbrains.annotations.NotNull;

import java.io.FileWriter;
import java.io.IOException;

public class Checked_Exception {
    @NotNull
    static String texts = "";
    public static void saveInTxt(String text){
        texts=text;
        try(FileWriter writer = new FileWriter("text.txt", false))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
