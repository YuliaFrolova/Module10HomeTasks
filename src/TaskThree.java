import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskThree {
    private static String ABSOLUTE_PATH = "C:\\Users\\User\\IdeaProjects\\Module10HomeTask\\src\\resources\\writer\\words.txt";

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
        //the day is sunny the the
        //the sunny is is
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            Map<Integer, String> words =  new HashMap<>();
            words.put(1, "the ");
            words.put(2, "day ");
            words.put(3, "is ");
            words.put(4, "sunny ");
            words.put(5, "the ");
            words.put(6, "the \n");
            words.put(7, "the ");
            words.put(8, "sunny ");
            words.put(9, "is ");
            words.put(10, "is ");
            String[] result = words.values().toArray(new String[0]);
            bufferedWriter.write(Arrays.toString(result));



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
                int count = 1;
                while (line != null) {
                   reader.readLine();



                }
                String[] res = new String[] {reader.toString()};
                for (int i = 0; i < res.length; i++) {
                    if (res[i] == res[i++]){
                        count ++;
                    }

                }
                System.out.println("the: " + count );
                System.out.println("day: " + count);
                System.out.println("is: " + count);
                System.out.println("sunny: " + count);


            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

