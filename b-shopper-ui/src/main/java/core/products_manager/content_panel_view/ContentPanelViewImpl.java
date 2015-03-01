package core.products_manager.content_panel_view;

import com.vaadin.ui.FormLayout;

/**
 * Created by Mohammed Matar
 * Creation Date 2/28/15.
 */
public class ContentPanelViewImpl extends FormLayout{
private static final String
		VIEW_WIDTH= "100%",
		VIEW_HEIGHT= "100%",
		VIEW_STYLE_NAME= "content-panel-view"
				;
{initRoot();initComponents();}
private void initRoot()
{setWidth(VIEW_WIDTH);setHeight(VIEW_HEIGHT);setStyleName(VIEW_STYLE_NAME);}
private void initComponents(){

}
}
