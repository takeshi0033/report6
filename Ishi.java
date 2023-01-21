package jp.ac.uryukyu.ie.e225736;

public class Ishi{
    private String state; // オセロ盤上の色　（黒=B、白=W、空=E）
    private int x;
    private int y;

    public Ishi(int x,int y){
        this.state = "E";
        this.x = x;
        this.y = y;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int[] getPosition(){
        int[]pos = {this.x, this.y};
        return pos;
    }
}
