
public abstract class Player {
    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;
//  --------------setter
    public void setHP(double HP){
        if (HP >= 0){
            this.HP = HP;
        }else{
            this.HP = 0.0;
        }
    }
    public void setMP(double MP){
        this.MP = MP;
    }
    public void setEXP(double EXP){
        this.EXP = EXP;
    }
    public void setMoney(double Money){
        this.Money = Money;
    }
    public void setATK(double ATK){
        this.ATK = ATK;
    }
//    --------------getter
    public double getHP(){
        return this.HP;
    }
    public double getMP(){
        return this.MP;
    }
    public double getEXP(){
        return this.EXP;
    }
    public double getMoney(){
        return this.Money;
    }
    public double getATK(){
        return this.ATK;
    }
//    -----------------------
    
    
    @Override
    public String toString(){
        return "HP : " + this.getHP() + "MP : " + this.getMP() + "ATK : " + this.getATK();
    }
    public abstract void attack(Player p);
    public abstract void attacked(double n);
}
