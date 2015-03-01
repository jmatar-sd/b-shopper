package core.products_manager.menu_panel_view.menu_view;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;

/**
 * Created by Mohammed Matar
 * Creation Date 2/27/15.
 */
public class MenuViewImpl extends FormLayout {
private static final String ITEMS_NO_TXT= "SELECTED ITEMS ",
		TOTAL_TXT= "TOTAL  ",
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "summary-view";

public MenuViewImpl () {
	super();
	setStyleName(VIEW_STYLE_NAME);
}

{initRoot();initComponents();}
private void initRoot(){
	setWidth(VIEW_WIDTH);
	setMargin(true);
}
private void initComponents(){
	initLogo();initItemsNO();initTotal();
}
private void initItemsNO(){
	itemsNO = new Label();
	itemsNO.setCaption(ITEMS_NO_TXT);
	itemsNO.setWidth(VIEW_WIDTH);
	addComponent(itemsNO);
	setComponentAlignment(itemsNO, Alignment.MIDDLE_CENTER);
}
private void initTotal(){
	total = new Label();
	total.setCaption(TOTAL_TXT);
	addComponent(total);
	setComponentAlignment(total, Alignment.MIDDLE_CENTER);
}

private void initLogo(){
	logo= new Label(FontAwesome.SHOPPING_CART.getHtml(), ContentMode.HTML);
	logo.setCaption("Perfume Store ");
	logo.setStyleName("logo");
	logo.setWidth(VIEW_WIDTH);
	addComponent(logo);
}
private Label logo;
private Label itemsNO, total;
}
