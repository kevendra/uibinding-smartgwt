package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.core.Rectangle;
import com.smartgwt.client.data.Criteria;
import com.smartgwt.client.data.Criterion;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.rpc.RPCRequest;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.DateDisplayFormat;
import com.smartgwt.client.types.DateItemSelectorFormat;
import com.smartgwt.client.types.FormErrorOrientation;
import com.smartgwt.client.types.OperatorId;
import com.smartgwt.client.types.TimeDisplayFormat;
import com.smartgwt.client.types.TitleOrientation;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.FormItemErrorFormatter;
import com.smartgwt.client.widgets.form.FormItemHoverFormatter;
import com.smartgwt.client.widgets.form.FormItemIfFunction;
import com.smartgwt.client.widgets.form.FormItemInputTransformer;
import com.smartgwt.client.widgets.form.FormItemValueFormatter;
import com.smartgwt.client.widgets.form.FormItemValueParser;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.FormItemIcon;
import com.smartgwt.client.widgets.form.fields.events.BlurHandler;
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler;
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;
import com.smartgwt.client.widgets.form.fields.events.DoubleClickHandler;
import com.smartgwt.client.widgets.form.fields.events.FocusHandler;
import com.smartgwt.client.widgets.form.fields.events.IconClickHandler;
import com.smartgwt.client.widgets.form.fields.events.IconKeyPressHandler;
import com.smartgwt.client.widgets.form.fields.events.ItemHoverHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyDownHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyPressHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyUpHandler;
import com.smartgwt.client.widgets.form.fields.events.TitleHoverHandler;
import com.smartgwt.client.widgets.form.validator.Validator;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class UIDateItem extends UIFormItem<DateItem> {

	public UIDateItem() {
		item = new DateItem();
	}

	public HandlerRegistration addBlurHandler(BlurHandler handler) {
		return item.addBlurHandler(handler);
	}

	public HandlerRegistration addChangedHandler(ChangedHandler handler) {
		return item.addChangedHandler(handler);
	}

	public HandlerRegistration addChangeHandler(ChangeHandler handler) {
		return item.addChangeHandler(handler);
	}

	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return item.addClickHandler(handler);
	}

	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
		return item.addDoubleClickHandler(handler);
	}

	public HandlerRegistration addFocusHandler(FocusHandler handler) {
		return item.addFocusHandler(handler);
	}

	public HandlerRegistration addIconClickHandler(IconClickHandler handler) {
		return item.addIconClickHandler(handler);
	}

	public HandlerRegistration addIconKeyPressHandler(IconKeyPressHandler handler) {
		return item.addIconKeyPressHandler(handler);
	}

	public HandlerRegistration addItemHoverHandler(ItemHoverHandler handler) {
		return item.addItemHoverHandler(handler);
	}

	public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
		return item.addKeyDownHandler(handler);
	}

	public HandlerRegistration addKeyPressHandler(KeyPressHandler handler) {
		return item.addKeyPressHandler(handler);
	}

	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		return item.addKeyUpHandler(handler);
	}

	public HandlerRegistration addTitleHoverHandler(TitleHoverHandler handler) {
		return item.addTitleHoverHandler(handler);
	}

	public void blurItem() {
		item.blurItem();
	}

	public Boolean canEditCriterion(Criterion criterion) {
		return item.canEditCriterion(criterion);
	}

	public void clearValue() {
		item.clearValue();
	}

	public void deselectValue() {
		item.deselectValue();
	}

	public void deselectValue(boolean start) {
		item.deselectValue(start);
	}

	public void disable() {
		item.disable();
	}

	public void enable() {
		item.enable();
	}

	public boolean equals(Object obj) {
		return item.equals(obj);
	}

	public void fireEvent(GwtEvent<?> event) {
		item.fireEvent(event);
	}

	public void focusInItem() {
		item.focusInItem();
	}

	public String getAccessKey() {
		return item.getAccessKey();
	}

	public Alignment getAlign() {
		return item.getAlign();
	}

	public String getAttribute(String attribute) {
		return item.getAttribute(attribute);
	}

	public Boolean getAttributeAsBoolean(String attribute) {
		return item.getAttributeAsBoolean(attribute);
	}

	public Date getAttributeAsDate(String attribute) {
		return item.getAttributeAsDate(attribute);
	}

	public Double getAttributeAsDouble(String attribute) {
		return item.getAttributeAsDouble(attribute);
	}

	public Float getAttributeAsFloat(String attribute) {
		return item.getAttributeAsFloat(attribute);
	}

	public Integer getAttributeAsInt(String attribute) {
		return item.getAttributeAsInt(attribute);
	}

	public int[] getAttributeAsIntArray(String property) {
		return item.getAttributeAsIntArray(property);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String attribute) {
		return item.getAttributeAsJavaScriptObject(attribute);
	}

	public Map getAttributeAsMap(String property) {
		return item.getAttributeAsMap(property);
	}

	public Object getAttributeAsObject(String property) {
		return item.getAttributeAsObject(property);
	}

	public String getAttributeAsString(String attribute) {
		return item.getAttributeAsString(attribute);
	}

	public String[] getAttributeAsStringArray(String property) {
		return item.getAttributeAsStringArray(property);
	}

	public String[] getAttributes() {
		return item.getAttributes();
	}

	public Integer getCellHeight() {
		return item.getCellHeight();
	}

	public String getCellStyle() {
		return item.getCellStyle();
	}

	public int getCenturyThreshold() {
		return item.getCenturyThreshold();
	}

	public JavaScriptObject getConfig() {
		return item.getConfig();
	}

	public String getCriteriaField() {
		return item.getCriteriaField();
	}

	public Criterion getCriterion() {
		return item.getCriterion();
	}

	public String getDataPath() {
		return item.getDataPath();
	}

	public DateDisplayFormat getDateFormatter() {
		return item.getDateFormatter();
	}

	public String getDefaultIconSrc() {
		return item.getDefaultIconSrc();
	}

	public Boolean getDisabled() {
		return item.getDisabled();
	}

	public String getDisplayField() {
		return item.getDisplayField();
	}

	public String getDisplayFieldName() {
		return item.getDisplayFieldName();
	}

