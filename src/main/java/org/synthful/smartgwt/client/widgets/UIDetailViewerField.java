package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.Map;

import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.viewer.CellStyleHandler;
import com.smartgwt.client.widgets.viewer.DetailFormatter;
import com.smartgwt.client.widgets.viewer.DetailViewerField;
import com.smartgwt.client.widgets.viewer.DetailViewerFieldIfFunction;

public class UIDetailViewerField  extends Widget implements UIMasquerade<DetailViewerField>, HasText {
	DetailViewerField field;
	
	public UIDetailViewerField() {
		field = new DetailViewerField();
	}
	
	@Override
	public DetailViewerField getSmartObject() {
		return field;
	}

	@Override
	public String getText() {
		return field.getTitle();
	}

	@Override
	public void setText(String title) {
		field.setTitle(title);
	}

	public JavaScriptObject getJsObj() {
		return field.getJsObj();
	}

	public int hashCode() {
		return field.hashCode();
	}

	public void setAttribute(String property, String value) {
		field.setAttribute(property, value);
	}

	public String getAttribute(String property) {
		return field.getAttribute(property);
	}

	public String getAttributeAsString(String property) {
		return field.getAttributeAsString(property);
	}

	public void setAttribute(String property, int value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, double value) {
		field.setAttribute(property, value);
	}

	public Integer getAttributeAsInt(String property) {
		return field.getAttributeAsInt(property);
	}

	public void setAttribute(String property, boolean value) {
		field.setAttribute(property, value);
	}

	public Boolean getAttributeAsBoolean(String property) {
		return field.getAttributeAsBoolean(property);
	}

	public Double getAttributeAsDouble(String property) {
		return field.getAttributeAsDouble(property);
	}

	public void setAttribute(String property, int[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass[] value) {
		field.setAttribute(property, value);
	}

	public void setCanExport(Boolean canExport) {
		field.setCanExport(canExport);
	}

	public void setAttribute(String property, BaseClass[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		field.setAttribute(property, value);
	}

	public int[] getAttributeAsIntArray(String property) {
		return field.getAttributeAsIntArray(property);
	}

	public Boolean getCanExport() {
		return field.getCanExport();
	}

	public void setAttribute(String property, String[] value) {
		field.setAttribute(property, value);
	}

	public boolean equals(Object obj) {
		return field.equals(obj);
	}

	public String[] getAttributeAsStringArray(String property) {
		return field.getAttributeAsStringArray(property);
	}

	public void setAttribute(String property, DataClass value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseClass value) {
		field.setAttribute(property, value);
	}

	public void setHeight(Integer height) {
		field.setHeight(height);
	}

	public void setAttribute(String property, JavaScriptObject value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Date value) {
		field.setAttribute(property, value);
	}

	public Integer getHeight() {
		return field.getHeight();
	}

	public void setAttribute(String property, Boolean value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Map value) {
		field.setAttribute(property, value);
	}

	public void setImageHeight(Integer imageHeight) {
		field.setImageHeight(imageHeight);
	}

	public void setAttribute(String property, ValueEnum[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Object value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Double value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Integer value) {
		field.setAttribute(property, value);
	}

	public Integer getImageHeight() {
		return field.getImageHeight();
	}

	public void setAttribute(String property, Float value) {
		field.setAttribute(property, value);
	}

	public Float getAttributeAsFloat(String property) {
		return field.getAttributeAsFloat(property);
	}

	public Date getAttributeAsDate(String property) {
		return field.getAttributeAsDate(property);
	}

	public Object getAttributeAsObject(String property) {
		return field.getAttributeAsObject(property);
	}

	public void setImageSize(Integer imageSize) {
		field.setImageSize(imageSize);
	}

	public Map getAttributeAsMap(String property) {
		return field.getAttributeAsMap(property);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String property) {
		return field.getAttributeAsJavaScriptObject(property);
	}

	public String[] getAttributes() {
		return field.getAttributes();
	}

	public void fireEvent(GwtEvent<?> event) {
		field.fireEvent(event);
	}

	public Integer getImageSize() {
		return field.getImageSize();
	}

	public void setImageURLPrefix(String imageURLPrefix) {
		field.setImageURLPrefix(imageURLPrefix);
	}

	public int getHandlerCount(Type<?> type) {
		return field.getHandlerCount(type);
	}

	public String getImageURLPrefix() {
		return field.getImageURLPrefix();
	}

	public void setJsObj(JavaScriptObject jsObj) {
		field.setJsObj(jsObj);
	}

	public void setImageWidth(Integer imageWidth) {
		field.setImageWidth(imageWidth);
	}

	public Integer getImageWidth() {
		return field.getImageWidth();
	}

	public void setShowFileInline(Boolean showFileInline) {
		field.setShowFileInline(showFileInline);
	}

	public String toString() {
		return field.toString();
	}

	public Boolean getShowFileInline() {
		return field.getShowFileInline();
	}

	public void setTitle(String title) {
		field.setTitle(title);
	}

	public String getTitle() {
		return field.getTitle();
	}

	public void setType(String type) {
		field.setType(type);
	}

	public String getType() {
		return field.getType();
	}

	public void setValue(String value) {
		field.setValue(value);
	}

	public String getValue() {
		return field.getValue();
	}

	public void setCellStyle(String cellStyle) {
		field.setCellStyle(cellStyle);
	}

	public String getCellStyle() {
		return field.getCellStyle();
	}

	public void setName(String name) {
		field.setName(name);
	}

	public String getName() {
		return field.getName();
	}

	public void setValueMap(Map valueMap) {
		field.setValueMap(valueMap);
	}

	public void setShowIfCondition(DetailViewerFieldIfFunction showIf) {
		field.setShowIfCondition(showIf);
	}

	public void setDetailFormatter(DetailFormatter formatter) {
		field.setDetailFormatter(formatter);
	}

	public void setCellStyleHandler(CellStyleHandler handler) {
		field.setCellStyleHandler(handler);
	}
	
}
