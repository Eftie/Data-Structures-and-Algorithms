	//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap {
	private List<Integer> list;

	public Heap() {
		list = new ArrayList<Integer>();
	}

	public void add(int value) {
		list.add(value);
		swapUp(list.size() - 1);
	}

	public void swapUp(int bot) {
		while (bot > 0) {
			int parent = (bot - 1)/2;
			if (list.get(parent) < list.get(bot)) {
				swap(parent, bot);
				bot = parent;
				System.out.println(list);
			} else {
				break;
			}
		}
	}

	public void remove() {
		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		swapDown(list.size());
	}

	public void swapDown(int top) {
		int root = list.get(0);

		while (root < list.size() - 1) {
			int max = list.get(0);
			int max_index = 0;
			for (int i = 1; i < list.size() - 1; i++) {
				if (max < list.get(i)) {
					max = list.get(i);
					max_index = i;
				}
			}

			if (max > list.get(root)) {
				int temp = list.get(root);
				list.set(root, max);
				list.set(max_index, temp);
				root = list.get(0);
			}
		}
	}

	private void swap(int start, int finish) {
		int temp = list.get(finish);
		list.set(finish, list.get(start));
		list.set(start, temp);
	}

	public void print() {
		out.println("\n\nPRINTING THE HEAP!");
		out.println(toString());
	}

	public String toString() {
		return list.toString();
	}
}