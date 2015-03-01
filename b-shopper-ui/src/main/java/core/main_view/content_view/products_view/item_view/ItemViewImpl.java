package core.main_view.content_view.products_view.item_view;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by Mohammed Matar
 * Creation Date 2/27/15.
 */
public class ItemViewImpl extends VerticalLayout {
private static final String
		VIEW_WIDTH= "250px",
		VIEW_STYLE_NAME= "item-view",
		TITLE_TXT=  "Unknown Item",
		DETAILS_TXT= "som details about product ...",
		ELEMENT_WIDTH= "322px",
		ELEMENT_STYLE_NAME= "item-label-text",
		PX= "px"
				;
private static final int VIEW_HEIGHT= 300;
{initRoot();initComponents();}
private void initRoot(){setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT + PX);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){
	initTitle();initPicture();initDetails();
	initButtons();
}
private void initTitle(){
	title=  new Label(TITLE_TXT);
	title.setWidth("100%");title.setHeight("50px");
	title.setStyleName(ELEMENT_STYLE_NAME);
	title.addStyleName("item-title");
	addComponent(title);
}
private void initPicture(){
	picture=    new Image();
	picture.setSource(new ThemeResource("res/images/bg.jpg"));
	picture.setHeight("100%");
	picture.setWidth("100%");
	picture.addStyleName("item-picture");
	addComponent(picture);
	setExpandRatio(picture, 1f);
}
private void initDetails(){
	details=    new Label(DETAILS_TXT);
//	details.setWidth(VIEW_WIDTH);
	details.setHeight("30px");
	details.setStyleName(ELEMENT_STYLE_NAME);
	details.addStyleName("item-details");
//	details.addStyleName(ValoTheme.LABEL_LIGHT);
	addComponent(details);
}
private void initButtons(){
	add= new Button(FontAwesome.PLUS_CIRCLE);
	about= new Button(FontAwesome.EXCLAMATION_CIRCLE);

	buttons = new HorizontalLayout(add, about);
	buttons.setMargin(true);
	buttons.setWidth(ELEMENT_WIDTH);
	buttons.setHeight("20px");
	buttons.addStyleName("item-buttons");
	addComponents(buttons);
}
private Label title, details;
private Image picture;
private Button add, about;
private HorizontalLayout buttons;
}
