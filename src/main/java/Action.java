package main.java;

public abstract class Action {
    public abstract boolean executeAction(Intention intention, Unifier unifier, BeliefBase beliefBase, EventSet eventSet);
}
