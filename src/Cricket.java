public class Cricket extends Game {
    private int noOfBatsman;
    private int noOfBowler;


    public Cricket(int noOfPlayers, String typeOfField, int noOfBatsman, int noOfBowler) {
        super(noOfPlayers, typeOfField);
        this.noOfBatsman = noOfBatsman;
        this.noOfBowler = noOfBowler;
    }

    public void displayCricket() {
        System.out.println("Display details of Cricket");
        System.out.println("Display details of Football team");
        display();
        System.out.println("No of Batsman = " + noOfBatsman);
        System.out.println("No of Bowler = " + noOfBowler);

    }
}
