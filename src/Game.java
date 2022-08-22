public class Game {
    private int noOfPlayers;
    private String typeOfField;

    public Game(int noOfPlayers, String typeOfField) {
        this.noOfPlayers = noOfPlayers;
        this.typeOfField = typeOfField;
    }

    public void display() {
        System.out.println("No Of Players = " + noOfPlayers);
        System.out.println("Type Of Field = " + typeOfField);
    }
}
