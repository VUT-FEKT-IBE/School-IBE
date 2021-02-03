package cz.vutbr.feec.cviko4;

public class ListOf {
	private Objects first = null;

	public ListOf() {
	}

	public void add2Start(int number) {
		Objects o = new Objects(number, first);
		first = o;
	}

	public void removeFromStart() {
		first = first.getNext();
	}

	public boolean include(int number) {
		Objects tmp = first;
		while (tmp != null) {
			if (tmp != null) {
				if (tmp.getNumber() == number) {
					System.out.print(number + " is in list \n");
					return true;
				} else {
					tmp = tmp.getNext();
				}
			} 

		}
		System.out.print(number + " in not in the list \n");
		return false;

	}

	public Objects getFirst() {
		return first;
	}

	public void setFirst(Objects first) {
		this.first = first;
	}

	@Override
	public String toString() {
		return "ListOf [first=" + first + "]";
	}

}
