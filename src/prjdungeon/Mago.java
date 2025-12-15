/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author muhamed.ibraimi
 */
public class Mago  extends Personaggio{
    private int mana;
    private int totMana;
   private  boolean potenziamentoM;
    


    public Mago(int mana,   String nome, int[] pos, int atk, int def, int hp, int maxHp, double range) {
        super(nome, pos, atk, def, hp, maxHp, range);
        this.mana = mana;
        this.totMana=mana;
        potenziamentoM=false;
       
       
    }
    
   public int attaccoMagico(){
       int mana=3;
       int danno = 20 + totMana *4;
       if(potenziamentoM ){
           danno*=3;
           potenziamentoM=false;
       }
       return danno;
   }
   public void potenziamento(){
       potenziamentoM=true;
       
       
   }
    @Override
    public String toString() {
        return super.toString()+ "Mago{" + "mana=" + mana + ", totMana=" + totMana + ", potenziamentoM=" + potenziamentoM + '}';
    }
}
