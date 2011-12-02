package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.widgets.tree.TreeGridField;

public class UITreeGridField extends UIListGridField  {

	@Override
	protected void init() {
		field = new TreeGridField();
	}


}
