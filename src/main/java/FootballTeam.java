public class FootballTeam implements Comparable {

    private int gamesWon;

    FootballTeam(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    @Override
    public int compareTo(Object o) {
        return gamesWon - ((FootballTeam) o).getGamesWon();
    }
}
