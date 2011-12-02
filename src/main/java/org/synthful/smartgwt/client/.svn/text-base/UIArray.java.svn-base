package org.synthful.smartgwt.client;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

abstract public class UIArray<W>
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

	public boolean add(W w) {
		return this.items.add(w);
	}

	public boolean remove(W w) {
		return this.items.remove(w);
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
	protected ArrayList<W> items = new ArrayList<W>();

}
