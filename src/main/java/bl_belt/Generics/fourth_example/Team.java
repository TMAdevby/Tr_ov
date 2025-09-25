package bl_belt.Generics.fourth_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{// теперь в команду schoolar можно добавить только shoolar и нельзя создать команду String
                                            //из за extends Participant
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.println("V komandu " + name + " bil dobavlen noviy uchastnik" +
                " po imeni " + participant.getName());
    }

    public void playWith(Team  team){  // теперь мы можем играть только с той командой какой являемся сами
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i==0){
            winnerName = this.name;
        }
        else {
            winnerName = team.name;
        }
        System.out.println("Viygrala komanda " + winnerName);
    }
}
