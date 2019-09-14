import java.util.Scanner;

class PurdueTutor {

public void ReadyGo() {
    Scanner s = new Scanner(System.in);
    String name;

    System.out.println("Hi! What's your name?");
    name = s.nextLine();

    System.out.println("What subject would you like help in?");
    System.out.println("(1) Math \n(2) English  \n(3) Science");
    String subject = s.nextLine();

    if (subject.equals("1")) {
        System.out.println("What type of help would you like?");
        System.out.println("(1) Specific Question \n(2) General Advice");
        String type = s.nextLine();

        if (type.equals("1")) {
            System.out.println("What kind of learner are you?");
            System.out.println("(1) Visual \n(2) Audio");
            String learner = s.nextLine();

            if (learner.equals("1")) {
                System.out.println("Thank you for your response "+name+", you are connected with John");
            } else if (learner.equals("2")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Sweta");
            }


        } else if (type.equals("2")) {
            System.out.println("What kind of learner are you?");
            System.out.println("(1) Visual \n(2) Audio");
            String learner = s.nextLine();

            if (learner.equals("1")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Jack");
            } else if (learner.equals("2")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Serena");
            }
        }
    }



    else if(subject.equals("2")){
        System.out.println("What type of help would you like");
        System.out.println("(1) Specific Question \n(2) General Advice");
        String type = s.nextLine();

        if (type.equals("1")) {
            System.out.println("What kind of learner are you?");
            System.out.println("(1) Visual \n(2) Audio");
            String learner = s.nextLine();

            if (learner.equals("1")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Aditya");
            } else if (learner.equals("2")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Jwala");
            }


        } else if (type.equals("2")) {
            System.out.println("What kind of learner are you?");
            System.out.println("(1) Visual \n(2) Audio");
            String learner = s.nextLine();

            if (learner.equals("1")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Tejas");
            } else if (learner.equals("2")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Neha");
            }
        }

    }




    else if(subject.equals("3")){
        System.out.println("What type of help would you like");
        System.out.println("(1) Specific Question \n(2) General Advice");
        String type = s.nextLine();

        if (type.equals("1")) {
            System.out.println("What kind of learner are you?");
            System.out.println("(1) Visual \n(2) Audio");
            String learner = s.nextLine();

            if (learner.equals("1")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Max");
            } else if (learner.equals("2")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Alicia");
            }


        } else if (type.equals("2")) {
            System.out.println("What kind of learner are you?");
            System.out.println("(1) Visual \n(2) Audio");
            String learner = s.nextLine();

            if (learner.equals("1")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Zach");
            } else if (learner.equals("2")) {
                System.out.println("Thank you for your response " +name+ ", you are connected with Lacie");
            }
        }

    }
}

    public static void main(String[] args) {
        PurdueTutor readyGo = new PurdueTutor();
        readyGo.ReadyGo();
    }


}


