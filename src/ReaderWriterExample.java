import java.io.*;


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
            bufferedWriter.write("(097)-374-4658\n");

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
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

