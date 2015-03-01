package core.main_view.header_view.menu_view;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class MenuViewImpl extends HorizontalLayout implements MenuView, Button.ClickListener{
private static final String
		VIEW_WIDTH= "250px",
		VIEW_HEIGHT= "50px",
		VIEW_STYLE_NAME= "menu-view"
				;
private List<MenuViewButtonListener> listeners
		= new ArrayList<>();
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
	home.addClickListener(this);
	settings.addClickListener(this);
	users.addClickListener(this);
	gitHub.addClickListener(this);
}
private Button
		home,
		settings,
		users,
		gitHub;

public Button getHome () {
	return home;
}

public Button getSettings () {
	return settings;
}

public Button getUsers () {
	return users;
}

public Button getGitHub () {
	return gitHub;
}

@Override
public void addButtonListener (MenuViewButtonListener listener) {listeners.add(listener);}
@Override
public void buttonClick (Button.ClickEvent event) {for (MenuViewButtonListener listener:listeners)listener.buttonClick(event);}
}
