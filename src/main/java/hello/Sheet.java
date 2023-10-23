package hello;

public final class Sheet{
    private int width;
    private int height;

    private int area;

    private int [][] board;

    public Sheet(int width, int height){
        this.width = width;
        this.height = height;
        
        this.area = width * height;

        this.board = new int[width][height];
    }

    public int getArea(){
        return this.area;
    }
}