import java.util.Date;
import java.util.ArrayList;
public class VoiceMessageUtil {

    public String greeting(){
        return "hello, you";
    }

    public String greeting(String name){
        return "hello " + name;
    }

    public String greeting(String name, int age){
        return "hello " + name + ", your age is " + age;
    }

    public void getCurrentDate(){
        Date today = new Date();
        System.out.println(today);
    }

    public int totalMessages(int[] intArr){
        int sum = 0;
        for(int i = 0; i<intArr.length ; i++){
            sum += intArr[i];
        }
        return sum;
    }

    public void printMessages(String[] messages){
        // for(int i = 0; i < messages.length; i++){
        //     System.out.println(messages[i]);
        // }

        for(String message : messages){
            System.out.println(message);
        }

    }

    public void printMessages(ArrayList<String> messages){
        // for(int i = 0 ; i<messages.size(); i++){
        //     System.out.println(messages.get(i));
        // }

        for(String message : messages){
            System.out.println(message);
        }
    }

    
}