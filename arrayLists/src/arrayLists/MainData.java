package arrayLists;

import java.util.ArrayList;

public class MainData {
	public ArrayList<CartItem> cart;
	public CartItem cartItem1;
	public CartItem cartItem2;

	public MainData(ArrayList<CartItem> cart, CartItem cartItem1, CartItem cartItem2) {
		this.cart = cart;
		this.cartItem1 = cartItem1;
		this.cartItem2 = cartItem2;
	}
}