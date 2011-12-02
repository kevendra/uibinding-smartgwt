package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.tree.TreeNode;


public class UIParentLinkedNode
extends BaseUITreeNode
implements HasWidgets{

	public UIParentLinkedNode() {
		super();
	}

	protected UIParentLinkedNode(TreeNode treeNode) {
		super(treeNode);
	}

	protected UIParentLinkedNode(Widget w) {
		super(w);
		setWidget(w);
	}

	@Override
	public void add(Widget w) {
		setWidget(w);
	}
	
	@Override
	public void clear() {
		setWidget(null);
	}

	@Override
	public Iterator<Widget> iterator() {
		List<Widget> widgetList = new ArrayList<Widget>();
		Widget w = getWidget();
		if (w!=null)
			widgetList.add(new UIParentLinkedNode(w));
		
		return widgetList.iterator();
	}
}
