package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.Map;

import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.data.Criteria;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.DateDisplayFormat;
import com.smartgwt.client.types.EnterKeyEditAction;
import com.smartgwt.client.types.EscapeKeyEditAction;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.types.OperatorId;
import com.smartgwt.client.types.RecordSummaryFunctionType;
import com.smartgwt.client.types.SortDirection;
import com.smartgwt.client.types.SummaryFunctionType;
import com.smartgwt.client.types.TextMatchStyle;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.FormItemIcon;
import com.smartgwt.client.widgets.form.validator.Validator;
import com.smartgwt.client.widgets.grid.CellFormatter;
import com.smartgwt.client.widgets.grid.EditorValueMapFunction;
import com.smartgwt.client.widgets.grid.GroupTitleRenderer;
import com.smartgwt.client.widgets.grid.GroupValueFunction;
import com.smartgwt.client.widgets.grid.HoverCustomizer;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridFieldIfFunction;
import com.smartgwt.client.widgets.grid.RecordSummaryFunction;
import com.smartgwt.client.widgets.grid.SortNormalizer;
import com.smartgwt.client.widgets.grid.SummaryFunction;
import com.smartgwt.client.widgets.grid.events.CellSavedHandler;
import com.smartgwt.client.widgets.grid.events.ChangeHandler;
import com.smartgwt.client.widgets.grid.events.ChangedHandler;
import com.smartgwt.client.widgets.grid.events.EditorEnterHandler;
import com.smartgwt.client.widgets.grid.events.EditorExitHandler;
import com.smartgwt.client.widgets.grid.events.RecordClickHandler;

public class UIListGridField extends Widget implements UIMasquerade<ListGridField>, HasText {
	ListGridField field;
	
	public UIListGridField() {
		init();
	}
	
	protected void init() {
		field = new ListGridField();
	}

	public UIListGridField(ListGridField field){
		this.field = field;
	}
	
	public void setTitle(String title){
		field.setTitle(title);
	}
	
	public void setName(String name){
		field.setName(name);
	}
	
	public String getName(){
		return field.getName();
	}
	
	public String getTitle(){
		return field.getTitle();
	}

	public HandlerRegistration addCellSavedHandler(CellSavedHandler handler) {
		return field.addCellSavedHandler(handler);
	}

	public HandlerRegistration addChangedHandler(ChangedHandler handler) {
		return field.addChangedHandler(handler);
	}

	public HandlerRegistration addChangeHandler(ChangeHandler handler) {
		return field.addChangeHandler(handler);
	}

	public HandlerRegistration addEditorEnterHandler(EditorEnterHandler handler) {
		return field.addEditorEnterHandler(handler);
	}

	public HandlerRegistration addEditorExitHandler(EditorExitHandler handler) {
		return field.addEditorExitHandler(handler);
	}

	public HandlerRegistration addRecordClickHandler(RecordClickHandler handler) {
		return field.addRecordClickHandler(handler);
	}

	public boolean equals(Object arg0) {
		return field.equals(arg0);
	}

	public void fireEvent(GwtEvent<?> event) {
		field.fireEvent(event);
	}

	public Alignment getAlign() {
		return field.getAlign();
	}

	public String getAttribute(String property) {
		return field.getAttribute(property);
	}

	public Boolean getAttributeAsBoolean(String property) {
		return field.getAttributeAsBoolean(property);
	}

	public Date getAttributeAsDate(String property) {
		return field.getAttributeAsDate(property);
	}

	public Double getAttributeAsDouble(String property) {
		return field.getAttributeAsDouble(property);
	}

	public Float getAttributeAsFloat(String property) {
		return field.getAttributeAsFloat(property);
	}

	public Integer getAttributeAsInt(String property) {
		return field.getAttributeAsInt(property);
	}

	public int[] getAttributeAsIntArray(String property) {
		return field.getAttributeAsIntArray(property);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String property) {
		return field.getAttributeAsJavaScriptObject(property);
	}

