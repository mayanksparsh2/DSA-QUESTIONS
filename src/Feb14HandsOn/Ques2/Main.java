package  Feb14HandsOn.Ques2;

public class Main {

    public static void main(String[] args) {
        String cricketer[] = {
                "DHONI WICKET_KEEPER",
                "MALINGA BOWLER",
                "VIRATH BATSMAN",
                "SHEWAG BATSMAN",
                "UMESH BOWLER",
                "ROHIT FIELDER",
                "RAHUL FIELDER",
                "HARDIK FIELDER",
                "MAYANK BOWLER",
                "ASWIN WICKET_KEEPER",
                "RAINA BATSMAN"
        };
        int batsmans = 0, bowlers = 0, fielders = 0, wicketkeeper = 0;
        for (String player : cricketer) {
            if (player.contains("BATSMAN")) batsmans++;
            if (player.contains("WICKET_KEEPER")) wicketkeeper++;
            if (player.contains("BOWLER")) bowlers++;
            if (player.contains("FIELDER")) fielders++;
        }
        System.out.println("Total BATSMAN: " + batsmans);
        System.out.println("Total WICKET_KEEPER: " + wicketkeeper);
        System.out.println("Total BOWLER: " + bowlers);
        System.out.println("Total FIELDER: " + fielders);
    }
}
