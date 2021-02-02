/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Container {

	private int content;
	private final int maxContent;

	public Container() {
		this.content = 0;
		this.maxContent = 100;
	}

	public void add(int amount) {
		amount = Integer.max(amount, 0);
		content += amount;
		content = Integer.min(content, 100);
	}

	public void remove(int amount) {
		amount = Integer.max(amount, 0);
		content -= amount;
		content = Integer.max(content, 0);
	}

	public void moveTo(Container other, int amount) {
		amount = Integer.max(amount, 0);
		int toMove = Integer.min(content, amount);
		remove(toMove);
		other.add(toMove);
	}

	public int contains() {
		return content;
	}

	@Override
	public String toString() {
		return content + "/" + maxContent;
	}

}
