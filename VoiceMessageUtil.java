import java.util.Date;
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
}