	public Map getAttributeAsMap(String property) {
		return field.getAttributeAsMap(property);
	}

	public Object getAttributeAsObject(String property) {
		return field.getAttributeAsObject(property);
	}

	public String getAttributeAsString(String property) {
		return field.getAttributeAsString(property);
	}

	public String[] getAttributeAsStringArray(String property) {
		return field.getAttributeAsStringArray(property);
	}

	public String[] getAttributes() {
		return field.getAttributes();
	}

	public Boolean getAutoFetchDisplayMap() {
		return field.getAutoFetchDisplayMap();
	}

	public Boolean getAutoFreeze() {
		return field.getAutoFreeze();
	}

	public String getBaseStyle() {
		return field.getBaseStyle();
	}

	public Boolean getCanDragResize() {
		return field.getCanDragResize();
	}

	public Boolean getCanEdit() {
		return field.getCanEdit();
	}

	public Boolean getCanExport() {
		return field.getCanExport();
	}

	public Boolean getCanFilter() {
		return field.getCanFilter();
	}

	public Boolean getCanFreeze() {
		return field.getCanFreeze();
	}

	public Boolean getCanGroupBy() {
		return field.getCanGroupBy();
	}

	public Boolean getCanHide() {
		return field.getCanHide();
	}

	public Boolean getCanReorder() {
		return field.getCanReorder();
	}

	public Boolean getCanSort() {
		return field.getCanSort();
	}

	public Boolean getCanSortClientOnly() {
		return field.getCanSortClientOnly();
	}

	public Boolean getCanToggle() {
		return field.getCanToggle();
	}

	public Alignment getCellAlign() {
		return field.getCellAlign();
	}

	public String getCellIcon() {
		return field.getCellIcon();
	}

	public DateDisplayFormat getDateFormatter() {
		return field.getDateFormatter();
	}

	public String getDefaultGroupingMode() {
		return field.getDefaultGroupingMode();
	}

	public String getDefaultIconSrc() {
		return field.getDefaultIconSrc();
	}

	public String getDisplayField() {
		return field.getDisplayField();
	}

	public Integer getEditorIconHeight() {
		return field.getEditorIconHeight();
	}

	public Integer getEditorIconWidth() {
		return field.getEditorIconWidth();
	}

	public String getEditorImageURLPrefix() {
		return field.getEditorImageURLPrefix();
	}

	public String getEditorImageURLSuffix() {
		return field.getEditorImageURLSuffix();
	}

	public Integer getEditorValueIconHeight() {
		return field.getEditorValueIconHeight();
	}

	public Integer getEditorValueIconWidth() {
		return field.getEditorValueIconWidth();
	}

	public String getEmptyCellValue() {
		return field.getEmptyCellValue();
	}

	public EnterKeyEditAction getEnterKeyEditAction() {
		return field.getEnterKeyEditAction();
	}

	public EscapeKeyEditAction getEscapeKeyEditAction() {
		return field.getEscapeKeyEditAction();
	}

	public void getFieldTitle(ListGrid viewer, int fieldNum) {
		field.getFieldTitle(viewer, fieldNum);
	}

	public Boolean getFilterOnKeypress() {
		return field.getFilterOnKeypress();
	}

	public OperatorId getFilterOperator() {
		return field.getFilterOperator();
	}

	public Boolean getFrozen() {
		return field.getFrozen();
	}

	public Integer getGroupGranularity() {
		return field.getGroupGranularity();
	}

	public String getGroupingMode() {
		return field.getGroupingMode();
	}

	public Map getGroupingModes() {
		return field.getGroupingModes();
	}

	public Integer getGroupPrecision() {
		return field.getGroupPrecision();
	}

	public int getHandlerCount(Type<?> type) {
		return field.getHandlerCount(type);
	}

	public String getHeaderBaseStyle() {
		return field.getHeaderBaseStyle();
	}

	public String getHeaderTitleStyle() {
		return field.getHeaderTitleStyle();
	}

