/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

import java.util.Random;

/**
 *
 * @author muhamed.ibraimi
 */
public class Guerriero extends Personaggio{


   private int scudo;
   private int turniBoost;


   public Guerriero(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range) {
       super(nome, pos, atk, def, hp, maxHp, range);
       this.scudo = 90;
   }


   @Override
   public int attacco(Personaggio nemico){
      
       int danno=super.getAtk()*3-nemico.getDef()*2;
       if(turniBoost>0){
           danno = (int)(danno*1.25);
           turniBoost -= 1;
       }
       if(danno<=0){
           danno=1;
       }
       return danno;
   }
  
   public void LuceArdente(){
       turniBoost = 3;
   }


   public String CaricaSolare(){
       String t = "";
       Random random = new Random();
       int min = 5;
       int max = 20;
       int range = max - min - 1;
       int numCasuale = random.nextInt(range)+min;
       this.scudo += numCasuale;
       t = "Lo scudo si è ricaricato di " + numCasuale + " hp";
       return t;
   }


   @Override
   public boolean subisciDanno(int danno){
     if(scudo>0){
         scudo -= danno;
         if(scudo<0){
             setHp(getHp()+scudo);
             scudo = 0;
         }
     }else{
         setHp(getHp()-danno);
     }
     return super.isVivo();
   }




   @Override
   public String toString() {
       return super.toString() + "Guerriero{" +
               "scudo=" + scudo +
               ", turniBoost=" + turniBoost +
               '}';
   }
}

