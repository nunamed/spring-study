package observer;

import java.util.Observable;
import java.util.Observer;

public class TaoBaoObserver implements Observer {

	@Override
	public void update(Observable o, Object product) {
		// TODO Auto-generated method stub
		String newProduct = (String) product;
		System.err.println("发送新产品【"+newProduct+"】同步到淘宝商城");
	}
	public static void main(String[] args) {
		ProductList observable = ProductList.getInstance();
		TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
		JingDongObserver jdobserver = new JingDongObserver();
		observable.addProductListObserver(jdobserver);
		observable.addProductListObserver(taoBaoObserver);
		observable.addProduct("新增产品");
		observable.addProduct("新增产品1");
		observable.addProduct("新增产品2");
		observable.addProduct("新增产品3");
	}
}
