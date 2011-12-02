package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.menu.Menu;

public class UIMenu
	extends Menu
	implements HasWidgets
{

	@Override
	public void add(Widget w) {
		if (w!=null && w instanceof UIMenuItem){
			UIMenuItem mm = (UIMenuItem)w;
			super.addItem(mm.getSmartObject());	
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
