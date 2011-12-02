package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.synthful.smartgwt.client.util.UISelectItemFormat;

import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.grid.ListGrid;

public class UIComboBoxItem extends UIFormItem<ComboBoxItem>{

	@SuppressWarnings("unchecked")
	private List valuesList;
	
	public UIComboBoxItem(){
		item = new ComboBoxItem();
	}
	
	
	@SuppressWarnings("unchecked")
	public void setValues(Object... values) {
		List objects = new ArrayList();
		for(Object o : values) {
			objects.add(o);
		}
		setValues(objects);
	}
	
	@SuppressWarnings("unchecked")
	public void setValues(List values) {
		this.valuesList = new ArrayList();
//		if(item.getAllowEmptyValue()) {
//			valuesList.add(null);
//		}
		for(Object obj : values) {
			valuesList.add( obj );
		}
		LinkedHashMap<String, String> innerValues = new LinkedHashMap<String, String>();
		for(int i=0; i < valuesList.size(); i++) {
			Object obj = valuesList.get(i);
			if(obj != null) {
				if(obj instanceof UISelectItemFormat) {
					innerValues.put(Integer.toString(i), ((UISelectItemFormat)obj).getComboDescription());
				} else {
					innerValues.put(Integer.toString(i), obj.toString());
				}
			}
		}
		setValueMap(innerValues);
	}
	
	public Object getSelectedObject() {
		Object objSelected = null;
		String idString = (String) getValue();
		if(idString != null && !"".equals(idString)) {
			try {
				int id = Integer.parseInt(idString);
				objSelected = valuesList.get(id);
			} catch (NumberFormatException e) {
			}
		}
		return objSelected;
	}
	
	public boolean setSelectedObject(Object objSelected) {
		if(objSelected == null ) {
			clearValue();
			return true;
		}
		if(this.valuesList==null){
			return false;
		}
		for(int i=0; i < this.valuesList.size(); i++) {
			Object obj = this.valuesList.get(i);
			if(obj != null) {
				if(obj.equals(objSelected)) {
					setValue(Integer.toString(i));
					return true;
				}
			}
		}
		
		return false;
	}
	
	public Object getObjectValue(int index) {
		if (index > -1 && index < valuesList.size()) {
			return this.valuesList.get(index);
		} else {
			throw new IndexOutOfBoundsException("index: " + index);
		}
	}
	
	public void setSelectedIndex(int index) {
		if(index == 0 ) {
			clearValue();
		}else {
			if(index > -1 && index < valuesList.size()) {
				setValue(Integer.toString(index));
			}
			else {
				throw new IndexOutOfBoundsException("index: " + index);
			}
		}
	}
	
	public void setPickListProperties(ListGrid properties){
		item.setPickListProperties(properties);
	}
	public void setShowAllOptions(Boolean allOptions){
		item.setShowAllOptions(allOptions);
	}
}
