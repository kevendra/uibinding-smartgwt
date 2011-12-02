package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.data.fields.DataSourceDateTimeField;

public class UIDataSourceDateTimeField
extends UIDataSourceField {

	public UIDataSourceDateTimeField() {
		field = new DataSourceDateTimeField();
	}
	
    public void setUseTextField(Boolean useTextField) {
        ((DataSourceDateTimeField)field).setUseTextField(useTextField);
    }
}
