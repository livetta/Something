package Helper;

import java.io.File;
import java.io.FileInputStream;

public class Properties {
 
   //Переменная хелпер (инстанс?)
   public final static Properties INSTANCE = new Properties();
   //Переменная для работы с файлами пропертис:
   private java.util.Properties properties;


   // Чтение из файла:
   private Properties(){
      properties = new java.util.Properties();

      try {
         FileInputStream file = new FileInputStream(new File("data.properties"));
         properties.load(file);
      }catch (Exception e){
         System.out.println("data.properties file is not found!");
      }
   }

   // Получаем значение из файла по ключу:
   public synchronized String getProperties(String key){
      String value;
      value = (String)properties.get(key);
      return value;
   }
}
