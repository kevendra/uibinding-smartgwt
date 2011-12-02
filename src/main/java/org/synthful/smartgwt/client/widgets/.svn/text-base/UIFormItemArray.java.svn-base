package org.synthful.smartgwt.client.widgets;


import org.synthful.smartgwt.client.UIArray;

import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.form.fields.FormItem;

public class UIFormItemArray
extends UIArray<FormItem>{

	@Override
	public void add(Widget widget) {
		if (widget instanceof UIFormItem){
			this.items.add(((UIFormItem<?>)widget).getFormItem());
		}
	}

	@Override
	public boolean remove(Widget widget) {
		if (widget instanceof UIFormItem){
			return this.items.remove(((UIFormItem<?>)widget).getFormItem());
		}
		return false;
	}
	
	public FormItem[] toArray(){
		FormItem[] a = new FormItem[items.size()];
		items.toArray(a);
		return a;
	}
}