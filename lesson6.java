import java.io.*;
import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) throws IOException {
        String log, password, name="Админ"; int one=0;
        File lesson6 = new File("Pass.txt");
        if (!lesson6.exists()) lesson6.createNewFile();
        FileReader fr = new FileReader(lesson6);
        FileWriter fw = new FileWriter(lesson6, true);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner sr = new Scanner(System.in);
        System.out.printf("Hola!\n");
        System.out.println("Жми\n1 для Регистрации\n2 для Входа");
        one = sr.nextInt();

        switch (one) {
            case 1:
            System.out.println("Введи логин: ");
            sr.nextLine();
            log = sr.nextLine();
            bw.write(log);
            System.out.println("Введи пароль: ");
            password = sr.nextLine();
            bw.newLine();
            bw.write(password);
            bw.flush();
            bw.close(); break;
            case 2:
            System.out.println("Логин: ");
            sr.nextLine();
            log = sr.nextLine();
            System.out.println("Пароль: ");
            password = sr.nextLine();
            if (log.equals(br.readLine()) && password.equals(br.readLine()))
                System.out.println("Hola "+name+"!"); else System.out.println("Иди-ка отсюда парень...");
                break;
            default: System.exit(0); break;
        }
    }
    
}

// Сделал не совсем по заданию. Не разобрался в try-catch и не понял как ограничить кол-во попыток.