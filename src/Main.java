import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File string =new File("Файл");
        try {
            Scanner scanner=new Scanner(string);
        } catch (FileNotFoundException e) {
              System.out.println("Файл не найден!!!");
        }
        System.out.println("Продолжаем работу!");
    }


}