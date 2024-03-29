package main.java;

import java.util.LinkedList;

public class IntentionSet extends LinkedList<Intention> {

    public Intention selectIntention(){
        return this.pop();
    }

    public void addIntention(Event event, IntendedMeans intendedMeans) {
        Intention intention = event.getIntention();
        intention.push(intendedMeans);
        this.add(intention);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Intention intention : this) {
            string.append(intention.toString());
            if (intention != this.get(this.size()-1)) {
                string.append("\n");
            }
        }
        return string.toString();
    }
}
