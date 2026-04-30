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

    public void initEmptyMap(){
        for(int x=0;x<rows;x++){
            for(int y=0;y<columns;y++){
                grid[x][y] = Empty;
            }
        }
    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public char[][] getGrid(){
        return grid;
    }

}
