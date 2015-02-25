package core.main_view.header_view;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;
import core.main_view.header_view.menu_view.MenuViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class HeaderViewImpl extends HorizontalLayout{
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "200px",
		VIEW_STYLE_NAME= "header-view",
		TITLE_TEXT= "Perfume Store"
		;

{initRoot();initComponents();}
private void initRoot(){setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);setMargin(true);}
private void initComponents(){
	initMenuView();initTitle();
}
private void initMenuView(){
	menuView= new MenuViewImpl();
	addComponent(menuView);
}
private void initTitle(){
	title= new Label(TITLE_TEXT);
	title.setWidth("400px");
	title.setHeight(VIEW_HEIGHT);

	title.addStyleName(ValoTheme.LABEL_H1);
	addComponent(title);
	setComponentAlignment(title, Alignment.MIDDLE_RIGHT);
	setExpandRatio(title, 1f);
}
private MenuViewImpl menuView;
private Label        title;
}
