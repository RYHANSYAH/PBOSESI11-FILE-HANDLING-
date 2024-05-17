
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\koputer 29\\Documents\\NetBeansProjects\\new_students.csv";
        
        Scanner input = new Scanner(System.in);
        boolean addMoreData = true;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            while (addMoreData) {
                System.out.print("Masukkan data diri [Nim,Nama,Umur,Prodi]: ");
                String data_student = input.nextLine();

                bw.write(data_student);
                bw.newLine();

                System.out.print("Apakah ingin menambahkan lagi? (ya/tidak): ");
                String response = input.nextLine();
                if (!response.equalsIgnoreCase("ya")) {
                    addMoreData = false;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }  finally {
            input.close();
        }

    }
}
