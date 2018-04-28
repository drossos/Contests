

public class MapNode {
	public int nodeName;
	public int edgeValue;
	
	public MapNode(int nodeName, int edgeValue) {
		super();
		this.nodeName = nodeName;
		this.edgeValue = edgeValue;
	}
	
	public MapNode(int nodeName) {
		super();
		this.nodeName = nodeName;
		this.edgeValue = 1;
	}
	
	
}
