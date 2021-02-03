package cz.vutbr.feec.cviko5;

public class Tree {
	private Objects top = null;

	public Tree() {
		super();
	}

	// add to tree
	public void add2Tree(int number) {
		Objects tmp = top;
		Objects tmp2 = top;
		if (tmp == null) {
			Objects o = new Objects(number);
			top = o;
		} else {
			// int help = tmp.getNumber();
			while (true) {
				if (number < tmp.getNumber()) {
					tmp2 = tmp;
					tmp = tmp.getLeft();
					if (tmp == null) {
						Objects o = new Objects(number);
						o.setParent(tmp2);
						tmp2.setLeft(o);
						break;
					}
				} else if (number > tmp.getNumber()) {
					tmp2 = tmp;
					tmp = tmp.getRight();
					if (tmp == null) {
						Objects o = new Objects(number);
						o.setParent(tmp2);
						tmp2.setRight(o);
						break;
					}
				} else {
					System.out.println(number + " exist in tree");
					break;
				}
			}
		}
	}

	public boolean find(int number) {
		Objects tmp = top;
		if (tmp == null) {
			System.out.println("tree is empty");
			return false;
		} else {
			while (tmp != null) {
				if (tmp.getNumber() == number) {
					System.out.println(number + " is in tree");
					return true;
				} else {
					if (number < tmp.getNumber()) {
						tmp = tmp.getLeft();
					}
					else if (number > tmp.getNumber()) {
						tmp = tmp.getRight();
					}
				}
			}
			System.out.println(number + " is not in tree");
			return false;
		}
	}

	public Objects getTop() {
		return top;
	}

	public void setTop(Objects top) {
		this.top = top;
	}

}
