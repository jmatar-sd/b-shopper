package core.products_manager.menu_panel_view.menu_view;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.*;

/**
 * Created by Mohammed Matar
 * Creation Date 2/27/15.
 */
public class MenuViewImpl extends CssLayout {
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "settings-pm-menu-view";

public MenuViewImpl () {
	super();
	setStyleName(VIEW_STYLE_NAME);
}
{initRoot();initComponents();}
private void initRoot(){
	setWidth(VIEW_WIDTH);
}
private void initComponents(){initButtons();}
private void initButtons(){
	addButton=  new Button(FontAwesome.PLUS);
	editButton= new Button(FontAwesome.EDIT);
	deleteButton= new Button(FontAwesome.TRASH_O);
	queryButton= new Button(FontAwesome.SEARCH);
	addComponents(addButton, editButton, deleteButton, queryButton);
}
private Button addButton, editButton, deleteButton, queryButton;
}
