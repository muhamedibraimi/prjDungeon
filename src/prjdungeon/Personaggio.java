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
    private int[]pos;
    private int atk;
    private int def;
    private int hp;
    private int maxHp;
    private double range;

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }
    
    public Personaggio(String nome, int[] pos, int atk, int def, int hp, int maxHp, double range) {
        this.nome = nome;
        this.pos = pos;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.maxHp = maxHp;
        this.range = range;
    }
    public int attacco(Personaggio nemico){
        int danno=atk*3-nemico.getDef()*2;
        if(danno<=0){
            danno=1;
        }
        return danno;
    }
    public void movimento(int x, int y){
        pos[0]+=x;
        pos[1]+=y;
    }
    private boolean isVivo(){
        boolean vivo=false;
        if(hp>0){
            vivo=true;
        }
        return vivo;
    }
    public boolean subisciDanno(int danno){
        hp-=danno;
        return isVivo();
    }

    @Override
    public String toString() {
        return "Personaggio{" + "nome=" + nome + ", pos=" + pos[0] +";"+pos[1]+ ", atk=" + atk + ", def=" + def + ", hp=" + hp + ", maxHp=" + maxHp + ", range=" + range + '}';
    }
    
    
}

