
public class FootballPlayer extends Player{

    private int playerNumber;
    private String position;
    
    public void setPlayerNumber(int n){
        this.playerNumber = n;
    }
    public int getPlayerNumber(){
        return this.playerNumber;
    }
    
    
    public void setPosition(String p){
        this.position = p;
    }
    public String getPosition(){
        return this.position;
    }
    
    
    
    public boolean isSameTeam(FootballPlayer p){
        return this.getTeam().equals(p.getTeam());
    }
    
    
    public boolean isSamePosition(FootballPlayer p){
        return this.position.equals(p.position) && (this.getTeam().equals(p.getTeam()));
    }
}