	public String getIcon() {
		return field.getIcon();
	}

	public Integer getIconHeight() {
		return field.getIconHeight();
	}

	public String getIconOrientation() {
		return field.getIconOrientation();
	}

	public Integer getIconSize() {
		return field.getIconSize();
	}

	public int getIconSpacing() {
		return field.getIconSpacing();
	}

	public String getIconVAlign() {
		return field.getIconVAlign();
	}

	public Integer getIconWidth() {
		return field.getIconWidth();
	}

	public int getImageHeight() {
		return field.getImageHeight();
	}

	public int getImageSize() {
		return field.getImageSize();
	}

	public String getImageURLPrefix() {
		return field.getImageURLPrefix();
	}

	public String getImageURLSuffix() {
		return field.getImageURLSuffix();
	}

	public int getImageWidth() {
		return field.getImageWidth();
	}

	public Boolean getIncludeInRecordSummary() {
		return field.getIncludeInRecordSummary();
	}

	public Boolean getIsRemoveField() {
		return field.getIsRemoveField();
	}

	public JavaScriptObject getJsObj() {
		return field.getJsObj();
	}

	public String getLinkText() {
		return field.getLinkText();
	}

	public Criteria getOptionCriteria() {
		return field.getOptionCriteria();
	}

	public DSRequest getOptionFilterContext() {
		return field.getOptionFilterContext();
	}

	public String getOptionOperationId() {
		return field.getOptionOperationId();
	}

	public TextMatchStyle getOptionTextMatchStyle() {
		return field.getOptionTextMatchStyle();
	}

	public Boolean getPartialSummary() {
		return field.getPartialSummary();
	}

	public String getPrompt() {
		return field.getPrompt();
	}

	public RecordSummaryFunctionType getRecordSummaryFunction() {
		return field.getRecordSummaryFunction();
	}

	public Boolean getRequired() {
		return field.getRequired();
	}

	public Boolean getShouldPrint() {
		return field.getShouldPrint();
	}

	public Boolean getShowAlternateStyle() {
		return field.getShowAlternateStyle();
	}

	public Boolean getShowDefaultContextMenu() {
		return field.getShowDefaultContextMenu();
	}

	public Boolean getShowDisabledIcon() {
		return field.getShowDisabledIcon();
	}

	public Boolean getShowDownIcon() {
		return field.getShowDownIcon();
	}

	public Boolean getShowFileInline() {
		return field.getShowFileInline();
	}

	public Boolean getShowFocusedIcon() {
		return field.getShowFocusedIcon();
	}

	public Boolean getShowGridSummary() {
		return field.getShowGridSummary();
	}

	public Boolean getShowGroupSummary() {
		return field.getShowGroupSummary();
	}

	public Boolean getShowHover() {
		return field.getShowHover();
	}

	public Boolean getShowRollOverIcon() {
		return field.getShowRollOverIcon();
	}

	public Boolean getShowSelectedIcon() {
		return field.getShowSelectedIcon();
	}

	public Boolean getShowValueIconOnly() {
		return field.getShowValueIconOnly();
	}

	public SortDirection getSortDirection() {
		return field.getSortDirection();
	}

	public SummaryFunctionType getSummaryFunction() {
		return field.getSummaryFunction();
	}

	public String getSummaryTitle() {
		return field.getSummaryTitle();
	}

	public Boolean getSuppressValueIcon() {
		return field.getSuppressValueIcon();
	}

	public String getTarget() {
		return field.getTarget();
	}

	public ListGridFieldType getType() {
		return field.getType();
	}

	public Boolean getValidateOnChange() {
		return field.getValidateOnChange();
	}

	public String getValueField() {
		return field.getValueField();
	}

	public Integer getValueIconHeight() {
		return field.getValueIconHeight();
	}

	public Integer getValueIconLeftPadding() {
		return field.getValueIconLeftPadding();
	}

	public String getValueIconOrientation() {
		return field.getValueIconOrientation();
	}

