package snakegame;

public class Apple {

	public int posX;
	public int posY;
	
	public Apple(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	public void setRandomPosition(){
		posX = (int) (Math.random()*SnakeGame.WIDTH);
		posY = (int) (Math.random()*SnakeGame.HEIGHT);
	}
}
