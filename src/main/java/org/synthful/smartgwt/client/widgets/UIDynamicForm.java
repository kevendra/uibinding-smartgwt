package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.synthful.smartgwt.client.HasUICanvasAlign;
import org.synthful.smartgwt.client.util.StringTokenizer;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.Encoding;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.TextItem;

public class UIDynamicForm
extends DynamicForm
implements HasWidgets, HasUICanvasAlign {

	@Override
	public void add(Widget widget) {
		if (widget instanceof UIFormItem){
			
			FormItem[] fields = getFields();

			FormItem[] newFields = new FormItem[fields.length+1];

			for (int i = 0; i < fields.length; i++) {
				newFields[i] = fields[i];
			}
			newFields[fields.length] = ((UIFormItem)widget).getFormItem();
			setFields(newFields);
		}
		else if (widget instanceof UIFormItemArray){
			FormItem[] fieldsToAdd = ((UIFormItemArray)widget).toArray();
			FormItem[] fields = getFields();

			FormItem[] newFields = new FormItem[fields.length+fieldsToAdd.length];

			for (int i = 0; i < fields.length; i++) {
				newFields[i] = fields[i];
			}
			int i = fields.length;
			for(int j=0;i<newFields.length;i++,j++){
				newFields[i]=fieldsToAdd[j];
			}
			
			setFields(newFields);
		}
		else if (widget instanceof UIDataSource){
			setDataSource(((UIDataSource)widget).getSmartObject());
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		List<Widget> fields = new ArrayList<Widget>(super.getFields().length);
		for (FormItem field : super.getFields()) {
			if (field instanceof TextItem){
				fields.add(new UITextItem((TextItem)field));
			}
		}
		return fields.iterator();
	}

	@Override
	public boolean remove(Widget widget) {
		if (widget instanceof UIListGridField){
			FormItem[] fields = getFields();

			FormItem[] newFields = new FormItem[fields.length-1];

			boolean remove = false;
			for (int i = 0; i < fields.length; i++) {
				UIFormItem newField = (UIFormItem)widget;
				if (!fields[i].equals(newField.getFormItem())){
					remove = true;
					newFields[i] = fields[i];
				}
			}
			if (remove){
				setFields(newFields);
			}
			return remove;
		}
		return false;
	}
	
	@Override
	public void setLayoutHAlign(Alignment alignment) {
		super.setLayoutAlign(alignment);
	}

	@Override
	public void setLayoutVAlign(VerticalAlignment alignment) {
		super.setLayoutAlign(alignment);
	}
	
	public void setColWidths(String values) {
		if(values != null && !"".equals(values.trim())) {
			StringTokenizer st = new StringTokenizer(values, " ");
			super.setColWidths((Object[])st.getTokens());
		}
	}
	
	public void setEncodingAsString(String encoding) {
		Encoding encodingEnum = Encoding.valueOf(encoding.toUpperCase());
		if(encodingEnum != null) {
			setEncoding(encodingEnum);
		}
	}
	
}
