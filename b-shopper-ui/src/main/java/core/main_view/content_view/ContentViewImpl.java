package core.main_view.content_view;

import com.vaadin.ui.HorizontalSplitPanel;
import core.main_view.content_view.products_view.ProductsViewImpl;
import core.main_view.content_view.shhopping_cart_view.ShoppingCartViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class ContentViewImpl extends HorizontalSplitPanel{
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "content-view"
				;
{initRoot();initComponents();}
private void initRoot()
{setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){
	initProductsView();initShoppingCartView();setSplitPosition(80f);
}
private void initProductsView(){
	productsView= new ProductsViewImpl();
	setFirstComponent(productsView);
}
private void initShoppingCartView(){
	shoppingCartView= new ShoppingCartViewImpl();
	setSecondComponent(shoppingCartView);

}

private ProductsViewImpl productsView;
private ShoppingCartViewImpl shoppingCartView;
}
