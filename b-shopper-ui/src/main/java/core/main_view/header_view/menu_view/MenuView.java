package core.main_view.header_view.menu_view;

import com.vaadin.ui.Button;

/**
 * Created by Mohammed Matar
 * Creation Date 2/25/15.
 */
public interface MenuView {
public interface MenuViewButtonListener{void buttonClick(Button.ClickEvent event);}
public void      addButtonListener(MenuViewButtonListener listener);
}
