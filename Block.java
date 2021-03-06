import java.util.*;
public class Block {
	private Integer width;
	private Integer height;
	private String size;
	ArrayList<Integer> coords;
	
	public Block(ArrayList<Integer> coords) {
		this.coords = coords;
		width = Math.abs(coords.get(2) - coords.get(0)) + 1;
		height = Math.abs(coords.get(3) - coords.get(1) - 1);
		size = Integer.toString(width) + " x " + Integer.toString(height);
	}
	
	public String getSize() {
		return size;
	}
	
	public int hashCode(){
        return coords.hashCode();
    }
     
    public boolean equals(Object obj){
        if (obj instanceof Block) {
            Block pp = (Block) obj;
            return (pp.coords.equals(this.coords));
        } else {
            return false;
        }
    }

}