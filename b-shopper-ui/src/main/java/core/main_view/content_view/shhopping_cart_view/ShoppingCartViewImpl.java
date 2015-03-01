package core.main_view.content_view.shhopping_cart_view;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import core.main_view.content_view.shhopping_cart_view.summary_view.SummaryView;
import core.main_view.content_view.shhopping_cart_view.summary_view.SummaryViewImpl;

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
private void initRoot(){setWidth(VIEW_WIDTH);/*setHeight(VIEW_HEIGHT);*/setStyleName(VIEW_STYLE_NAME);setMargin(true    );}
private void initComponents(){

	initSummaryView();
}


private void initSummaryView(){
	summaryView= new SummaryViewImpl();
	summaryView.setWidth(VIEW_WIDTH);
	addComponent(summaryView);
}

private SummaryViewImpl summaryView;
}
