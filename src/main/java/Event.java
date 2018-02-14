package main.java;

public class Event {

    private EventTrigger eventTrigger;
    private Intention intention;

    public EventTrigger getEventTrigger() {
        return eventTrigger;
    }

    public Intention getIntention() {
        return intention;
    }

    public void setEventTrigger(EventTrigger eventTrigger) {
        this.eventTrigger = eventTrigger;
    }

    public void setIntention(Intention intention) {
        this.intention = intention;
    }

    public Term getTerm(){
        return eventTrigger.getBeliefLiteral().getTerm();
    }
}