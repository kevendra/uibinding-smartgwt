package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.data.fields.DataSourceLinkField;

public class UIDataSourceLinkField
extends UIDataSourceField {

	public UIDataSourceLinkField() {
		field = new DataSourceLinkField();
	}
	
	public void setTarget(String target){
		field.setAttribute("target", target);
	}
}
