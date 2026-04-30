public enum Direction {
        LEFT,RIGHT,UP,DOWN;

    public static Direction fromString(String direction){

        switch (direction.toLowerCase()){
            case "left":
                return LEFT;
            case "right":
                return RIGHT;
            case "up":
                return UP;
            case "down":
                return DOWN;
            default:
                return null;
        }
    }
}
