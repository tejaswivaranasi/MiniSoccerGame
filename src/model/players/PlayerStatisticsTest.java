package model.players;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class PlayerStatisticsTest {

   @Test
    public void getStatistics(){
      int stat = 0;
      PlayerStatistics Statistics = new PlayerStatistics();
      Statistics.setStatistics(stat);
      assertEquals(stat, Statistics.getStatistics());
   }

   @Test
   public void testtoString(){
      int stat = 0;
      PlayerStatistics Statistics = new PlayerStatistics();
      Statistics.setStatistics(stat);
      String statString = "" + stat;
      assertEquals(statString, Statistics.toString());
   }



}