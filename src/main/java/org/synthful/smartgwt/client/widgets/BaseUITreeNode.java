package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.Map;

import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.data.RecordList;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.tree.TreeNode;

abstract public class BaseUITreeNode
extends Widget
implements UIMasquerade<TreeNode> {
	final protected TreeNode treeNode;
	
	protected BaseUITreeNode() {
		this.treeNode = new TreeNode();
	}

	protected BaseUITreeNode(TreeNode treeNode) {
		this.treeNode = treeNode;
	}
	
	protected BaseUITreeNode(Widget w) {
		this.treeNode = new TreeNode();
		setWidget(w);
	}

	@Override
	public TreeNode getSmartObject() {
		return treeNode;
	}
	
	public void setWidget(Widget w){
		treeNode.setAttribute("widget", w);
	}
	
	public Widget getWidget(){
		return (Widget)treeNode.getAttributeAsObject("widget");
	}
	
	public boolean remove(Widget w) {
		Widget wold = getWidget();
		if (wold!=null && wold.equals(w)){
			setWidget(null);
			return true;
		}
		
		return false;
	}

	public JavaScriptObject getJsObj() {
		return treeNode.getJsObj();
	}

	public void setAttribute(String property, String value) {
		treeNode.setAttribute(property, value);
	}

	public String getAttribute(String property) {
		return treeNode.getAttribute(property);
	}

	public String getAttributeAsString(String property) {
		return treeNode.getAttributeAsString(property);
	}

	public void setAttribute(String property, int value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, double value) {
		treeNode.setAttribute(property, value);
	}

	public Integer getAttributeAsInt(String property) {
		return treeNode.getAttributeAsInt(property);
	}

	public void setAttribute(String property, boolean value) {
		treeNode.setAttribute(property, value);
	}

	public Boolean getAttributeAsBoolean(String property) {
		return treeNode.getAttributeAsBoolean(property);
	}

	public Record[] getAttributeAsRecordArray(String property) {
		return treeNode.getAttributeAsRecordArray(property);
	}

	public int hashCode() {
		return treeNode.hashCode();
	}

	public Double getAttributeAsDouble(String property) {
		return treeNode.getAttributeAsDouble(property);
	}

	public void setAttribute(String property, int[] value) {
		treeNode.setAttribute(property, value);
	}

	public RecordList getAttributeAsRecordList(String property) {
		return treeNode.getAttributeAsRecordList(property);
	}

	public void setAttribute(String property, DataClass[] value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseClass[] value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		treeNode.setAttribute(property, value);
	}

	public void setCanAcceptDrop(Boolean canAcceptDrop) {
		treeNode.setCanAcceptDrop(canAcceptDrop);
	}

	public int[] getAttributeAsIntArray(String property) {
		return treeNode.getAttributeAsIntArray(property);
	}

	public void setAttribute(String property, String[] value) {
		treeNode.setAttribute(property, value);
	}

	public String[] getAttributeAsStringArray(String property) {
		return treeNode.getAttributeAsStringArray(property);
	}

	public void setAttribute(String property, DataClass value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseClass value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, JavaScriptObject value) {
		treeNode.setAttribute(property, value);
	}

	public Boolean getCanAcceptDrop() {
		return treeNode.getCanAcceptDrop();
	}

	public void setAttribute(String property, Date value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, Boolean value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, Map<?, ?> value) {
		treeNode.setAttribute(property, value);
	}

	public boolean equals(Object obj) {
		return treeNode.equals(obj);
	}

	public void setAttribute(String property, ValueEnum[] value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum value) {
		treeNode.setAttribute(property, value);
	}

	public void setCanDrag(Boolean canDrag) {
		treeNode.setCanDrag(canDrag);
	}

	public void setAttribute(String property, Object value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, Double value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, Integer value) {
		treeNode.setAttribute(property, value);
	}

	public void setAttribute(String property, Float value) {
		treeNode.setAttribute(property, value);
	}

	public Float getAttributeAsFloat(String property) {
		return treeNode.getAttributeAsFloat(property);
	}

	public void set_baseStyle(String _baseStyle) {
		treeNode.set_baseStyle(_baseStyle);
	}

	public Boolean getCanDrag() {
		return treeNode.getCanDrag();
	}

	public Date getAttributeAsDate(String property) {
		return treeNode.getAttributeAsDate(property);
	}

	public Object getAttributeAsObject(String property) {
		return treeNode.getAttributeAsObject(property);
	}

	public Map<?, ?> getAttributeAsMap(String property) {
		return treeNode.getAttributeAsMap(property);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String property) {
		return treeNode.getAttributeAsJavaScriptObject(property);
	}

	public String[] getAttributes() {
		return treeNode.getAttributes();
	}

	public void setEnabled(Boolean enabled) {
		treeNode.setEnabled(enabled);
	}

	public void fireEvent(GwtEvent<?> event) {
		treeNode.fireEvent(event);
	}

	public Boolean getEnabled() {
		return treeNode.getEnabled();
	}

	public int getHandlerCount(Type<?> type) {
		return treeNode.getHandlerCount(type);
	}

	public String get_baseStyle() {
		return treeNode.get_baseStyle();
	}

	public void setIcon(String icon) {
		treeNode.setIcon(icon);
	}

	public void setJsObj(JavaScriptObject jsObj) {
		treeNode.setJsObj(jsObj);
	}

	public void setBackgroundComponent(Canvas backgroundComponent) {
		treeNode.setBackgroundComponent(backgroundComponent);
	}

	public String getIcon() {
		return treeNode.getIcon();
	}

	public Canvas getBackgroundComponent() {
		return treeNode.getBackgroundComponent();
	}

	public void setName(String name) {
		treeNode.setName(name);
	}

	public String toString() {
		return treeNode.toString();
	}

	public void setCanExpand(Boolean canExpand) {
		treeNode.setCanExpand(canExpand);
	}

	public Boolean getCanExpand() {
		return treeNode.getCanExpand();
	}

	public String getName() {
		return treeNode.getName();
	}

	public void setCustomStyle(String customStyle) {
		treeNode.setCustomStyle(customStyle);
	}

	public String getCustomStyle() {
		return treeNode.getCustomStyle();
	}

	public void setShowDropIcon(Boolean showDropIcon) {
		treeNode.setShowDropIcon(showDropIcon);
	}

	public Boolean getShowDropIcon() {
		return treeNode.getShowDropIcon();
	}

	public void setDetailDS(DataSource detailDS) {
		treeNode.setDetailDS(detailDS);
	}

	public DataSource getDetailDS() {
		return treeNode.getDetailDS();
	}

	public void setShowOpenIcon(Boolean showOpenIcon) {
		treeNode.setShowOpenIcon(showOpenIcon);
	}

	public Boolean getShowOpenIcon() {
		return treeNode.getShowOpenIcon();
	}

	public void setIncludeInSummary(Boolean includeInSummary) {
		treeNode.setIncludeInSummary(includeInSummary);
	}

	public Boolean getIncludeInSummary() {
		return treeNode.getIncludeInSummary();
	}

	public void setTitle(String title) {
		treeNode.setTitle(title);
	}

	public void setIsGridSummary(Boolean isGridSummary) {
		treeNode.setIsGridSummary(isGridSummary);
	}

	public String getTitle() {
		return treeNode.getTitle();
	}

	public Boolean getIsGridSummary() {
		return treeNode.getIsGridSummary();
	}

	public void setIsGroupSummary(Boolean isGroupSummary) {
		treeNode.setIsGroupSummary(isGroupSummary);
	}

	public void setNodeID(String id) {
		treeNode.setID(id);
	}

	public Boolean getIsGroupSummary() {
		return treeNode.getIsGroupSummary();
	}

    public void setParentID(String parentID) {
		treeNode.setParentID(parentID);
	}

	public void setIsSeparator(Boolean isSeparator) {
		treeNode.setIsSeparator(isSeparator);
	}

	public void setIsFolder(boolean isFolder) {
		treeNode.setIsFolder(isFolder);
	}

	public Boolean getIsSeparator() {
		return treeNode.getIsSeparator();
	}

	public void setChildren(TreeNode[] children) {
		treeNode.setChildren(children);
	}

	public void setLinkText(String linkText) {
		treeNode.setLinkText(linkText);
	}

	public String getLinkText() {
		return treeNode.getLinkText();
	}

	public void setSingleCellValue(String singleCellValue) {
		treeNode.setSingleCellValue(singleCellValue);
	}

	public String getSingleCellValue() {
		return treeNode.getSingleCellValue();
	}
}
