/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author muhamed.ibraimi
 */
public class Necromante extends Nemici{
    int nMorti;
    NonMorti[] NonMorti;

    public Necromante( boolean isBoss, String nome, int[] pos, int atk, int def, int hp, int maxHp, double range) {
        super(nome, pos, atk, def, hp, maxHp, range, isBoss);
        nMorti = 0;
    }
    


    public void InvocazioneMorti(){
        setHp(getHp()-8);
        if(true==super.isVivo()){
            nMorti++;
            setAtk(getAtk()+nMorti*2);
        }
    }
    
    public void InvocazioneOrdaMorti(){
        setHp(getHp()-33);
        if(true==super.isVivo()){
            nMorti+=5;
            setAtk(getAtk()+nMorti*3);
        }
    }
    
    private boolean ControlloNonMortoisVivo(){
        boolean vivo= true;
        for(int i=0;i<nMorti; i++){
            if(NonMorti[i].isVivo()){
               nMorti--; 
            }
        }
        return vivo;
    }


    @Override
    public String toString() {
        return "Necromante{" + "nMorti=" + nMorti + '}';
    }

}

