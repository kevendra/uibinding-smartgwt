package org.synthful.smartgwt.client.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import com.smartgwt.client.widgets.form.fields.SelectItem;

public class SelectItemEnhanced extends SelectItem{

	@SuppressWarnings("unchecked")
	private List valuesList;
	
	@SuppressWarnings("unchecked")
	public void setValues(Enum... emuns) {
		setValues((Object[])emuns);
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
		if(getAllowEmptyValue()!=null && getAllowEmptyValue()) {
			valuesList.add(null);
		}
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
//				if (valuesList!=null){
					objSelected = valuesList.get(id);
//				} else {
//					objSelected = null;
//				}
			} catch (NumberFormatException e) {
			}
		}
		return objSelected;
	}
	
	public boolean setSelectedObject(Object objSelected) {
		if(objSelected == null) {
			clearValue();
			return true;
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
		if(index == 0 && getAllowEmptyValue()) {
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
	
	public void setSelectFirstNoBlankOption() {
		if(getAllowEmptyValue()) {
			setSelectedIndex(1);
		}
		else {
			setSelectedIndex(0);
		}
	}
	
	public void setSelectFirstOption() {
		setSelectedIndex(0);
	}

	/**
	 * @return -1 if not initialized with 
	 *            setValues(Enum ...)
	 *            setValues(Object ...)
	 *            setValues(List ...)
	 */
	public int getItemsSize() {
		return (valuesList != null) ? valuesList.size() : -1;
	}
	public void clearValues(){
		setValues(new LinkedList());
		clearValue();
	}
	
	public List getValuesList(){
		return valuesList;
	}
}
