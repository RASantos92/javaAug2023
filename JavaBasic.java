public class JavaBasic {
    // entry point method;
    // The JRE needs to call on the programs main method for the program to run.
    // public because this method needs to be callable outside the class.
    // static methods can be called without having to create an instance of the class to call it.
    // JRE by default will call on your class.main(args) 
    public static void main(String[] args){
        System.out.println("Hello");

        String firstName = "John";
        String lastName = "Smyth";

        int age = 25;
        boolean isStudent = true;
        double height = 5.9;


        Integer age2 = 26;

        System.out.println(Integer.MAX_VALUE + "age: " + age2);

        System.out.println(firstName + " " + lastName + "\n" +
                            age + "\n" + isStudent + "\n" + height);


        if(age < 21){
            System.out.println("under 21 cant drink");
        } else {
            System.out.println("You can drink");
        }

        System.out.println(age < 21 ? "under 21 cant drink" : "You can drink");

        String firstName1 = "Sylvia";
        String lastName1 = "Tran";

        String fullName = firstName1.concat(lastName1);
        System.out.println(fullName);
        System.out.println(fullName.length());

        // String formating
        String greeting = String.format("Hi %s, you are %d years old", fullName,age);
        System.out.println(greeting);

        System.out.printf("Hi %s, you are %d years old \n", fullName,age);


        String name1 = "Sylvia";
        String name2 = new String("Sylvia");
        String name3 = "Sylvia";

        System.out.println(name1 == name2); // false
        System.out.println(name1 == name3); // true
        System.out.println(name1.equals(name2)); // true

    }
}
