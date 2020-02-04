import java.util.Random;

public class ServerNameGenerator {

    public String[] nameAdjectives =
            {"Dazed", "Cracked", "Confused", "Dirty", "Gully", "Live", "Tipsy", "Wack", "Yung", "Lil"};
    public String[] nameNouns =
            {"Flaco", "Jimmy", "TuTwo", "Richie", "Choppy", "Asia", "Scott", "Garrett", "Jack", "Andre"};



    public static String randomPick (String[] adjs, String[] noun) {
        String name = adjs[new Random().nextInt(adjs.length)];
        String last = noun[new Random().nextInt(noun.length)];
        return name + "-" +  last;
    }

    public static void main(String[] args){
        ServerNameGenerator SNG = new ServerNameGenerator();

        System.out.println("This is your rapper name: ");
        System.out.println(randomPick(SNG.nameAdjectives, SNG.nameNouns));
    }
}
