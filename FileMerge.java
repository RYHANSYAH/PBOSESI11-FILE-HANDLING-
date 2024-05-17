
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileMerge {
    public static void main(String[] args) {
        String[]files = {"C:\\Users\\koputer 29\\Documents\\NetBeansProjects\\students.csv",
            "C:\\Users\\koputer 29\\Documents\\NetBeansProjects\\new_students.csv"};
        String mergedfile = "C:\\Users\\koputer 29\\Documents\\NetBeansProjects\\merge.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedfile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
