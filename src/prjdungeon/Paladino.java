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
    Personaggio p;
    int energiaDivina;
    
    public Paladino(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range, int energiaDivina){
        super(nome, pos, atk, def, hp, maxHp, range);
        this.energiaDivina=energiaDivina;
    }
}
