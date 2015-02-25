package core.main_view.header_view.menu_view;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class MenuViewImpl extends HorizontalLayout{
private static final String
		VIEW_WIDTH= "250px",
		VIEW_HEIGHT= "80px",
		VIEW_STYLE_NAME= "menu-view"
				;
{initRoot();initComponents();}
private void initRoot(){setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){
	initButtons();
}
private void initButtons(){
	home= new Button(FontAwesome.HOME);
	settings= new Button(FontAwesome.GEARS);
	users= new Button(FontAwesome.USERS);
	gitHub= new Button(FontAwesome.GITHUB_ALT);
	addComponents(home, users, settings, gitHub);
}
private Button
		home,
		settings,
		users,
		gitHub;

}
