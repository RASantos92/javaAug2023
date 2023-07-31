import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        VoiceMessageUtil messageUtil = new VoiceMessageUtil();
        System.out.println(messageUtil.greeting());
        System.out.println(messageUtil.greeting("Isaiah", 26));
        messageUtil.getCurrentDate();


        // let testArray = [1,2,3,4];
        int[] messagesPerDay = new int[4]; // [0,0,0,0]
        messagesPerDay[0] = 5; // [5,0,0,0]
        messagesPerDay[1] = 5;
        messagesPerDay[2] = 5;

        // int[] messagesPerDay1 = {5,5,5};
        // messagesPerDay1[0] = 1;

        String[] messages = {"String1" , "String2", "String3"};

        System.out.println(messageUtil.totalMessages(messagesPerDay));

        messageUtil.printMessages(messages);

        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Finish Cafe Business logic");
        todoList.add("Read ahead for oop");

        messageUtil.printMessages(todoList);


        int days = 7;
        double costOfLivingPerDay = 500.66; 

        //no loss of data
        double totalCostOfLivingForAWeek = days * costOfLivingPerDay; // int => double

        // possible we loose data
        Integer totalCostOfLivingForAWeekInt = days * (int) costOfLivingPerDay; // double => int
        System.out.println(totalCostOfLivingForAWeekInt);



    }
}