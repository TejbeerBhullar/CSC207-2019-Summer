// Lecture 1
// The person class is doing 2 things
    // 1. Doing the person stuff
    // 2. Doing the student stuff

///** A person at the UofT with a name and a UTORid. */
//public class Person {
//
//    /** The person's name, with the last name last. */
//    String[] name;
//
//    /** This person's UTORid. */
//    String id;
//
//    /** TODO: write this. */
//    public Person(String id, String[] n) {
//        this.id = id;
//        this.name = n;
//    }
//}
//

public class Person{
    String fullName = "Jim Smith"; // That;s one way
    String SINNumber;
//    String utorId;
//    int studentNumber; // If a person is not a student then these last two things don't apply


     public Person(){  // this is also an init meathod that is the default one

    }


    public Person(String fullName){         // Before this init meathod java had a default init meathod
        this.fullName = fullName;
    }

}

