/*Дана json строка вида:
String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
Используйте StringBuilder для подготовки ответа
Далее создайте метод, который запишет результат работы в файл. Обработайте исключения и 
                                            запишите ошибки в лог файл с помощью Logger.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class methods {

    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        // System.out.println(json);
        String[] parts = json.split("[},{]+");
        String[] parts2 = new String[100000]; 
        int count = (parts.length - 2)/3;

        for (int i = 0; i < count; i++){    
            int a = i*3 + 1;
            int b = i*3 + 2;
            int c = i*3 + 3;
            StringBuilder sb1 = new StringBuilder(parts[a]);
            parts2[a] = sb1.substring(11, sb1.length()-1);
            StringBuilder sb2 = new StringBuilder(parts[b]);
            parts2[b] = sb2.substring(10, sb2.length()-1);
            StringBuilder sb3 = new StringBuilder(parts[c]);
            parts2[c] = sb3.substring(11, sb3.length()-1);
        } 

        output(parts2, count);

    }

    public static void output (String[] parts, int count){
         for (int i = 0; i < count; i++){
            int a = i*3 + 1;
            int b = i*3 + 2;
            int c = i*3 + 3;
            StringBuilder answer = new StringBuilder();
            answer.append("Студент " );           
            answer.append(parts[a]);
            answer.append(" получил " );
            answer.append(parts[b]);
            answer.append(" по предмету " );
            answer.append(parts[c]);
            String res = new String(answer);
            writeToFile(res);
            System.out.println(answer);    
        }
    }

    static void writeToFile(String text){
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try{
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        try (FileWriter writer = new FileWriter("text.txt", true)){
            writer.write(text);
            writer.write("\n");
            writer.flush();
        } catch (Exception e){
            logger.severe(e.toString());
        }
        fileHandler.close();
    }
}

