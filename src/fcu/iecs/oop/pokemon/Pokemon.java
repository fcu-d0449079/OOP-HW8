package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {
	private String Nickname;
	private int cp;
	private PokemonType type;
	
	public String getNickname(){
		return Nickname;
	} 
	public int getcp(){
		return cp;
	} 
	public PokemonType getype(){
		return type;
	} 
	public void setNickname(String Nickname){
		this.Nickname = Nickname;
	}
	public void setcp(int cp){
		this.cp = cp;
	}
}
