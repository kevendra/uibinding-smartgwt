package org.synthful.smartgwt.client;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

abstract public class UIMasqueradedWidgetArray<M extends UIMasquerade<SmartType>, SmartType>
extends Widget
implements HasWidgets
{
	@Override
	public void clear() {
		this.items.clear();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<Widget> iterator() {
		return (Iterator<Widget>) this.items.iterator();
	}

	public boolean removeMasqueradedWidget(M w) {
		return this.items.remove(w.getSmartObject());
	}

	protected void addMasqueradedWidget(M w) {
		items.add(w.getSmartObject());
	}
	
	/* Commented out due to
	 * http://code.google.com/p/google-web-toolkit/issues/detail?id=5108
	 * 
	public SmartType[] toArray(SmartType[] a){
		if (a.length < smartObjects.size())
			Arrays.copyOf(a, smartObjects.size());
		
		for(int i=0 ; i<a.length; i++){
			SmartType w = smartObjects.get(i);
			a[i] = w;
		}
		return a;
	}
	*/

	protected ArrayList<SmartType> items = new ArrayList<SmartType>();

}
