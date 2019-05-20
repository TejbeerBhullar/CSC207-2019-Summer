// Lecture 1


// In java you must have a main meathod
// Also everything must be put in a class
// If I run this I get an error which tells me that I need to implement public static void main with which all
// classes must be started

public class Main{
    public static void main(String[] arg){

        int i = 12;
        String test = "Hello";
        Person Jon = new Person(); // Using new person is using constructot of a class
        //Mat.fullName = "Kim";       //2. Aother way is this
        //System.out.println(Mat); // If I just run this then I get Person@610455d6 which tells us that mAt is a person
                                        // and also gives us the memory adress

        Jon.fullName = "Jon Smith";
        System.out.println(Jon.fullName);
    }
}


