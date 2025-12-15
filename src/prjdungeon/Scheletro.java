/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author muhamed.ibraimi
 */
public class Scheletro extends Nemici {
    private int nRigenerazioni;
    public Scheletro(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range, boolean isBoss) {
        super(nome, pos, atk, def, hp, maxHp, range, isBoss);
        nRigenerazioni=0;
    }
public void rigenerazione(){
    if (nRigenerazioni==0){
        setHp(getHp()+100);
    }
    nRigenerazioni++;
}
public void potenziamento(int incremento){
   setDef(getDef()+incremento);
}
public void abilita(){
    setAtk(getAtk()*2);
}
}