//	public DateDisplayFormat getDisplayFormat() {
//		return item.getDisplayFormat();
//	}

	public String getDisplayValue() {
		return item.getDisplayValue();
	}

	public String getDisplayValue(String value) {
		return item.getDisplayValue(value);
	}

	public String getEmptyDisplayValue() {
		return item.getEmptyDisplayValue();
	}

	public String getEmptyValueIcon() {
		return item.getEmptyValueIcon();
	}

	public Date getEndDate() {
		return item.getEndDate();
	}

	public Boolean getEndRow() {
		return item.getEndRow();
	}

	public Boolean getEnforceDate() {
		return item.getEnforceDate();
	}

	public int getErrorIconHeight() {
		return item.getErrorIconHeight();
	}

	public String getErrorIconSrc() {
		return item.getErrorIconSrc();
	}

	public int getErrorIconWidth() {
		return item.getErrorIconWidth();
	}

	public int getErrorMessageWidth() {
		return item.getErrorMessageWidth();
	}

	public Boolean getFetchMissingValues() {
		return item.getFetchMissingValues();
	}

	public String getFieldName() {
		return item.getFieldName();
	}

	public Boolean getFilterLocally() {
		return item.getFilterLocally();
	}

	public DynamicForm getForm() {
		return item.getForm();
	}

	public Integer getGlobalTabIndex() {
		return item.getGlobalTabIndex();
	}

	public int getHandlerCount(Type<?> type) {
		return item.getHandlerCount(type);
	}

	public int getHeight() {
		return item.getHeight();
	}

	public String getHint() {
		return item.getHint();
	}

	public String getHintStyle() {
		return item.getHintStyle();
	}

	public Alignment getHoverAlign() {
		return item.getHoverAlign();
	}

	public Integer getHoverDelay() {
		return item.getHoverDelay();
	}

	public Integer getHoverHeight() {
		return item.getHoverHeight();
	}

	public Integer getHoverOpacity() {
		return item.getHoverOpacity();
	}

	public String getHoverStyle() {
		return item.getHoverStyle();
	}

	public VerticalAlignment getHoverVAlign() {
		return item.getHoverVAlign();
	}

	public Integer getHoverWidth() {
		return item.getHoverWidth();
	}

	public FormItemIcon getIcon(String name) {
		return item.getIcon(name);
	}

	public int getIconHeight() {
		return item.getIconHeight();
	}

	public Rectangle getIconPageRect(FormItemIcon icon) {
		return item.getIconPageRect(icon);
	}

	public String getIconPrompt() {
		return item.getIconPrompt();
	}

	public Rectangle getIconRect(FormItemIcon icon) {
		return item.getIconRect(icon);
	}

	public VerticalAlignment getIconVAlign() {
		return item.getIconVAlign();
	}

	public int getIconWidth() {
		return item.getIconWidth();
	}

	public String getImageURLPrefix() {
		return item.getImageURLPrefix();
	}

	public String getImageURLSuffix() {
		return item.getImageURLSuffix();
	}

	public String getInputFormat() {
		return item.getInputFormat();
	}

	public String getInvalidDateStringMessage() {
		return item.getInvalidDateStringMessage();
	}

	public JavaScriptObject getJsObj() {
		return item.getJsObj();
	}

	public int getLeft() {
		return item.getLeft();
	}

	public String getLocateItemBy() {
		return item.getLocateItemBy();
	}

	public String getMultipleValueSeparator() {
		return item.getMultipleValueSeparator();
	}

	public String getName() {
		return item.getName();
	}

	public OperatorId getOperator() {
		return item.getOperator();
	}

	public Criteria getOptionCriteria() {
		return item.getOptionCriteria();
	}

	public RPCRequest getOptionFilterContext() {
		return item.getOptionFilterContext();
	}

	public String getOptionOperationId() {
		return item.getOptionOperationId();
	}

	public Integer getPickerIconHeight() {
		return item.getPickerIconHeight();
	}

	public String getPickerIconName() {
		return item.getPickerIconName();
	}

	public String getPickerIconPrompt() {
		return item.getPickerIconPrompt();
	}

	public String getPickerIconSrc() {
		return item.getPickerIconSrc();
	}

	public Integer getPickerIconWidth() {
		return item.getPickerIconWidth();
	}

	public String getPrintTextBoxStyle() {
		return item.getPrintTextBoxStyle();
	}

	public String getPrintTitleStyle() {
		return item.getPrintTitleStyle();
	}

	public String getPrompt() {
		return item.getPrompt();
	}

	public Boolean getRejectInvalidValueOnChange() {
		return item.getRejectInvalidValueOnChange();
	}

	public Boolean getRequired() {
		return item.getRequired();
	}

	public String getRequiredMessage() {
		return item.getRequiredMessage();
	}

	public int getRowSpan() {
		return item.getRowSpan();
	}

	public ListGridRecord getSelectedRecord() {
		return item.getSelectedRecord();
	}

	public int[] getSelectionRange() {
		return item.getSelectionRange();
	}

	public Boolean getSelectOnFocus() {
		return item.getSelectOnFocus();
	}

	public DateItemSelectorFormat getSelectorFormat() {
		return item.getSelectorFormat();
	}

	public Boolean getShouldSaveValue() {
		return item.getShouldSaveValue();
	}

	public Boolean getShowDisabled() {
		return item.getShowDisabled();
	}

	public Boolean getShowErrorIcon() {
		return item.getShowErrorIcon();
	}

	public Boolean getShowErrorStyle() {
		return item.getShowErrorStyle();
	}

	public Boolean getShowErrorText() {
		return item.getShowErrorText();
	}

	public Boolean getShowFocused() {
		return item.getShowFocused();
	}

	public Boolean getShowFocusedIcons() {
		return item.getShowFocusedIcons();
	}

	public Boolean getShowFocusedPickerIcon() {
		return item.getShowFocusedPickerIcon();
	}

	public Boolean getShowHint() {
		return item.getShowHint();
	}

	public Boolean getShowIcons() {
		return item.getShowIcons();
	}

	public Boolean getShowOverIcons() {
		return item.getShowOverIcons();
	}

	public Boolean getShowPickerIcon() {
		return item.getShowPickerIcon();
	}

	public Boolean getShowTitle() {
		return item.getShowTitle();
	}

	public Boolean getShowValueIconOnly() {
		return item.getShowValueIconOnly();
	}

	public Date getStartDate() {
		return item.getStartDate();
	}

	public Boolean getStartRow() {
		return item.getStartRow();
	}

	public Boolean getStopOnError() {
		return item.getStopOnError();
	}

	public Boolean getSuppressValueIcon() {
		return item.getSuppressValueIcon();
	}

	public Boolean getSynchronousValidation() {
		return item.getSynchronousValidation();
	}

	public Integer getTabIndex() {
		return item.getTabIndex();
	}

	public Alignment getTextAlign() {
		return item.getTextAlign();
	}

	public String getTextBoxStyle() {
		return item.getTextBoxStyle();
	}

	public TimeDisplayFormat getTimeDisplayFormat() {
		return item.getTimeFormatter();
	}

	public String getTitle() {
		return item.getTitle();
	}

	public Alignment getTitleAlign() {
		return item.getTitleAlign();
	}

	public TitleOrientation getTitleOrientation() {
		return item.getTitleOrientation();
	}

	public String getTitleStyle() {
		return item.getTitleStyle();
	}

	public VerticalAlignment getTitleVAlign() {
		return item.getTitleVAlign();
	}

	public String getTooltip() {
		return item.getTooltip();
	}

	public int getTop() {
		return item.getTop();
	}

	public String getType() {
		return item.getType();
	}

	public Boolean getUseSharedPicker() {
		return item.getUseSharedPicker();
	}

	public Boolean getUseTextField() {
		return item.getUseTextField();
	}

	public Boolean getValidateOnChange() {
		return item.getValidateOnChange();
	}

	public Boolean getValidateOnExit() {
		return item.getValidateOnExit();
	}

	public Object getValue() {
		return item.getValue();
	}

	public String getValueField() {
		return item.getValueField();
	}

	public String getValueFieldName() {
		return item.getValueFieldName();
	}

	public Integer getValueIconHeight() {
		return item.getValueIconHeight();
	}

	public int getValueIconLeftPadding() {
		return item.getValueIconLeftPadding();
	}

	public int getValueIconRightPadding() {
		return item.getValueIconRightPadding();
	}

	public int getValueIconSize() {
		return item.getValueIconSize();
	}

	public Integer getValueIconWidth() {
		return item.getValueIconWidth();
	}

	public Boolean getVisible() {
		return item.getVisible();
	}

	public int getVisibleHeight() {
		return item.getVisibleHeight();
	}

	public int getVisibleWidth() {
		return item.getVisibleWidth();
	}

	public int getWidth() {
		return item.getWidth();
	}

	public Boolean getWrapTitle() {
		return item.getWrapTitle();
	}

	public Boolean hasAdvancedCriteria() {
		return item.hasAdvancedCriteria();
	}

	public int hashCode() {
		return item.hashCode();
	}

	public void hide() {
		item.hide();
	}

	public Boolean isDisabled() {
		return item.isDisabled();
	}

	public Boolean isDrawn() {
		return item.isDrawn();
	}

	public void redraw() {
		item.redraw();
	}

	public void selectValue() {
		item.selectValue();
	}

	public void setAccessKey(String accessKey) {
		item.setAccessKey(accessKey);
	}

	public void setAlign(Alignment align) {
		item.setAlign(align);
	}

	public void setAttribute(String property, BaseClass value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String attribute, BaseClass[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String attribute, boolean value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, Boolean value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, DataClass value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, DataClass[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, Date value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, double value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String property, Double value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String property, Float value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String attribute, int value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, int[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String property, Integer value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String attribute, JavaScriptObject value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, Map value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String property, Object value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String attribute, String value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, String[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String property, ValueEnum value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String attribute, ValueEnum[] value) {
		item.setAttribute(attribute, value);
	}

	public void setCellHeight(Integer cellHeight) {
		item.setCellHeight(cellHeight);
	}

	public void setCellStyle(String cellStyle) {
		item.setCellStyle(cellStyle);
	}

	public void setCenturyThreshold(int centuryThreshold) {
		item.setCenturyThreshold(centuryThreshold);
	}

	public void setColSpan(int colSpan) {
		item.setColSpan(colSpan);
	}

	public void setColSpan(String colSpan) {
		item.setColSpan(colSpan);
	}

	public void setCriteriaField(String criteriaField) {
		item.setCriteriaField(criteriaField);
	}

	public void setCriterion(Criterion criterion) {
		item.setCriterion(criterion);
	}

	public void setDataPath(String dataPath) {
		item.setDataPath(dataPath);
	}

	public void setDateFormatter(DateDisplayFormat dateFormatter) {
		item.setDateFormatter(dateFormatter);
	}

	public void setDefaultIconSrc(String defaultIconSrc) {
		item.setDefaultIconSrc(defaultIconSrc);
	}

	public void setDefaultValue(Boolean defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Date defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Float defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Integer defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(String defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDisabled(Boolean disabled) {
		item.setDisabled(disabled);
	}

	public void setDisplayField(String displayField) {
		item.setDisplayField(displayField);
	}

	public void setDisplayFormat(DateDisplayFormat displayFormat) {
		item.setDisplayFormat(displayFormat);
	}

	public void setEditorType(FormItem editorType) {
		item.setEditorType(editorType);
	}

	public void setEditorValueFormatter(FormItemValueFormatter formatter) {
		item.setEditorValueFormatter(formatter);
	}

	public void setEditorValueParser(FormItemValueParser valueParser) {
		item.setEditorValueParser(valueParser);
	}

	public void setEmptyDisplayValue(String emptyDisplayValue) {
		item.setEmptyDisplayValue(emptyDisplayValue);
	}

	public void setEmptyValueIcon(String emptyValueIcon) {
		item.setEmptyValueIcon(emptyValueIcon);
	}

	public void setEndDate(Date endDate) {
		item.setEndDate(endDate);
	}

	public void setEndRow(Boolean endRow) {
		item.setEndRow(endRow);
	}

	public void setEnforceDate(Boolean enforceDate) {
		item.setEnforceDate(enforceDate);
	}

	public void setErrorFormatter(FormItemErrorFormatter errorFormatter) {
		item.setErrorFormatter(errorFormatter);
	}

	public void setErrorIconHeight(int errorIconHeight) {
		item.setErrorIconHeight(errorIconHeight);
	}

	public void setErrorIconSrc(String errorIconSrc) {
		item.setErrorIconSrc(errorIconSrc);
	}

	public void setErrorIconWidth(int errorIconWidth) {
		item.setErrorIconWidth(errorIconWidth);
	}

	public void setErrorMessageWidth(int errorMessageWidth) {
		item.setErrorMessageWidth(errorMessageWidth);
	}

	public void setErrorOrientation(FormErrorOrientation errorOrientation) {
		item.setErrorOrientation(errorOrientation);
	}

	public void setFetchMissingValues(Boolean fetchMissingValues) {
		item.setFetchMissingValues(fetchMissingValues);
	}

	public void setFilterLocally(Boolean filterLocally) {
		item.setFilterLocally(filterLocally);
	}

	public void setGlobalTabIndex(Integer globalTabIndex) {
		item.setGlobalTabIndex(globalTabIndex);
	}

	public void setHeight(int height) {
		item.setHeight(height);
	}

	public void setHeight(String height) {
		item.setHeight(height);
	}

	public void setHint(String hint) {
		item.setHint(hint);
	}

	public void setHintStyle(String hintStyle) {
		item.setHintStyle(hintStyle);
	}

	public void setHoverAlign(Alignment hoverAlign) {
		item.setHoverAlign(hoverAlign);
	}

	public void setHoverDelay(Integer hoverDelay) {
		item.setHoverDelay(hoverDelay);
	}

	public void setHoverHeight(Integer hoverHeight) {
		item.setHoverHeight(hoverHeight);
	}

	public void setHoverOpacity(Integer hoverOpacity) {
		item.setHoverOpacity(hoverOpacity);
	}

	public void setHoverStyle(String hoverStyle) {
		item.setHoverStyle(hoverStyle);
	}

	public void setHoverVAlign(VerticalAlignment hoverVAlign) {
		item.setHoverVAlign(hoverVAlign);
	}

	public void setHoverWidth(Integer hoverWidth) {
		item.setHoverWidth(hoverWidth);
	}

	public void setIconHeight(int iconHeight) {
		item.setIconHeight(iconHeight);
	}

	public void setIconPrompt(String iconPrompt) {
		item.setIconPrompt(iconPrompt);
	}

	public void setIcons(FormItemIcon... icons) {
		item.setIcons(icons);
	}

	public void setIconVAlign(VerticalAlignment iconVAlign) {
		item.setIconVAlign(iconVAlign);
	}

	public void setIconWidth(int iconWidth) {
		item.setIconWidth(iconWidth);
	}

	public void setImageURLPrefix(String imageURLPrefix) {
		item.setImageURLPrefix(imageURLPrefix);
	}

	public void setImageURLSuffix(String imageURLSuffix) {
		item.setImageURLSuffix(imageURLSuffix);
	}

	public void setInputFormat(String inputFormat) {
		item.setInputFormat(inputFormat);
	}

	public void setInputTransformer(FormItemInputTransformer inputTransformer) {
		item.setInputTransformer(inputTransformer);
	}

	public void setInvalidDateStringMessage(String invalidDateStringMessage) {
		item.setInvalidDateStringMessage(invalidDateStringMessage);
	}

	public void setItemHoverFormatter(FormItemHoverFormatter hoverFormatter) {
		item.setItemHoverFormatter(hoverFormatter);
	}

	public void setItemTitleHoverFormatter(FormItemHoverFormatter hoverFormatter) {
		item.setItemTitleHoverFormatter(hoverFormatter);
	}

	public void setJsObj(JavaScriptObject jsObj) {
		item.setJsObj(jsObj);
	}

	public void setLeft(int left) {
		item.setLeft(left);
	}

	public void setLocateItemBy(String locateItemBy) {
		item.setLocateItemBy(locateItemBy);
	}

	public void setMaskDateSeparator(String maskDateSeparator) {
		item.setMaskDateSeparator(maskDateSeparator);
	}

	public void setMultipleValueSeparator(String multipleValueSeparator) {
		item.setMultipleValueSeparator(multipleValueSeparator);
	}

	public void setName(String name) {
		item.setName(name);
	}

	public void setOperator(OperatorId operator) {
		item.setOperator(operator);
	}

	public void setOptionCriteria(Criteria optionCriteria) {
		item.setOptionCriteria(optionCriteria);
	}

	public void setOptionDataSource(DataSource dataSource) {
		item.setOptionDataSource(dataSource);
	}

	public void setOptionFilterContext(RPCRequest optionFilterContext) {
		item.setOptionFilterContext(optionFilterContext);
	}

	public void setOptionOperationId(String optionOperationId) {
		item.setOptionOperationId(optionOperationId);
	}

	public void setPickerIconHeight(Integer pickerIconHeight) {
		item.setPickerIconHeight(pickerIconHeight);
	}

	public void setPickerIconName(String pickerIconName) {
		item.setPickerIconName(pickerIconName);
	}

	public void setPickerIconPrompt(String pickerIconPrompt) {
		item.setPickerIconPrompt(pickerIconPrompt);
	}

	public void setPickerIconSrc(String pickerIconSrc) {
		item.setPickerIconSrc(pickerIconSrc);
	}

	public void setPickerIconWidth(Integer pickerIconWidth) {
		item.setPickerIconWidth(pickerIconWidth);
	}

	public void setPrintTextBoxStyle(String printTextBoxStyle) {
		item.setPrintTextBoxStyle(printTextBoxStyle);
	}

	public void setPrintTitleStyle(String printTitleStyle) {
		item.setPrintTitleStyle(printTitleStyle);
	}

	public void setPrompt(String prompt) {
		item.setPrompt(prompt);
	}

	public void setProperty(String property, boolean value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, double value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, JavaScriptObject value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, String value) {
		item.setProperty(property, value);
	}

	public void setRedrawOnChange(boolean redrawOnChange) {
		item.setRedrawOnChange(redrawOnChange);
	}

	public void setRejectInvalidValueOnChange(Boolean rejectInvalidValueOnChange) {
		item.setRejectInvalidValueOnChange(rejectInvalidValueOnChange);
	}

	public void setRequired(Boolean required) {
		item.setRequired(required);
	}

	public void setRequiredMessage(String requiredMessage) {
		item.setRequiredMessage(requiredMessage);
	}

	public void setRowSpan(int rowSpan) {
		item.setRowSpan(rowSpan);
	}

	public void setSelectionRange(int start, int end) {
		item.setSelectionRange(start, end);
	}

	public void setSelectOnFocus(Boolean selectOnFocus) {
		item.setSelectOnFocus(selectOnFocus);
	}

	public void setSelectorFormat(DateItemSelectorFormat selectorFormat) {
		item.setSelectorFormat(selectorFormat);
	}

	public void setShouldSaveValue(Boolean shouldSaveValue) {
		item.setShouldSaveValue(shouldSaveValue);
	}

	public void setShowDisabled(Boolean showDisabled) {
		item.setShowDisabled(showDisabled);
	}

	public void setShowErrorIcon(Boolean showErrorIcon) {
		item.setShowErrorIcon(showErrorIcon);
	}

	public void setShowErrorStyle(Boolean showErrorStyle) {
		item.setShowErrorStyle(showErrorStyle);
	}

	public void setShowErrorText(Boolean showErrorText) {
		item.setShowErrorText(showErrorText);
	}

	public void setShowFocused(Boolean showFocused) {
		item.setShowFocused(showFocused);
	}

	public void setShowFocusedIcons(Boolean showFocusedIcons) {
		item.setShowFocusedIcons(showFocusedIcons);
	}

	public void setShowFocusedPickerIcon(Boolean showFocusedPickerIcon) {
		item.setShowFocusedPickerIcon(showFocusedPickerIcon);
	}

	public void setShowHint(Boolean showHint) {
		item.setShowHint(showHint);
	}

	public void setShowIcons(Boolean showIcons) {
		item.setShowIcons(showIcons);
	}

	public void setShowIfCondition(FormItemIfFunction showIf) {
		item.setShowIfCondition(showIf);
	}

	public void setShowOverIcons(Boolean showOverIcons) {
		item.setShowOverIcons(showOverIcons);
	}

	public void setShowPickerIcon(Boolean showPickerIcon) {
		item.setShowPickerIcon(showPickerIcon);
	}

	public void setShowTitle(Boolean showTitle) {
		item.setShowTitle(showTitle);
	}

	public void setShowValueIconOnly(Boolean showValueIconOnly) {
		item.setShowValueIconOnly(showValueIconOnly);
	}

	public void setStartDate(Date startDate) {
		item.setStartDate(startDate);
	}

	public void setStartRow(Boolean startRow) {
		item.setStartRow(startRow);
	}

	public void setStopOnError(Boolean stopOnError) {
		item.setStopOnError(stopOnError);
	}

	public void setSuppressValueIcon(Boolean suppressValueIcon) {
		item.setSuppressValueIcon(suppressValueIcon);
	}

	public void setSynchronousValidation(Boolean synchronousValidation) {
		item.setSynchronousValidation(synchronousValidation);
	}

	public void setTabIndex(Integer tabIndex) {
		item.setTabIndex(tabIndex);
	}

	public void setTextAlign(Alignment textAlign) {
		item.setTextAlign(textAlign);
	}

	public void setTextBoxStyle(String textBoxStyle) {
		item.setTextBoxStyle(textBoxStyle);
	}

	public void setTimeFormatter(TimeDisplayFormat timeFormatter) {
		item.setTimeFormatter(timeFormatter);
	}

	public void setTitle(String title) {
		item.setTitle(title);
	}

	public void setTitleAlign(Alignment titleAlign) {
		item.setTitleAlign(titleAlign);
	}

	public void setTitleOrientation(TitleOrientation titleOrientation) {
		item.setTitleOrientation(titleOrientation);
	}

	public void setTitleStyle(String titleStyle) {
		item.setTitleStyle(titleStyle);
	}

	public void setTitleVAlign(VerticalAlignment titleVAlign) {
		item.setTitleVAlign(titleVAlign);
	}

	public void setTooltip(String tooltip) {
		item.setTooltip(tooltip);
	}

	public void setTop(int top) {
		item.setTop(top);
	}

	public void setType(String type) {
		item.setType(type);
	}

	public void setUseMask(Boolean useMask) {
		item.setUseMask(useMask);
	}

	public void setUseSharedPicker(Boolean useSharedPicker) {
		item.setUseSharedPicker(useSharedPicker);
	}

	public void setUseTextField(Boolean useTextField) {
		item.setUseTextField(useTextField);
	}

	public void setValidateOnChange(Boolean validateOnChange) {
		item.setValidateOnChange(validateOnChange);
	}

	public void setValidateOnExit(Boolean validateOnExit) {
		item.setValidateOnExit(validateOnExit);
	}

	public void setValidators(Validator... validators) {
		item.setValidators(validators);
	}

	public void setValue(boolean value) {
		item.setValue(value);
	}

	public void setValue(Date value) {
		item.setValue(value);
	}

	public void setValue(double value) {
		item.setValue(value);
	}

	public void setValue(float value) {
		item.setValue(value);
	}

	public void setValue(int value) {
		item.setValue(value);
	}

	public void setValue(String value) {
		item.setValue(value);
	}

	public void setValueField(String valueField) {
		item.setValueField(valueField);
	}

	public void setValueFormatter(FormItemValueFormatter formatter) {
		item.setValueFormatter(formatter);
	}

	public void setValueIconHeight(Integer valueIconHeight) {
		item.setValueIconHeight(valueIconHeight);
	}

	public void setValueIconLeftPadding(int valueIconLeftPadding) {
		item.setValueIconLeftPadding(valueIconLeftPadding);
	}

	public void setValueIconRightPadding(int valueIconRightPadding) {
		item.setValueIconRightPadding(valueIconRightPadding);
	}

	public void setValueIcons(Map valueIcons) {
		item.setValueIcons(valueIcons);
	}

	public void setValueIconSize(int valueIconSize) {
		item.setValueIconSize(valueIconSize);
	}

	public void setValueIconWidth(Integer valueIconWidth) {
		item.setValueIconWidth(valueIconWidth);
	}

	public void setValueMap(LinkedHashMap valueMap) {
		item.setValueMap(valueMap);
	}

	public void setValueMap(String... valueMap) {
		item.setValueMap(valueMap);
	}

	public void setWidth(int width) {
		item.setWidth(width);
	}

	public void setWidth(String width) {
		item.setWidth(width);
	}

	public void setWrapTitle(Boolean wrapTitle) {
		item.setWrapTitle(wrapTitle);
	}

	public void show() {
		item.show();
	}

	public void stopHover() {
		item.stopHover();
	}

	public String toString() {
		return item.toString();
	}

	public void updateState() {
		item.updateState();
	}

	public Boolean validate() {
		return item.validate();
	}
	
}
