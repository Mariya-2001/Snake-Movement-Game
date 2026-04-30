public class GameMap {
    public int rows;
    public int columns;
    public char Empty ='-';
    public char Snake_Body ='o';
    public char[][] grid;

    public GameMap(int rows,int columns){
        this.columns=columns;
        this.rows=rows;
        this.grid=new char[rows][columns];
        initEmptyMap();
    }

}
