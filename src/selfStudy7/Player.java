package selfStudy7;

public class Player {
    public static <T> void player1(T t){

             System.out.println(t);
         }


    public static void main(String[] args) {
        Player.player1("Ermiri");

        Player.player1(22);

        Player.player1( 6000000);
    }
}
