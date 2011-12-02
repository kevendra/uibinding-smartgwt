package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.menu.MenuBar;

public class UIMenuBar
	extends MenuBar
	implements HasWidgets
{

	@Override
	public void add(Widget w) {
		if (w!=null){ 
			if( w instanceof UIMenu){
				UIMenu[] mm = {(UIMenu)w};
				int position = super.getMembers().length;
				super.addMenus(mm, position);	
			}
			else if (w instanceof Canvas){
				super.addMember((Canvas)w);
			}
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		return HasWidgetsUtil.iterator(this);
	}

	@Override
	public boolean remove(Widget w) {
		return HasWidgetsUtil.remove(this, w);
	}

}
