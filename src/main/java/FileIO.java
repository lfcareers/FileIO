import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        String[] names = new String[]{"John", "Carl", "Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("input1.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is another line.");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input1.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
