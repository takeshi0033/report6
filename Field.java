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

}
