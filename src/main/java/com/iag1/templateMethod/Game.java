package com.iag1.templateMethod;

public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //templateMethod method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();

      //end game
      endPlay();
   }
}
