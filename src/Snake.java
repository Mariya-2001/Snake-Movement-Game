import java.util.LinkedList;

public class Snake {
    public LinkedList<Position> snakeBody;
    public Direction currDirection;

    public Snake(){
        this.snakeBody=new LinkedList<>();
        this.currDirection =Direction.RIGHT;

    }

}
