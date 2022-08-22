public class GameImplementation {
    public static void main(String[] args) {
        Cricket cricket = new Cricket(12, "oval", 5, 4);
        cricket.displayCricket();

        Football football = new Football(11, "Rectangle", 3);
        football.displayFootball();
    }
}
