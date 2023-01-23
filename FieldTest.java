package jp.ac.uryukyu.ie.e225736;

import java.beans.Transient;

class FieldTest {
    @Test 
    void prepareTest(){
        this.ishilist = new ArrayList<>();
        for(int y=0;y<this.ynum;y++){
        for(int x=0;x<this.xnum;x++){
        Ishi ishi = new Ishi(x,y);
        this.ishilist.add(ishi);
        }
      }  
    }
    assertEquals(x, y);
}