public class Test {
    public static void main(String[] args){
        VoiceMessageUtil messageUtil = new VoiceMessageUtil();
        System.out.println(messageUtil.greeting());
        System.out.println(messageUtil.greeting("Isaiah", 26));
        messageUtil.getCurrentDate();
    }
}