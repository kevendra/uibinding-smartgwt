package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

abstract public class WidgetArray<W extends Widget>
	extends Widget
	implements HasWidgets
{

	@Override
	public void clear() {
		this.widgets.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		return (Iterator<Widget>) this.widgets.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		return this.widgets.remove(w);
	}
	
	/* Commented out due to
	 * http://code.google.com/p/google-web-toolkit/issues/detail?id=5108
	 * 
	protected W[] toArray(W[] a){
		if (a.length < widgets.size())
			Arrays.copyOf(a, widgets.size());
		
		for(int i=0 ; i<a.length; i++){
			W w = widgets.get(i);
			a[i] = w;
		}
		return a;
	}
	*/
	protected ArrayList<W> widgets = new ArrayList<W>();

}
