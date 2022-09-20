package Black_Belt.L02.Genenrics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;

    /**
     * @param name имя метода
     */
    public Team(String name) {

        this.name = name;
    }

    private List<T> participants = new ArrayList<>();

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println(" V komandu " + name + "byl dobavlen " + participant.getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Vigrala komanda - " + winnerName);
    }

}
