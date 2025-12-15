/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author muhamed.ibraimi
 */
public class Goblin extends Nemici{
    private int agilita;
    public Goblin(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range, boolean isBoss,int agilita) {
        super(nome, pos, atk, def, hp, maxHp, range, isBoss);
        this.agilita=agilita;
    }
    @Override
    public boolean subisciDanno(int danno){
        if(Math.random()*100+1<=agilita/2){
            danno=0;
        }
        setHp(getHp()-danno);
        return isVivo();
    }
    @Override
    public int attacco(Personaggio nemico){
        int danno=getAtk()*3+agilita-nemico.getDef()*2;
        return danno;
    }
    
}


