package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.data.SimpleType;
import com.smartgwt.client.data.fields.DataSourceSimpleTypeField;

public class UIDataSourceSimpleTypeField
extends UIDataSourceField {

	public UIDataSourceSimpleTypeField(String name, SimpleType type) {
		field = new DataSourceSimpleTypeField(name, type);
	}
}