	public Integer getValueIconRightPadding() {
		return field.getValueIconRightPadding();
	}

	public Integer getValueIconSize() {
		return field.getValueIconSize();
	}

	public Integer getValueIconWidth() {
		return field.getValueIconWidth();
	}

	public String getWidth() {
		return field.getWidth();
	}

	public int hashCode() {
		return field.hashCode();
	}
	
	/**
	 * Usar os valores do enum: Alignment
	 * @param value
	 */
	public void setAlign(String value) {
		Alignment align = Alignment.valueOf(value.toUpperCase());
		if(align != null) {
			field.setAlign(align);
		}
	}

	public void setAttribute(String property, BaseClass value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseClass[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, boolean value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Boolean value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Date value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, double value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Double value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Float value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, int value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, int[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Integer value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, JavaScriptObject value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Map value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Object value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, String value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, String[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum[] value) {
		field.setAttribute(property, value);
	}

	public void setAutoFetchDisplayMap(Boolean autoFetchDisplayMap) {
		field.setAutoFetchDisplayMap(autoFetchDisplayMap);
	}

	public void setAutoFreeze(Boolean autoFreeze) {
		field.setAutoFreeze(autoFreeze);
	}

	public void setBaseStyle(String baseStyle) {
		field.setBaseStyle(baseStyle);
	}

	public void setCanDragResize(Boolean canDragResize) {
		field.setCanDragResize(canDragResize);
	}

	public void setCanEdit(Boolean canEdit) {
		field.setCanEdit(canEdit);
	}

	public void setCanExport(Boolean canExport) {
		field.setCanExport(canExport);
	}

	public void setCanFilter(Boolean canFilter) {
		field.setCanFilter(canFilter);
	}

	public void setCanFreeze(Boolean canFreeze) {
		field.setCanFreeze(canFreeze);
	}

	public void setCanGroupBy(Boolean canGroupBy) {
		field.setCanGroupBy(canGroupBy);
	}

	public void setCanHide(Boolean canHide) {
		field.setCanHide(canHide);
	}

	public void setCanReorder(Boolean canReorder) {
		field.setCanReorder(canReorder);
	}

	public void setCanSort(Boolean canSort) {
		field.setCanSort(canSort);
	}

	public void setCanSortClientOnly(Boolean canSortClientOnly) {
		field.setCanSortClientOnly(canSortClientOnly);
	}

	public void setCanToggle(Boolean canToggle) {
		field.setCanToggle(canToggle);
	}

	public void setCellAlign(Alignment cellAlign) {
		field.setCellAlign(cellAlign);
	}

	public void setCellFormatter(CellFormatter formatter) {
		field.setCellFormatter(formatter);
	}

	public void setCellIcon(String cellIcon) {
		field.setCellIcon(cellIcon);
	}

	public void setDateFormatter(DateDisplayFormat dateFormatter) {
		field.setDateFormatter(dateFormatter);
	}

	public void setDefaultFilterValue(Boolean defaultFilterValue) {
		field.setDefaultFilterValue(defaultFilterValue);
	}

	public void setDefaultFilterValue(Date defaultFilterValue) {
		field.setDefaultFilterValue(defaultFilterValue);
	}

	public void setDefaultFilterValue(Float defaultFilterValue) {
		field.setDefaultFilterValue(defaultFilterValue);
	}

	public void setDefaultFilterValue(Integer defaultFilterValue) {
		field.setDefaultFilterValue(defaultFilterValue);
	}

	public void setDefaultFilterValue(String defaultFilterValue) {
		field.setDefaultFilterValue(defaultFilterValue);
	}

	public void setDefaultGroupingMode(String defaultGroupingMode) {
		field.setDefaultGroupingMode(defaultGroupingMode);
	}

	public void setDefaultIconSrc(String defaultIconSrc) {
		field.setDefaultIconSrc(defaultIconSrc);
	}

	public void setDefaultValue(Boolean defaultValue) {
		field.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Date defaultValue) {
		field.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Float defaultValue) {
		field.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Integer defaultValue) {
		field.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(String defaultValue) {
		field.setDefaultValue(defaultValue);
	}

	public void setDisplayField(String displayField) {
		field.setDisplayField(displayField);
	}

	public void setEditorIconHeight(Integer editorIconHeight) {
		field.setEditorIconHeight(editorIconHeight);
	}

	public void setEditorIconWidth(Integer editorIconWidth) {
		field.setEditorIconWidth(editorIconWidth);
	}

	public void setEditorImageURLPrefix(String editorImageURLPrefix) {
		field.setEditorImageURLPrefix(editorImageURLPrefix);
	}

	public void setEditorImageURLSuffix(String editorImageURLSuffix) {
		field.setEditorImageURLSuffix(editorImageURLSuffix);
	}

	public void setEditorType(FormItem editorType) {
		field.setEditorType(editorType);
	}

	public void setEditorValueIconHeight(Integer editorValueIconHeight) {
		field.setEditorValueIconHeight(editorValueIconHeight);
	}

	public void setEditorValueIcons(Map<String, String> editorValueIcons) {
		field.setEditorValueIcons(editorValueIcons);
	}

	public void setEditorValueIconWidth(Integer editorValueIconWidth) {
		field.setEditorValueIconWidth(editorValueIconWidth);
	}

	public void setEditorValueMap(Map editorValueMap) {
		field.setEditorValueMap(editorValueMap);
	}

	public void setEditorValueMapFunction(
			EditorValueMapFunction editorValueMapFunction) {
		field.setEditorValueMapFunction(editorValueMapFunction);
	}

	public void setEmptyCellValue(String emptyCellValue) {
		field.setEmptyCellValue(emptyCellValue);
	}

	public void setEnterKeyEditAction(EnterKeyEditAction enterKeyEditAction) {
		field.setEnterKeyEditAction(enterKeyEditAction);
	}

	public void setEscapeKeyEditAction(EscapeKeyEditAction escapeKeyEditAction) {
		field.setEscapeKeyEditAction(escapeKeyEditAction);
	}

	public void setFilterEditorType(FormItem filterEditorType) {
		field.setFilterEditorType(filterEditorType);
	}

	public void setFilterEditorValueMap(Map filterEditorValueMap) {
		field.setFilterEditorValueMap(filterEditorValueMap);
	}

	public void setFilterOnKeypress(Boolean filterOnKeypress) {
		field.setFilterOnKeypress(filterOnKeypress);
	}

	public void setFilterOperator(OperatorId filterOperator) {
		field.setFilterOperator(filterOperator);
	}

	public void setFrozen(Boolean frozen) {
		field.setFrozen(frozen);
	}

	public void setGroupGranularity(Integer groupGranularity) {
		field.setGroupGranularity(groupGranularity);
	}

	public void setGroupingMode(String groupingMode) {
		field.setGroupingMode(groupingMode);
	}

	public void setGroupingModes(Map groupingModes) {
		field.setGroupingModes(groupingModes);
	}

	public void setGroupPrecision(Integer groupPrecision) {
		field.setGroupPrecision(groupPrecision);
	}

	public void setGroupTitleRenderer(GroupTitleRenderer groupTitleRenderer) {
		field.setGroupTitleRenderer(groupTitleRenderer);
	}

	public void setGroupValueFunction(GroupValueFunction groupValueFunction) {
		field.setGroupValueFunction(groupValueFunction);
	}

	public void setHeaderBaseStyle(String headerBaseStyle) {
		field.setHeaderBaseStyle(headerBaseStyle);
	}

	public void setHeaderButtonProperties(Button buttonProperties) {
		field.setHeaderButtonProperties(buttonProperties);
	}

	public void setHeaderTitleStyle(String headerTitleStyle) {
		field.setHeaderTitleStyle(headerTitleStyle);
	}

	public void setHidden(boolean hidden) {
		field.setHidden(hidden);
	}

	public void setHoverCustomizer(HoverCustomizer hoverCustomizer) {
		field.setHoverCustomizer(hoverCustomizer);
	}

	public void setIcon(String icon) {
		field.setIcon(icon);
	}

	public void setIconHeight(Integer iconHeight) {
		field.setIconHeight(iconHeight);
	}

	public void setIconOrientation(String iconOrientation) {
		field.setIconOrientation(iconOrientation);
	}

	public void setIcons(FormItemIcon... icons) {
		field.setIcons(icons);
	}

	public void setIconSize(Integer iconSize) {
		field.setIconSize(iconSize);
	}

	public void setIconSpacing(int iconSpacing) {
		field.setIconSpacing(iconSpacing);
	}

	public void setIconVAlign(String iconVAlign) {
		field.setIconVAlign(iconVAlign);
	}

	public void setIconWidth(Integer iconWidth) {
		field.setIconWidth(iconWidth);
	}

	public void setImageHeight(int imageHeight) {
		field.setImageHeight(imageHeight);
	}

	public void setImageSize(int imageSize) {
		field.setImageSize(imageSize);
	}

	public void setImageURLPrefix(String imageURLPrefix) {
		field.setImageURLPrefix(imageURLPrefix);
	}

	public void setImageURLSuffix(String imageURLSuffix) {
		field.setImageURLSuffix(imageURLSuffix);
	}

	public void setImageWidth(int imageWidth) {
		field.setImageWidth(imageWidth);
	}

	public void setImgDir(String imgDir) {
		field.setImgDir(imgDir);
	}

	public void setIncludeInRecordSummary(Boolean includeInRecordSummary) {
		field.setIncludeInRecordSummary(includeInRecordSummary);
	}

	public void setIsRemoveField(Boolean isRemoveField) {
		field.setIsRemoveField(isRemoveField);
	}

	public void setJsObj(JavaScriptObject jsObj) {
		field.setJsObj(jsObj);
	}

	public void setLinkText(String linkText) {
		field.setLinkText(linkText);
	}

	public void setMultiple(boolean multiple) {
		field.setMultiple(multiple);
	}

	public void setOptionCriteria(Criteria optionCriteria) {
		field.setOptionCriteria(optionCriteria);
	}

	public void setOptionDataSource(DataSource optionDataSource) {
		field.setOptionDataSource(optionDataSource);
	}

	public void setOptionFilterContext(DSRequest optionFilterContext) {
		field.setOptionFilterContext(optionFilterContext);
	}

	public void setOptionOperationId(String optionOperationId) {
		field.setOptionOperationId(optionOperationId);
	}

	public void setOptionTextMatchStyle(TextMatchStyle optionTextMatchStyle) {
		field.setOptionTextMatchStyle(optionTextMatchStyle);
	}

	public void setPartialSummary(Boolean partialSummary) {
		field.setPartialSummary(partialSummary);
	}

	public void setPrompt(String prompt) {
		field.setPrompt(prompt);
	}

	public void setRecordSummaryFunction(
			RecordSummaryFunction recordSummaryFunction) {
		field.setRecordSummaryFunction(recordSummaryFunction);
	}

	public void setRecordSummaryFunction(
			RecordSummaryFunctionType recordSummaryFunction) {
		field.setRecordSummaryFunction(recordSummaryFunction);
	}

	public void setRequired(Boolean required) {
		field.setRequired(required);
	}

	public void setShouldPrint(Boolean shouldPrint) {
		field.setShouldPrint(shouldPrint);
	}

	public void setShowAlternateStyle(Boolean showAlternateStyle) {
		field.setShowAlternateStyle(showAlternateStyle);
	}

	public void setShowDefaultContextMenu(Boolean showDefaultContextMenu) {
		field.setShowDefaultContextMenu(showDefaultContextMenu);
	}

	public void setShowDisabledIcon(Boolean showDisabledIcon) {
		field.setShowDisabledIcon(showDisabledIcon);
	}

	public void setShowDownIcon(Boolean showDownIcon) {
		field.setShowDownIcon(showDownIcon);
	}

	public void setShowFileInline(Boolean showFileInline) {
		field.setShowFileInline(showFileInline);
	}

	public void setShowFocusedIcon(Boolean showFocusedIcon) {
		field.setShowFocusedIcon(showFocusedIcon);
	}

	public void setShowGridSummary(Boolean showGridSummary) {
		field.setShowGridSummary(showGridSummary);
	}

	public void setShowGroupSummary(Boolean showGroupSummary) {
		field.setShowGroupSummary(showGroupSummary);
	}

	public void setShowHover(Boolean showHover) {
		field.setShowHover(showHover);
	}

	public void setShowIfCondition(ListGridFieldIfFunction showIf) {
		field.setShowIfCondition(showIf);
	}

	public void setShowRollOverIcon(Boolean showRollOverIcon) {
		field.setShowRollOverIcon(showRollOverIcon);
	}

	public void setShowSelectedIcon(Boolean showSelectedIcon) {
		field.setShowSelectedIcon(showSelectedIcon);
	}

	public void setShowValueIconOnly(Boolean showValueIconOnly) {
		field.setShowValueIconOnly(showValueIconOnly);
	}

	public void setSortDirection(SortDirection sortDirection) {
		field.setSortDirection(sortDirection);
	}

	public void setSortNormalizer(SortNormalizer normalizer) {
		field.setSortNormalizer(normalizer);
	}

//	public void setSummaryFunction(SummaryFunction summaryFunction) {
//		field.setSummaryFunction(summaryFunction);
//	}

	public void setSummaryFunction(SummaryFunctionType summaryFunction) {
		field.setSummaryFunction(summaryFunction);
	}

	public void setSummaryTitle(String summaryTitle) {
		field.setSummaryTitle(summaryTitle);
	}

	public void setSuppressValueIcon(Boolean suppressValueIcon) {
		field.setSuppressValueIcon(suppressValueIcon);
	}

	public void setTarget(String target) {
		field.setTarget(target);
	}

	public void setType(ListGridFieldType type) {
		field.setType(type);
	}

	public void setValidateOnChange(Boolean validateOnChange) {
		field.setValidateOnChange(validateOnChange);
	}

	public void setValidators(Validator... validators) {
		field.setValidators(validators);
	}

	public void setValueField(String valueField) {
		field.setValueField(valueField);
	}

	public void setValueIconHeight(Integer valueIconHeight) {
		field.setValueIconHeight(valueIconHeight);
	}

	public void setValueIconLeftPadding(Integer valueIconLeftPadding) {
		field.setValueIconLeftPadding(valueIconLeftPadding);
	}

	public void setValueIconOrientation(String valueIconOrientation) {
		field.setValueIconOrientation(valueIconOrientation);
	}

	public void setValueIconRightPadding(Integer valueIconRightPadding) {
		field.setValueIconRightPadding(valueIconRightPadding);
	}

	public void setValueIcons(Map<String, String> valueIcons) {
		field.setValueIcons(valueIcons);
	}

	public void setValueIconSize(Integer valueIconSize) {
		field.setValueIconSize(valueIconSize);
	}

	public void setValueIconWidth(Integer valueIconWidth) {
		field.setValueIconWidth(valueIconWidth);
	}

	public void setValueMap(Map valueMap) {
		field.setValueMap(valueMap);
	}

	public void setValueMap(String... valueMap) {
		field.setValueMap(valueMap);
	}

	public void setWidth(int width) {
		field.setWidth(width);
	}

	public void setWidth(String width) {
		field.setWidth(width);
	}

	public void setWrap(boolean wrap) {
		field.setWrap(wrap);
	}

	public String toString() {
		return field.toString();
	}

	@Override
	public ListGridField getSmartObject() {
		return field;
	}

	@Override
	public String getText() {
		return field.getTitle();
	}

	@Override
	public void setText(String title) {
		field.setTitle(title);
	}
}
