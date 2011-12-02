package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.toolbar.ToolStripMenuButton;

public class UIToolStripMenuButton
	extends ToolStripMenuButton
	implements HasWidgets
{
	@Override
	public void add(Widget w) {
		super.setMenu((Menu)w);
        scClassName = "ToolStripMenuButton";
	}
	
	@Override
	public boolean remove(Widget w) {
		if (w==super.getMenu()){
			super.setMenu(null);
			return true;
		}
		return false;
	}

	@Override
	public Iterator<Widget> iterator() {
		return HasWidgetsUtil.iterator(this);
	}
}
