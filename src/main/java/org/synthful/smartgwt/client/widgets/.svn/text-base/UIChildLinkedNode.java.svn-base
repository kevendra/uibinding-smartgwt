package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.tree.TreeNode;

public class UIChildLinkedNode
extends BaseUITreeNode
implements HasWidgets{
	final protected List<TreeNode> nodeList = new ArrayList<TreeNode>();
	
	protected UIChildLinkedNode(TreeNode treeNode) {
		super(treeNode);
	}

	@UiConstructor
	public UIChildLinkedNode(String name, String title) {
		super();
		setName(name);
		setTitle(title);
	}

	@Override
	public void add(Widget w) {
		if (w instanceof UIChildLinkedNode){
			TreeNode node = ((UIChildLinkedNode)w).finaliseChildren();			
			nodeList.add(node);
		}
		else{
			setWidget(w);
		}
	}
	
	/**
	 * Because TreeNode does not have add node function but setChildren function,
	 * in addition to uibinder not providing event facility to detect end tag,
	 * we have to depend on widgetList to accumulate but have the uibinder parent
	 * node to finalise the setChildren of the current node.
	 * 
	 * @return
	 */
	public TreeNode finaliseChildren(){
		TreeNode[] nodes = {};
		nodes = this.nodeList.toArray(nodes);
		treeNode.setChildren(nodes);
		
		return treeNode;		
	}

	@Override
	public void clear() {
		TreeNode[] tt = {};
		treeNode.setChildren(tt);
		nodeList.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		List<Widget> widgetList = new ArrayList<Widget>();
		for(TreeNode node: nodeList){
			widgetList.add(new UIChildLinkedNode(node));
		}
		return widgetList.iterator();
	}

}
