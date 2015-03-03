package core.main_view.header_view;

import core.main_view.MainViewImpl;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public class HeaderViewPresenter {
private HeaderViewImpl view;
private HeaderViewModel model;

public       HeaderViewPresenter(HeaderViewModel model, HeaderViewImpl view){
	this.model= model;this.view= view;
}
}