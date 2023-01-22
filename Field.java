package jp.ac.uryukyu.ie.e225736;

import java.util.ArrayList;
import java.util.List;

public class Field{
  private List<Ishi> ishilist;
  private int ynum = 0;
  private int xnum = 0;

  public Field(int xnum, int ynum){
    this.xnum = xnum;
    this.ynum = ynum;
  }
  public void prepare(){
    this.ishilist = new ArrayList<>();
    for(int y=0;y<this.ynum;y++){
      for(int x=0;x<this.xnum;x++){
        Ishi ishi = new Ishi(x,y);
        this.ishilist.add(ishi);
      }
    }
  }

  public Ishi getIshi(int y, int x){
    for(Ishi ishi : this.ishilist){
      int[]pos = ishi.getPosition();
      if(pos[0]==y && pos[1]==x){
        return ishi;
      }
    }
    return null;
  }

  public void putIshi(int x, int y, String state){
    Ishi ishi = this.getIshi(x,y);
    ishi.setState(state);
  }
  public void feature(){
    String [][] board = new String[ynum][xnum];
    for(Ishi ishi : this.ishilist){
      int[] pos = ishi.getPosition();
      String state = ishi.getState();
      board[pos[1]][pos[0]] = state;
    }
    System.out.println("\n\t0\t1\t2\t3\t4\t5\n");
    for(int y=0;y<board.length;y++){
      System.out.print(y+"\t");
      for(int x=0;x<board[0].length;x++){
        String b = board[y][x];
        System.out.print(b+"\t");
      }
      System.out.println("\n");
    }
  }
}
