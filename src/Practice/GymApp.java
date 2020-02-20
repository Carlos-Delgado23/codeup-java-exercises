package Practice;

import java.util.Arrays;

public class GymApp {

    private Membership[] memberships;
    private static int totalMembers = 3;

    public GymApp(Membership[] memberships){
        this.memberships = memberships;

    }

    public static int getTotalMembers() {
        return totalMembers;
    }

    public static void main(String[] args) {
        /*--initial persons--*/
        Person hung = new Person("Hung", "Ly", 180, 1, new String[]{"lose 10lbs", "get Stronger"});
        Person charlie = new Person("Charlie", "Delgado", 130, 1, new String[]{"gain 10lbs", "get Stronger"});
        Person paris = new Person("Paris", "Tyus", 2600, 1, new String[]{"lose 10lbs", "get buff"});

        /*--Initial memberships--*/
        Membership member1 = new Membership(hung,"elite", 40.00, "monthly", true );
        Membership member2 = new Membership(charlie,"basic", 25.00, "monthly", true );
        Membership member3 = new Membership(paris,"gold", 30.00, "monthly", true );

        Membership[] currentMembers = new Membership[]{member1, member2, member3};



        GymApp app = new GymApp(currentMembers);
        System.out.println("Total members: " + GymApp.getTotalMembers());
        app.memberships = addMember(app.memberships, new Membership(
                new Person("Rachel", "Castaneda", 110, 57, new String[]{"get muscle", "do 2 push-ups"}), "elite",
                400.00, "annual", true));

        System.out.println("Total members: " + GymApp.getTotalMembers());

        for(Membership member : currentMembers){
            printPersonInfo(member.getPerson());
        }

    }


    //    Print Person Info
    public static void printPersonInfo(Person personObj){
        System.out.print("Person's information below:\n");
        System.out.printf("First name: %s\n" +
                          "Last Name: %s\n" +
                          "Weight: %d\n" +
                          "Member ID: %d\n",
                          personObj.firstName, personObj.lastName, personObj.getWeight(), personObj.getMemberID());
        System.out.println("Their goals: ");
        for(String goals : personObj.getGoals()){
            System.out.printf("%s ", goals);
        }
        System.out.println("\n");
    }

//    Add a member, add membership to array, increase total members
    public static Membership[] addMember(Membership[] oldMembershipArray, Membership newMembership){
        Membership[] returnArray;
        returnArray = Arrays.copyOf(oldMembershipArray, oldMembershipArray.length + 1);
        returnArray[returnArray.length - 1] = newMembership;
        GymApp.totalMembers++;
        return returnArray;
    }
}
