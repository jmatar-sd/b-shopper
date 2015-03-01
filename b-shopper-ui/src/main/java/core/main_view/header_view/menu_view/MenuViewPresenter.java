package core.main_view.header_view.menu_view;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import core.MyUI;
import core.main_view.content_view.ContentViewImpl;
import core.products_manager.ProductsManagerViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class MenuViewPresenter implements MenuView.MenuViewButtonListener{
private MenuViewImpl view;
private MenuViewModel model;

public MenuViewPresenter(MenuViewModel model, MenuViewImpl view){
	this.model= model;this.view=    view;
	view.addButtonListener(this);
}

@Override
public void buttonClick (Button.ClickEvent event) {
	removeAttachedComponents(productsManagerView, homeView);
	if(event.getButton().equals(view.getHome()))
	{goHome();}
	else if(event.getButton().equals(view.getUsers()))
	{goUsers();}
	else if(event.getButton().equals(view.getSettings()))
	{goSettings();}
	else if(event.getButton().equals(view.getGitHub()))
	{goGitHub();}
}
private void goHome(){
	homeView=   MyUI.getMainView().getContentView();
	setCurrent(homeView);
}
private void goUsers(){

}
private void goSettings(){
	productsManagerView=    MyUI.getMainView().getProductsManagerView();
	setCurrent(productsManagerView);
}
private void goGitHub(){

}
private void removeAttachedComponents(Component... components){
	for (Component component:components){try{if(component.isAttached()){component.setVisible(false);MyUI.getMainView().removeComponent(component);}}
	catch (NullPointerException ex){}}
}
private ProductsManagerViewImpl productsManagerView;
private ContentViewImpl         homeView;
private Component               current;
public Component getCurrent () {
	return current;
}

public void setCurrent (Component current) {
	this.current = current;
	MyUI.getMainView().addComponent(getCurrent());
	MyUI.getMainView().setExpandRatio(getCurrent(), MyUI.getMainView().EXPAND_RATIO);
	if(!getCurrent().isVisible()) {
		getCurrent().setVisible(true);
	}
}
}
