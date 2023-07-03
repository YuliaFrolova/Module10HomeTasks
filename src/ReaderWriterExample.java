import java.io.*;
import java.util.regex.Pattern;


public class ReaderWriterExample {
    private static String ABSOLUTE_PATH = "C:\\Users\\User\\IdeaProjects\\Module10HomeTask\\src\\resources\\writer\\file.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write("098-322-4456\n");
            bufferedWriter.write("098322-4456\n");
            bufferedWriter.write("(097) 374-4658\n");
            bufferedWriter.write("(097)-374-4658\n");
            bufferedWriter.write("786-987-1253");

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }


            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                if (line.matches("\\d{3}-\\d{3}-\\d{4}")
                        || line.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}")) {
                    System.out.println(line);
                }
                line = reader.readLine();
            }
            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

