package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.widgets.form.fields.IntegerItem;

public class UIIntegerItem extends UIFormItem<IntegerItem> {
	public UIIntegerItem() {
		item = new IntegerItem();
	}

	public UIIntegerItem(String name) {
		item = new IntegerItem(name);
	}

	public UIIntegerItem(String name, String title) {
		item = new IntegerItem(name,title);
	}
}
