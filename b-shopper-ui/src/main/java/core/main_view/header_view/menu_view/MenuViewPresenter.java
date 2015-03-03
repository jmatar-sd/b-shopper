package core.main_view.header_view.menu_view;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import core.MyUI;
import core.main_view.MainView;
import core.main_view.MainViewImpl;
import core.main_view.content_view.ContentViewImpl;
import core.main_view.header_view.HeaderViewImpl;
import core.products_manager.ProductsManagerViewImpl;

import static core.main_view.MainViewImpl.*;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class MenuViewPresenter implements MenuView.MenuViewButtonListener{
private MenuViewImpl view;
private MenuViewModel model;
private MainViewImpl mainView;

public MenuViewPresenter(MenuViewModel model, MenuViewImpl view){
	this.model= model;this.view=    view;this.mainView=  mainView;
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
	homeView=   ((MainViewImpl)view.getParent().getParent()).getContentView();
	setCurrent(homeView);
}
private void goUsers(){

}
private void goSettings(){
	productsManagerView=    ((MainViewImpl)view.getParent().getParent()).getProductsManagerView();
	setCurrent(productsManagerView);
}
private void goGitHub(){

}
private void removeAttachedComponents(Component... components){
	for (Component component:components){try{if(!(component instanceof HeaderViewImpl)){component.setVisible(false);((MainViewImpl)view.getParent().getParent()).removeComponent(component);}}
	catch (NullPointerException ex){}}
}
private ProductsManagerViewImpl productsManagerView;
private ContentViewImpl         homeView;
private Component               current;
public  Component getCurrent () {
	return current;
}

public void setCurrent (Component current) {
	this.current = current;
	if(!getCurrent().isVisible()) {
		getCurrent().setVisible(true);
	}
	((MainViewImpl) view.getParent().getParent()).replaceComponent(((MainViewImpl)view.getParent().getParent()).getContentView(), getCurrent());
	((MainViewImpl)view.getParent().getParent()).setExpandRatio(getCurrent(), EXPAND_RATIO);
}
}
