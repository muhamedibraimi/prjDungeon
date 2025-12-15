/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author muhamed.ibraimi
 */
public class Orco extends Nemici{
     public Orco(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range, boolean isBoss) {
        super(nome, pos, atk, def, hp, maxHp, range, isBoss);
        isBoss = true;
    }

    @Override
    public int attacco(Personaggio n){
        int danno = (getAtk() + (getMaxHp() - getHp())/5);
        if(getHp() < getMaxHp()/2){
            danno *= 2;
        }
        return danno;
    }
    

}
