package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;
import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.KeyIdentifier;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.menu.MenuItem;
import com.smartgwt.client.widgets.menu.MenuItemIfFunction;
import com.smartgwt.client.widgets.menu.MenuItemStringFunction;
import com.smartgwt.client.widgets.menu.events.ClickHandler;

public class UIMenuItem
	extends Widget
	implements HasWidgets, UIMasquerade<MenuItem>
{

	@Override
	public void add(Widget w) {
		if (w!=null && w instanceof UIMenu){
			this.menuItem.setSubmenu((UIMenu) w);
		}
	}

	@Override
	public void clear() {}

	@Override
	public Iterator<Widget> iterator() {
		ArrayList<Widget> wx = new ArrayList<Widget>();
		wx.add(this.menuItem.getSubmenu());
		return wx.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		return HasWidgetsUtil.remove(this, w);
	}

	public HandlerRegistration addClickHandler(ClickHandler handler){
		return this.menuItem.addClickHandler(handler);
	}

	public void setChecked(Boolean checked){
		this.menuItem.setChecked(checked);
	}

	public void setCheckIfCondition(MenuItemIfFunction checkIf){
		this.menuItem.setCheckIfCondition(checkIf);
	}

	public void setDynamicIconFunction(MenuItemStringFunction handler){
		this.menuItem.setDynamicIconFunction(handler);
	}

	public void setDynamicTitleFunction(MenuItemStringFunction handler){
		this.menuItem.setDynamicTitleFunction(handler);
	}

	public void setEnabled(Boolean enabled){
		this.menuItem.setEnabled(enabled);
	}

	public void setEnableIfCondition(MenuItemIfFunction enableIf){
		this.menuItem.setEnableIfCondition(enableIf);
	}

	public void setIcon(String icon){
		this.menuItem.setIcon(icon);
	}

	public void setIconHeight(int iconHeight){
		this.menuItem.setIconHeight(iconHeight);
	}

	public void setIconWidth(int iconWidth){
		this.menuItem.setIconWidth(iconWidth);
	}

	public void setIsSeparator(Boolean isSeparator){
		this.menuItem.setIsSeparator(isSeparator);
	}

	public void setKeys(KeyIdentifier... keys){
		this.menuItem.setKeys(keys);
	}

	public void setKeyTitle(String keyTitle){
		this.menuItem.setKeyTitle(keyTitle);
	}

	public void setSubmenu(Menu submenu){
		this.menuItem.setSubmenu(submenu);
	}

	public void setTitle(String title){
		this.menuItem.setTitle(title);
	}

	@Override
	public MenuItem getSmartObject() {
		return this.menuItem;
	}

	final protected MenuItem menuItem=new MenuItem();
}
