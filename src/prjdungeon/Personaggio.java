package prjdungeon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhamed.ibraimi
 */
public class Personaggio {
    private String nome;
    private int hp,atk,def;
    private double range;
    private int[] pos;
    
    public Personaggio(String nome, int hp,int atk,int def, int[] pos, double range){
       this.nome= nome;
       this.hp=hp;
       this.atk= atk;
       this.def=def;
       for(int i = 0; i<pos.length;i++){
        this.pos[i]=pos[i];   
       }
       this.range=range;
    }
    private boolean isVivo(){
        boolean vivo = true;
        if(hp<=0){
            vivo = false;
        }
       return vivo;
    }
    public int attacco(Personaggio nemico){
        int danno = atk*4-nemico.def;
        if (nemico.isVivo()){
            if(danno<=0){
                danno=1;
            }
            nemico.hp-=danno;
        }
        return danno;
    }
}
