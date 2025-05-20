public class MoveablePoint implements Moveable{
    private int x, y;

    public MoveablePoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return ("("+x+","+y+")\n");
    }
    public void moveUp(){
        (this.y)++;
    }
    public void moveDown(){
        (this.y)--;
    }
    public void moveLeft(){
        (this.x)--;
    }
    public void moveRight(){
        (this.x)++;
    }

}
