package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public class UITabSet extends TabSet implements HasWidgets {

	@Override
	public void add(Widget w) {
		if (w instanceof UITab)
			super.addTab(((UITab) w).tab);
		else
			super.addChild(w);
	}

	@Override
	public Iterator<Widget> iterator() {
		return HasWidgetsUtil.iterator(this);
	}

	@Override
	public boolean remove(Widget w) {
		return HasWidgetsUtil.remove(this, w);
	}


	/**
	 * BUG ON IE, trying resolve here
	 */
	@Override
	public void destroy() {
		for(Tab tab : getTabs()) {
			Canvas tabPane = tab.getPane();
			if(tabPane != null) {
				tabPane.destroy();
			}
		}
		super.destroy();
	}
	
	/**
	 * @param value
	 * @throws IllegalStateException
	 * @see Side
	 */
	public void setTabBarPosition(String value) throws IllegalStateException {
		Side tabBarPosition = Side.valueOf(value.toUpperCase());
		if(tabBarPosition != null) {
			super.setTabBarPosition(tabBarPosition);
		}
	}

	/**
	 * @see Side 
	 */
	public void setTabBarAlign(String value) throws IllegalStateException {
		Side tabBarAlign = Side.valueOf(value.toUpperCase());
		if(tabBarAlign != null) {
			super.setTabBarAlign(tabBarAlign);
		}
	}
}
