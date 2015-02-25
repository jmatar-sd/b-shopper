package core.main_view;

import com.vaadin.ui.VerticalLayout;
import core.main_view.content_view.ContentViewImpl;
import core.main_view.header_view.HeaderView;
import core.main_view.header_view.HeaderViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class MainViewImpl extends VerticalLayout {
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "main-view"
				;

{initRoot();initComponents();}
private void initRoot(){setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){initHeaderView();initContentView();}
private void initHeaderView(){
	headerView = new HeaderViewImpl();
	addComponent(headerView);
}
private void initContentView(){
	contentView= new ContentViewImpl();
	addComponent(contentView);
	setExpandRatio(contentView, 2f);
}
private ContentViewImpl contentView;
private HeaderViewImpl headerView;
}
