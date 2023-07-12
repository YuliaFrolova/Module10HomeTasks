import java.io.*;
import java.util.ArrayList;


    public class WriterReaderExample {
        private static final String ABSOLUTE_PATH = "C:\\Users\\User\\IdeaProjects\\Module10HomeTask\\src\\resources\\writer\\file1.txt";
        private static final String ABSOLUTE_PATH2 = "C:\\Users\\User\\IdeaProjects\\Module10HomeTask\\src\\resources\\writer\\user.json";
        public static void main(String[] args) {
            ArrayList<String> result =  new ArrayList<>();
            File file = new File(ABSOLUTE_PATH);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

                bufferedWriter.write("name ");
                bufferedWriter.write("age\n");
                bufferedWriter.write("alice ");
                bufferedWriter.write("21\n");
                bufferedWriter.write("ryan ");
                bufferedWriter.write("30\n");




            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line = bufferedReader.readLine();
                while (line != null) {
                    result.add(line);
                    line = bufferedReader.readLine();



                }
                System.out.println(result.toString());




            }catch (IOException e) {
                System.err.println(e.getMessage());
            }
            File file2 = new File(ABSOLUTE_PATH2);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                for (String words:result){
                    bufferedWriter.write(words + "\n");
                }



            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line = bufferedReader.readLine();
                while (line != null) {

                    line = bufferedReader.readLine();



                }





            }catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

