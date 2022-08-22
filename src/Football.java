public class Football extends Game {
    private int forwardPlayer;

    public Football(int noOfPlayers, String typeOfField, int forwardPlayer) {
        super(noOfPlayers, typeOfField);
        this.forwardPlayer = forwardPlayer;
    }

    public void displayFootball() {
        System.out.println("Display details of Football team");
        display();
        System.out.println("forwardPlayer = " + forwardPlayer);
        System.out.println();
    }
}
