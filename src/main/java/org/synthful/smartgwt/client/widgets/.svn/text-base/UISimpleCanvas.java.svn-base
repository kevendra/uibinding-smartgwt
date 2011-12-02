package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class UISimpleCanvas
	extends WidgetedCanvas<SimplePanel>
	implements HasWidgets
{
	public UISimpleCanvas() {
		super(new SimplePanel());
	}

	@Override
	public void add(Widget w) {
		this.getEmbeddedWidget().setWidget(w);
	}

	@Override
	public Iterator<Widget> iterator() {
		return getEmbeddedWidget().iterator();
	}

	@Override
	public boolean remove(Widget w) {
		return this.getEmbeddedWidget().remove(w);
	}
	
	public void setWidget(Widget w){
		this.getEmbeddedWidget().setWidget(w);
	}
	
	public SimplePanel getSimplePanel(){
		return getEmbeddedWidget();
	}
}
