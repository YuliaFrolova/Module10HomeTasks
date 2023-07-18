import java.io.*;
import java.util.*;

public class TaskThree {
    private static String ABSOLUTE_PATH = "C:\\Users\\User\\IdeaProjects\\Module10HomeTask\\src\\resources\\writer\\words.txt";

    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        File file = new File(ABSOLUTE_PATH);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("the ");
            bufferedWriter.write("day ");
            bufferedWriter.write("is ");
            bufferedWriter.write("sunny ");
            bufferedWriter.write("the ");
            bufferedWriter.write("the ");
            bufferedWriter.write("the ");
            bufferedWriter.write("sunny ");
            bufferedWriter.write("is ");
            bufferedWriter.write("is\n");


        } catch (IOException e) {
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

                res.add(line);
                line = reader.readLine();



            }



            String[] result = res.toString().split("\\s+");


            HashMap<String, Integer> hMap = new HashMap<>();
            for (int i = 1; i < result.length-1; i++) {
                if (hMap.containsKey(result[i])) {
                    int count = hMap.get(result[i]);
                    hMap.put(result[i], count + 1);
                } else {
                    hMap.put(result[i], 1);
                }
            }
            hMap.entrySet().stream()
                    .sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(System.out::println);




            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

