package core.products_manager.menu_panel_view;

import com.vaadin.ui.VerticalLayout;
import core.products_manager.menu_panel_view.menu_view.MenuView;
import core.products_manager.menu_panel_view.menu_view.MenuViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/28/15.
 */
public class MenuPanelViewImpl extends VerticalLayout{
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "menu-panel-view"
				;
{initRoot();initComponents();}
private void initRoot()
{setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){
initMenuView();
}
private void initMenuView(){
	menuView=   new MenuViewImpl();
	menuView.setWidth(VIEW_WIDTH);
	addComponent(menuView);
}
private MenuViewImpl menuView;
}
