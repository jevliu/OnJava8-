/**
 * @author 刘季伟
 * @implNote 展示通过添加间接层来实现在同一个棋盘上下国际象棋和西洋跳棋两种游戏的功能。
 * @since 2024/4/27 14:26:26
 */
interface Game{
    boolean move();
}
interface GameFactory{
    Game getGame();
}
class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;
    @Override
    public boolean move(){
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}
class CheckersFactory implements GameFactory{
    @Override
    public Game getGame(){
        return new Checkers();
    }
}
class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;
    @Override
    public boolean move(){
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
class ChessFactory implements GameFactory{
    @Override
    public Game getGame(){
        return new Chess();
    }
}
public class Games {
    public static void playGame(GameFactory factory){
        Game g = factory.getGame();
        while (g.move()){
            ;
        }
    }

    public static void main(String[] args) {
        playGame(new ChessFactory());
        playGame(new CheckersFactory());
    }
}
