import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;
class transform
{
    public static void main(String[] args) throws IOException
    {
        if (args.length != 1) 
        {
            System.err.println("Usage: java FileReading <filename>");
            System.exit(1);
        }
        String datafile = args[0];
        try
        {
            data(datafile);
        }
        catch(IOException hello1){System.err.println("Error reading file: " + hello1.getMessage());}
    }
    public static void data(String datafile)throws IOException
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(datafile))) 
        {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) 
            {
                lines.add(line);
            }

            // Process the lines as needed
            for (String line1 : lines) 
            {
                System.out.println(line1);
            }
        } catch (IOException hello){System.err.println("Error reading file: " + hello.getMessage());}
    }
}