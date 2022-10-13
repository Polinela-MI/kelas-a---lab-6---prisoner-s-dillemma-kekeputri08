package studyKasus;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    public int hitungPayof() {
        if (getPlayer1().getStrategi() == 0 && getPlayer2().getStrategi() == 0) {
            player1.setSkor(8);
            player2.setSkor(8);
        } else if (getPlayer1().getStrategi() == 0 && getPlayer2().getStrategi() == 1) {
            player1.setSkor(4);
            player2.setSkor(10);
        }else if (getPlayer1().getStrategi() ==1 && getPlayer2().getStrategi() == 0) {
            player1.setSkor(10);
            player2.setSkor(4);
        }else if (getPlayer1().getStrategi() ==1 && getPlayer2().getStrategi() == 1) {
            player1.setSkor(6);
            player2.setSkor(6);
        }
    return hitungPayof();
    }

        public void setPlayer1 (Player player1){
            this.player1 = player1;
        }

        public void setPlayer2 (Player player2){
            this.player2 = player2;
        }

        public Player getPlayer1 () {
            return player1;
        }

        public Player getPlayer2 () {
            return player2;
        }
    }

