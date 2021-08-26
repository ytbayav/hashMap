package arrayLists;

public class CartItem {
	private CartItemData data = new CartItemData();

	public int getQuantity() {
		return data.quantity;
	}
	public void setQuantity(int quantity) {
		this.data.quantity = quantity;
	}
	public String getProductName() {
		return data.productName;
	}
	public void setProductName(String productName) {
		this.data.productName = productName;
	}
	public CartItem() {
		super();
	}
	public CartItem(String productName) {
		super();
		this.data.productName = productName;
	}
	
	

}
