package core.main_view;

import com.vaadin.ui.VerticalLayout;
import core.main_view.content_view.ContentViewImpl;
import core.main_view.header_view.HeaderView;
import core.main_view.header_view.HeaderViewImpl;
import core.main_view.header_view.HeaderViewModel;
import core.main_view.header_view.HeaderViewPresenter;
import core.products_manager.ProductsManagerViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class MainViewImpl extends VerticalLayout {
public static float EXPAND_RATIO=   2f;
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "main-view"
				;
{initRoot();initComponents();}
private void initRoot(){setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){initHeaderView();initContentView();initProductsManagerView();}
private void initHeaderView(){
	headerView = new HeaderViewImpl();
	headerViewModel=    new HeaderViewModel();
	addComponent(headerView);
	new HeaderViewPresenter(headerViewModel, headerView);
}
private void initContentView(){
	contentView= new ContentViewImpl();
	addComponent(contentView);
	setExpandRatio(contentView, EXPAND_RATIO);
}
private void initProductsManagerView(){
	productsManagerView=    new ProductsManagerViewImpl();
	productsManagerView.setVisible(false);
	addComponent(productsManagerView);
	setExpandRatio(productsManagerView, EXPAND_RATIO);
	removeComponent(productsManagerView);
}
private ContentViewImpl contentView;
private HeaderViewImpl headerView;private HeaderViewModel headerViewModel;
private ProductsManagerViewImpl productsManagerView;

public ProductsManagerViewImpl getProductsManagerView () {
	return productsManagerView;
}

public ContentViewImpl getContentView () {
	return contentView;
}
}
