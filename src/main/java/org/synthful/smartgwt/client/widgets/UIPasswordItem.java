package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.widgets.form.fields.PasswordItem;

public class UIPasswordItem extends UIFormItem<PasswordItem> {

	public UIPasswordItem(){
		item= new PasswordItem();
	}
	
	public UIPasswordItem(PasswordItem item){
		super.item = item;
	}
}
