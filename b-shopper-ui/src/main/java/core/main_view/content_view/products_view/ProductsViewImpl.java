package core.main_view.content_view.products_view;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;
import core.main_view.content_view.products_view.item_view.ItemViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class ProductsViewImpl extends CssLayout {
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "products-view"
				;
{initRoot();initComponents();}
private void initRoot(){setWidth(VIEW_WIDTH);setStyleName(VIEW_STYLE_NAME);addStyleName(ValoTheme.LAYOUT_CARD);addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);}
private void initComponents(){
	initSample();
}
private void initSample(){
	item = new ItemViewImpl();
	addComponent(item);
	addComponents(new ItemViewImpl());addComponents(new ItemViewImpl());addComponents(new ItemViewImpl());
}
private ItemViewImpl item;
}
