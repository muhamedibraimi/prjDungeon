/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author muhamed.ibraimi
 */
public class Ladro extends Personaggio{
    //chance critica inizierà a 20% ma potrà essere aumentata con oggetti
    private int critChance;
    private int turniPotenziamento;
    public Ladro(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range,int critChance) {
        super(nome, pos, atk, def, hp, maxHp, range);
        this.critChance=critChance;
    }
    public int passaTurno(){
        turniPotenziamento--;
        if(turniPotenziamento==0){
            critChance-=30;
        }
        return turniPotenziamento;
    }
    @Override
    public int attacco(Personaggio nemico){
        int danno=getAtk()*3-nemico.getDef()*2;
        if(Math.random()*100+1<critChance){
            danno*=2;
        }
        if(danno<=0){
            danno=1;
        }
        return danno;
    }
    public void mossaSpeciale(){
        critChance+=30;
        turniPotenziamento=2;
    }
    @Override
    public String toString() {
        return "Ladro{" + "critChance=" + critChance + '}';
    }
}   
