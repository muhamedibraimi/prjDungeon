/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author muhamed.ibraimi
 */
public class Paladino extends Personaggio {
    int enDivina;
    int enDivinaMax;
    
    public Paladino(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range, int energiaDivina){
        super(nome, pos, atk, def, hp, maxHp, range);
        this.enDivina=enDivina;
        enDivinaMax=energiaDivina;
    }
    
    public int attaccoDivino(Personaggio nemico){
        int danno=0;
        if(enDivina>0){
            danno=(getAtk()*3-nemico.getDef()*2)+enDivina;
            enDivina-=(enDivinaMax/2);
            if(danno<=0){
                danno=1;
            }
        }
        return danno;
    }
    public int curaDivina(){
        int hp = getHp();
        int cura = (enDivina/2);
        if(enDivina>0){
            hp+=(enDivina/2);
            enDivina-=(enDivinaMax/2);
        }
        return cura;
    }

    @Override
    public String toString() {
        String txt = super.toString() +"Paladino{" + "enDivina=" + enDivina + ", enDivinaMax=" + enDivinaMax + '}';
        return txt;
    }
    
    
    
}
