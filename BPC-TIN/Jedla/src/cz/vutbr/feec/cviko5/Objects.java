package cz.vutbr.feec.cviko5;

public class Objects {
	private int number;
	private Objects left = null;
	private Objects right = null;
	private Objects parent = null;
	
	
	
	public Objects(int number) {
		super();
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Objects getLeft() {
		return left;
	}
	public void setLeft(Objects left) {
		this.left = left;
	}
	public Objects getRight() {
		return right;
	}
	public void setRight(Objects right) {
		this.right = right;
	}
	public Objects getParent() {
		return parent;
	}
	public void setParent(Objects parent) {
		this.parent = parent;
	}
	
	
	
}
