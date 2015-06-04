package behaviour.command;

import java.awt.Color;

public class Light implements ILight{
	private Color color;
	
	
	public Light() {
		super();
	}


	public Light(Color color) {
		super();
		this.color = color;
	}

	@Override
	public void setColour(Color color) {
		this.color = color;
	}
	
	public void printState(){
		if(color!=null){
			System.out.println("Estoy en "+color.toString());
		}
	}

}
