import java.util.LinkedList;
import java.util.List;

public class Snake {
    public LinkedList<Position> snakeBody;
    public Direction currDirection;

    public Snake(){
        this.snakeBody=new LinkedList<>();
        this.currDirection =Direction.RIGHT;

    }

    public void initializing(List<Position> positions){
        snakeBody.clear();
        snakeBody.addAll(positions); //Head is at the end

    }

    public void initializeCenter(GameMap gameMap){
        snakeBody.clear();
        int rowCenter = gameMap.getRows()/2;
        int colStart = (gameMap.getColumns()/2)-2;

        for(int x=0;x<5;x++){
            Position position =new Position(rowCenter,colStart+x);
            snakeBody.add(position);
            gameMap.placeSnake(position);
        }
        currDirection=Direction.RIGHT;

    }

}
