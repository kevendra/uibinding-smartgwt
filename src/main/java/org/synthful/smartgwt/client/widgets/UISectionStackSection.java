package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
import com.smartgwt.client.widgets.layout.SectionHeader;
import com.smartgwt.client.widgets.layout.SectionStack;
import com.smartgwt.client.widgets.layout.SectionStackSection;

public class UISectionStackSection extends Widget implements HasWidgets, UIMasquerade<SectionStackSection>{

	SectionStackSection field ;


	@Override
	public void add(Widget w) {
		if (w instanceof UISectionStackSectionControls){
			Canvas[] controls = ((UISectionStackSectionControls)w).toArray();
			field.setControls(controls);
		} else if (w instanceof Canvas){
			field.addItem((Canvas) w);
		}
	}

	@Override
	public void clear() {
	}
	
	@Override
	public Iterator<Widget> iterator() {
		Canvas[] fields = field.getItems();
		List<Widget> itens = new LinkedList<Widget>();
		if(fields ==null){
			return itens.iterator();
		}
		for(int i=0;i<fields.length;i++){
			itens.add(fields[i]);
		}
		return itens.iterator();
	}
	@Override
	public SectionStackSection getSmartObject() {
		return field;
	}
	@Override
	public boolean remove(Widget w) {
		return false;
	}
	
	public void addItem(Canvas item) {
		field.addItem(item);
	}

	public boolean equals(Object arg0) {
		return field.equals(arg0);
	}

	public void fireEvent(GwtEvent<?> event) {
		field.fireEvent(event);
	}

	public String getAttribute(String property) {
		return field.getAttribute(property);
	}

	public Boolean getAttributeAsBoolean(String property) {
		return field.getAttributeAsBoolean(property);
	}

	public Date getAttributeAsDate(String property) {
		return field.getAttributeAsDate(property);
	}

	public Double getAttributeAsDouble(String property) {
		return field.getAttributeAsDouble(property);
	}

	public Float getAttributeAsFloat(String property) {
		return field.getAttributeAsFloat(property);
	}

	public Integer getAttributeAsInt(String property) {
		return field.getAttributeAsInt(property);
	}

	public int[] getAttributeAsIntArray(String property) {
		return field.getAttributeAsIntArray(property);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String property) {
		return field.getAttributeAsJavaScriptObject(property);
	}

	@SuppressWarnings("unchecked")
	public Map getAttributeAsMap(String property) {
		return field.getAttributeAsMap(property);
	}

	public Object getAttributeAsObject(String property) {
		return field.getAttributeAsObject(property);
	}

	public String getAttributeAsString(String property) {
		return field.getAttributeAsString(property);
	}

	public String[] getAttributeAsStringArray(String property) {
		return field.getAttributeAsStringArray(property);
	}

	public String[] getAttributes() {
		return field.getAttributes();
	}

	public int getHandlerCount(Type<?> type) {
		return field.getHandlerCount(type);
	}

	public String getID() {
		return field.getID();
	}

	public Canvas[] getItems() {
		return field.getItems();
	}

	public JavaScriptObject getJsObj() {
		return field.getJsObj();
	}

	public String getName() {
		return field.getName();
	}

	public SectionHeader getSectionHeader() {
		return field.getSectionHeader();
	}

	public SectionStack getSectionStack() {
		return field.getSectionStack();
	}

	public String getTitle() {
		return field.getTitle();
	}

	public int hashCode() {
		return field.hashCode();
	}

	public void setAttribute(String property, BaseClass value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseClass[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, boolean value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Boolean value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Date value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, double value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Double value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Float value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, int value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, int[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Integer value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, JavaScriptObject value) {
		field.setAttribute(property, value);
	}

	@SuppressWarnings("unchecked")
	public void setAttribute(String property, Map value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Object value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, String value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, String[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum[] value) {
		field.setAttribute(property, value);
	}

	public void setCanCollapse(Boolean canCollapse) {
		field.setCanCollapse(canCollapse);
	}

	public void setCanDropBefore(Boolean canDropBefore) {
		field.setCanDropBefore(canDropBefore);
	}

	public void setCanReorder(Boolean canReorder) {
		field.setCanReorder(canReorder);
	}

	public void setControls(Canvas... controls) {
		field.setControls(controls);
	}

	public void setExpanded(Boolean expanded) {
		field.setExpanded(expanded);
	}

	public void setHidden(Boolean hidden) {
		field.setHidden(hidden);
	}

	public void setID(String ID) {
		field.setID(ID);
	}

	public void setItems(Canvas... items) {
		field.setItems(items);
	}

	public void setJsObj(JavaScriptObject jsObj) {
		field.setJsObj(jsObj);
	}

	public void setName(String name) {
		field.setName(name);
	}

	public void setResizeable(Boolean resizeable) {
		field.setResizeable(resizeable);
	}

	public void setShowHeader(Boolean showHeader) {
		field.setShowHeader(showHeader);
	}

	public void setTitle(String title) {
		field.setTitle(title);
	}

	public String toString() {
		return field.toString();
	}

	public UISectionStackSection(){
		field = new SectionStackSection();
	}

}