package core.main_view.content_view.shhopping_cart_view;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class ShoppingCartViewImpl extends VerticalLayout{
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "shopping-cart-view"
				;
{initRoot();initComponents();}
private void initRoot(){setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){
	initLogo();
}

private void initLogo(){
	logo= new Label("<center>"+FontAwesome.SHOPPING_CART.getHtml()+"</center>", ContentMode.HTML);
	setWidth(VIEW_WIDTH);
	setHeight("80px");
	setStyleName("logo");
	addComponent(logo);
}
private Label logo;
}
