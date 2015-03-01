package core.products_manager;

import com.vaadin.ui.HorizontalSplitPanel;
import core.products_manager.content_panel_view.ContentPanelViewImpl;
import core.products_manager.menu_panel_view.MenuPanelViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/28/15.
 */
public class ProductsManagerViewImpl extends HorizontalSplitPanel{
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "products-manager-view"
				;
{initRoot();initComponents();}
private void initRoot()
{setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){
	initContentPanel();initMenuPanel();setSplitPosition(70f);
}
private void initContentPanel(){
	contentPanelView = new ContentPanelViewImpl();
	setFirstComponent(contentPanelView);
}
private void initMenuPanel(){
	menuPanelView=  new MenuPanelViewImpl();
	setSecondComponent(menuPanelView);
}
private ContentPanelViewImpl contentPanelView;
private MenuPanelViewImpl    menuPanelView;
}
