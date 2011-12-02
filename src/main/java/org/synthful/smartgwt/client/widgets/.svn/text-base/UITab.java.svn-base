package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.synthful.smartgwt.client.HasWidgetsUtil;
import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public class UITab extends Widget implements HasWidgets, UIMasquerade<Tab> {
	final protected Tab tab;
	private Canvas canvas;

	public UITab() {
		this.tab = new Tab();
	}

	public void add(Canvas w) {
		if (this.canvas == null) {
			this.canvas = (Canvas) w;
			tab.setPane(this.canvas);
		}
	}

	@Override
	public void add(Widget w) {
		try {
			this.add((Canvas) w);
		} catch (Exception e) {
		}
	}

	@Override
	public void clear() {
	}

	@Override
	public Iterator<Widget> iterator() {
		ArrayList<Widget> wx = new ArrayList<Widget>();
		wx.add(this.canvas);
		return wx.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		return HasWidgetsUtil.remove(this, w);
	}

	public void setCloseable(boolean closeable) {
		this.tab.setCanClose(closeable);
	}

	public void setCloseIcon(String closeIcon) {
		this.tab.setCloseIcon(closeIcon);
	}

	public void setCloseIconSize(String closeIconSize) {
		try {
			int z = Integer.parseInt(closeIconSize);
			this.tab.setCloseIconSize(z);
		} catch (Exception e) {
		}
	}

	public void setDisabled(boolean disabled) {
		this.tab.setDisabled(disabled);
	}

	public void setTitle(String title) {
		this.tab.setTitle(title);
	}

	public void setWidth(String width) {
		try {
			int z = Integer.parseInt(width);
			this.tab.setWidth(z);
		} catch (Exception e) {
		}
	}

	@Override
	public Tab getSmartObject() {
		return this.tab;
	}

	public boolean equals(Object obj) {
		return tab.equals(obj);
	}

	public void fireEvent(GwtEvent<?> event) {
		tab.fireEvent(event);
	}

	public String getAttribute(String property) {
		return tab.getAttribute(property);
	}

	public Boolean getAttributeAsBoolean(String property) {
		return tab.getAttributeAsBoolean(property);
	}

	public Date getAttributeAsDate(String property) {
		return tab.getAttributeAsDate(property);
	}

	public Double getAttributeAsDouble(String property) {
		return tab.getAttributeAsDouble(property);
	}

	public Float getAttributeAsFloat(String property) {
		return tab.getAttributeAsFloat(property);
	}

	public Integer getAttributeAsInt(String property) {
		return tab.getAttributeAsInt(property);
	}

	public int[] getAttributeAsIntArray(String property) {
		return tab.getAttributeAsIntArray(property);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String property) {
		return tab.getAttributeAsJavaScriptObject(property);
	}

	public Map getAttributeAsMap(String property) {
		return tab.getAttributeAsMap(property);
	}

	public Object getAttributeAsObject(String property) {
		return tab.getAttributeAsObject(property);
	}

	public String getAttributeAsString(String property) {
		return tab.getAttributeAsString(property);
	}

	public String[] getAttributeAsStringArray(String property) {
		return tab.getAttributeAsStringArray(property);
	}

	public String[] getAttributes() {
		return tab.getAttributes();
	}

	public Boolean getCanClose() {
		return tab.getCanClose();
	}

	public String getCloseIcon() {
		return tab.getCloseIcon();
	}

	public Menu getContextMenu() {
		return tab.getContextMenu();
	}

	public Boolean getDisabled() {
		return tab.getDisabled();
	}

	public int getHandlerCount(Type<?> type) {
		return tab.getHandlerCount(type);
	}

	public String getIcon() {
		return tab.getIcon();
	}

	public String getID() {
		return tab.getID();
	}

	public JavaScriptObject getJsObj() {
		return tab.getJsObj();
	}

	public Canvas getPane() {
		return tab.getPane();
	}

	public String getPickerTitle() {
		return tab.getPickerTitle();
	}

	public TabSet getTabSet() {
		return tab.getTabSet();
	}

	public String getTitle() {
		return tab.getTitle();
	}

	public int getWidth() {
		return tab.getWidth();
	}

	public int hashCode() {
		return tab.hashCode();
	}

	public void setAttribute(String property, BaseClass value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseClass[] value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, boolean value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, Boolean value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass[] value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, Date value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, double value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, Double value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, Float value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, int value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, int[] value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, Integer value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, JavaScriptObject value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, Map value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, Object value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, String value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, String[] value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum value) {
		tab.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum[] value) {
		tab.setAttribute(property, value);
	}

	public void setCanClose(boolean canClose) {
		tab.setCanClose(canClose);
	}

	public void setCloseIconSize(int closeIconSize) {
		tab.setCloseIconSize(closeIconSize);
	}

	public void setContextMenu(Menu contextMenu) {
		tab.setContextMenu(contextMenu);
	}

	public void setIcon(String icon) {
		tab.setIcon(icon);
	}

	public void setID(String ID) {
		tab.setID(ID);
	}

	public void setJsObj(JavaScriptObject jsObj) {
		tab.setJsObj(jsObj);
	}

	public void setPane(Canvas pane) {
		tab.setPane(pane);
	}

	public void setPaneID(String paneID) {
		tab.setPaneID(paneID);
	}

	public void setPickerTitle(String pickerTitle) {
		tab.setPickerTitle(pickerTitle);
	}

	public void setTabSet(TabSet tabSet) {
		tab.setTabSet(tabSet);
	}

	public void setWidth(int width) {
		tab.setWidth(width);
	}

	public String toString() {
		return tab.toString();
	}

}
