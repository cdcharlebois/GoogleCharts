// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the ExcelImporter module
	public static void _DocumentationDummyXSD(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "ExcelImporter._DocumentationDummyXSD", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void _DocumentationExportParseFlows(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "ExcelImporter._DocumentationExportParseFlows", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void _DocumentationImportParseFlows(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "ExcelImporter._DocumentationImportParseFlows", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCr_Template(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			Core.execute(context, "ExcelImporter.ACr_Template", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * This microflow shows the actions which should be executed when the application is being started.
	 * 
	 * First synchronize all objects using the ModelReflection module. Then validate the excel templats
	 */
	public static boolean aSu_CheckModelAndTemplates(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			return (Boolean)Core.execute(context, "ExcelImporter.ASu_CheckModelAndTemplates", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bCo_Column(IContext context, excelimporter.proxies.Column _pColumn)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("pColumn", _pColumn == null ? null : _pColumn.getMendixObject());
			return (Boolean)Core.execute(context, "ExcelImporter.BCo_Column", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bDe_Column(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			return (Boolean)Core.execute(context, "ExcelImporter.BDe_Column", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_Column_SetDefaultObject(IContext context, excelimporter.proxies.Column _columns)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Columns", _columns == null ? null : _columns.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_Column_SetDefaultObject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_FindAttribute(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_FindAttribute", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_FindAttribute_Reference(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_FindAttribute_Reference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_FindMicroflow(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_FindMicroflow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_FindObjectType_Reference(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_FindObjectType_Reference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_FindReference(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_FindReference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_SetAttribute(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_SetAttribute", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_SetAttribute_Reference(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_SetAttribute_Reference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_SetMicroflow(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_SetMicroflow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_SetObjectType_Reference(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_SetObjectType_Reference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_SetReference(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_SetReference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ch_Template_ChangeObjectType(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			Core.execute(context, "ExcelImporter.Ch_Template_ChangeObjectType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean ch_Template_CheckNrs(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			return (Boolean)Core.execute(context, "ExcelImporter.Ch_Template_CheckNrs", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void column_SetCorrectRefObjectType(IContext context, mxmodelreflection.proxies.MxObjectReference _reference, excelimporter.proxies.Column _column, mxmodelreflection.proxies.MxObjectType _startMxObjectType)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Reference", _reference == null ? null : _reference.getMendixObject());
			params.put("Column", _column == null ? null : _column.getMendixObject());
			params.put("StartMxObjectType", _startMxObjectType == null ? null : _startMxObjectType.getMendixObject());
			Core.execute(context, "ExcelImporter.Column_SetCorrectRefObjectType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void column_SetDetails(IContext context, excelimporter.proxies.Column _pColumn)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("pColumn", _pColumn == null ? null : _pColumn.getMendixObject());
			Core.execute(context, "ExcelImporter.Column_SetDetails", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String columnDataSourceToString(IContext context, excelimporter.proxies.DataSource _dataSource)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("DataSource", _dataSource == null ? null : _dataSource.name());
			return (String)Core.execute(context, "ExcelImporter.ColumnDataSourceToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String columnMappingTypeToString(IContext context, excelimporter.proxies.MappingType _mappingType)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MappingType", _mappingType == null ? null : _mappingType.name());
			return (String)Core.execute(context, "ExcelImporter.ColumnMappingTypeToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String columnReferenceKeyTypeToString(IContext context, excelimporter.proxies.ReferenceKeyType _referenceKeyType)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ReferenceKeyType", _referenceKeyType == null ? null : _referenceKeyType.name());
			return (String)Core.execute(context, "ExcelImporter.ColumnReferenceKeyTypeToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String columnYesNoToString(IContext context, excelimporter.proxies.YesNo _yesNo)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("YesNo", _yesNo == null ? null : _yesNo.name());
			return (String)Core.execute(context, "ExcelImporter.ColumnYesNoToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.Template excelImporterTemplateXSD(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "ExcelImporter.ExcelImporterTemplateXSD", params);
			return result == null ? null : excelimporter.proxies.Template.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.XMLDocumentTemplate excelTemplate_ExportToXML(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "ExcelImporter.ExcelTemplate_ExportToXML", params);
			return result == null ? null : excelimporter.proxies.XMLDocumentTemplate.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void excelTemplate_ImportFromXml(IContext context, excelimporter.proxies.XMLDocumentTemplate _xMLDocumentTemplate)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("XMLDocumentTemplate", _xMLDocumentTemplate == null ? null : _xMLDocumentTemplate.getMendixObject());
			Core.execute(context, "ExcelImporter.ExcelTemplate_ImportFromXml", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String formatInteger(IContext context, String _unformatted)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Unformatted", _unformatted);
			return (String)Core.execute(context, "ExcelImporter.FormatInteger", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.AdditionalProperties getAddProperties(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "ExcelImporter.GetAddProperties", params);
			return result == null ? null : excelimporter.proxies.AdditionalProperties.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String getCorrectString(IContext context, String _textNL, String _textEN, system.proxies.Language _curLanguage)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("TextNL", _textNL);
			params.put("TextEN", _textEN);
			params.put("CurLanguage", _curLanguage == null ? null : _curLanguage.getMendixObject());
			return (String)Core.execute(context, "ExcelImporter.GetCorrectString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CancelTemplate(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_CancelTemplate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Column_Save(IContext context, excelimporter.proxies.Column _column)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_Column_Save", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ColumnEdit(IContext context, excelimporter.proxies.Column _column, excelimporter.proxies.Template _enclosingContext)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			params.put("EnclosingContext", _enclosingContext == null ? null : _enclosingContext.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_ColumnEdit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ColumnNew(IContext context, excelimporter.proxies.Template _enclosingContext)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("EnclosingContext", _enclosingContext == null ? null : _enclosingContext.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_ColumnNew", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.Template iVK_DuplicateTemplate(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "ExcelImporter.IVK_DuplicateTemplate", params);
			return result == null ? null : excelimporter.proxies.Template.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * Example how you can implement your own excel import file
	 * 
	 * Retrieve a template, this can be  from an association or by the use of a constant or some application settings. How exactly the template is retrieved does not really matter. 
	 * 
	 * Next, if the template is found the import java action should be executed. This java action has three parameters. The first parameter is the retrieved template, the second parameter is the excel file. The third parameter is an optional parameter this parameter can contain an object in case you want to set the reference from all imported objects to the object from the parameter.
	 * 
	 */
	public static void iVK_ImportTemplateDocument(IContext context, excelimporter.proxies.TemplateDocument _templateDocument)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("TemplateDocument", _templateDocument == null ? null : _templateDocument.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_ImportTemplateDocument", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * Create an XMLDocumentTemplate object and op the upload form.
	 */
	public static void iVK_ImportXML_Upload(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "ExcelImporter.IVK_ImportXML_Upload", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveContinue_CreateTemplateFromDoc(IContext context, excelimporter.proxies.TemplateDocument _templateDocument)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("TemplateDocument", _templateDocument == null ? null : _templateDocument.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_SaveContinue_CreateTemplateFromDoc", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveTemplate(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_SaveTemplate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Template_ConnectMatchingAttributes(IContext context, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_Template_ConnectMatchingAttributes", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Template_NewFromFile(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "ExcelImporter.IVK_Template_NewFromFile", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_TemplateDoc_Cancel(IContext context, excelimporter.proxies.TemplateDocument _templateDocument)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("TemplateDocument", _templateDocument == null ? null : _templateDocument.getMendixObject());
			Core.execute(context, "ExcelImporter.IVK_TemplateDoc_Cancel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String mxObjectReferenceAssociationOwnerToString(IContext context, mxmodelreflection.proxies.AssociationOwner _associationOwnerEnum)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("AssociationOwnerEnum", _associationOwnerEnum == null ? null : _associationOwnerEnum.name());
			return (String)Core.execute(context, "ExcelImporter.MxObjectReferenceAssociationOwnerToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String mxObjectReferenceReferenceTypeToString(IContext context, mxmodelreflection.proxies.ReferenceType _referenceTypeEnum)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ReferenceTypeEnum", _referenceTypeEnum == null ? null : _referenceTypeEnum.name());
			return (String)Core.execute(context, "ExcelImporter.MxObjectReferenceReferenceTypeToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String parseEnumToString_StatisticLevel(IContext context, excelimporter.proxies.StatisticsLevel _printStatisticsMessages)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("PrintStatisticsMessages", _printStatisticsMessages == null ? null : _printStatisticsMessages.name());
			return (String)Core.execute(context, "ExcelImporter.ParseEnumToString_StatisticLevel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.StatisticsLevel parseStringToEnum_StatisticsLevel(IContext context, String _printStatisticsMessages)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("PrintStatisticsMessages", _printStatisticsMessages);
			String result = (String)Core.execute(context, "ExcelImporter.ParseStringToEnum_StatisticsLevel", params);
			if (result == null)
				return null;
			return excelimporter.proxies.StatisticsLevel.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void prepareReferenceHandling(IContext context, excelimporter.proxies.Column _pColumn)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("pColumn", _pColumn == null ? null : _pColumn.getMendixObject());
			Core.execute(context, "ExcelImporter.prepareReferenceHandling", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String referenceHandlingEnumToString(IContext context, excelimporter.proxies.ReferenceHandlingEnum _referenceHandlingEnum)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ReferenceHandlingEnum", _referenceHandlingEnum == null ? null : _referenceHandlingEnum.name());
			return (String)Core.execute(context, "ExcelImporter.ReferenceHandlingEnumToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setColumnStatus(IContext context, excelimporter.proxies.Column _column, excelimporter.proxies.Template _template)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Column", _column == null ? null : _column.getMendixObject());
			params.put("Template", _template == null ? null : _template.getMendixObject());
			Core.execute(context, "ExcelImporter.SetColumnStatus", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sF_Template_CheckNrs(IContext context, excelimporter.proxies.Template _template, boolean _showWarningPopup)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			params.put("ShowWarningPopup", _showWarningPopup);
			return (Boolean)Core.execute(context, "ExcelImporter.SF_Template_CheckNrs", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.MappingType stringToColumnMappingType(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToColumnMappingType", params);
			if (result == null)
				return null;
			return excelimporter.proxies.MappingType.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.ReferenceKeyType stringToColumnReferenceKeyType(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToColumnReferenceKeyType", params);
			if (result == null)
				return null;
			return excelimporter.proxies.ReferenceKeyType.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.YesNo stringToColumnYesNo(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToColumnYesNo", params);
			if (result == null)
				return null;
			return excelimporter.proxies.YesNo.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.DataSource stringToDataSource(IContext context, String _dataSource)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("DataSource", _dataSource);
			String result = (String)Core.execute(context, "ExcelImporter.StringToDataSource", params);
			if (result == null)
				return null;
			return excelimporter.proxies.DataSource.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mxmodelreflection.proxies.AssociationOwner stringToMxObjectReferenceAssociationOwner(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToMxObjectReferenceAssociationOwner", params);
			if (result == null)
				return null;
			return mxmodelreflection.proxies.AssociationOwner.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mxmodelreflection.proxies.ReferenceType stringToMxObjectReferenceReferenceType(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToMxObjectReferenceReferenceType", params);
			if (result == null)
				return null;
			return mxmodelreflection.proxies.ReferenceType.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.ReferenceDataHandling stringToReferenceDataHandling(IContext context, String _dataHandling)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("DataHandling", _dataHandling);
			String result = (String)Core.execute(context, "ExcelImporter.StringToReferenceDataHandling", params);
			if (result == null)
				return null;
			return excelimporter.proxies.ReferenceDataHandling.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.ReferenceHandlingEnum stringToReferenceHandlingEnum(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToReferenceHandlingEnum", params);
			if (result == null)
				return null;
			return excelimporter.proxies.ReferenceHandlingEnum.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.ImportActions stringToTemplateImportActions(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToTemplateImportActions", params);
			if (result == null)
				return null;
			return excelimporter.proxies.ImportActions.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.RemoveIndicator stringToTemplateRemoveIndicator(IContext context, String _removeUnsyncedObjects)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("RemoveUnsyncedObjects", _removeUnsyncedObjects);
			String result = (String)Core.execute(context, "ExcelImporter.StringToTemplateRemoveIndicator", params);
			if (result == null)
				return null;
			return excelimporter.proxies.RemoveIndicator.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static excelimporter.proxies.Status stringToTemplateStatusEnum(IContext context, String _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input);
			String result = (String)Core.execute(context, "ExcelImporter.StringToTemplateStatusEnum", params);
			if (result == null)
				return null;
			return excelimporter.proxies.Status.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String templateImportActionsToString(IContext context, excelimporter.proxies.ImportActions _importActions)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ImportActions", _importActions == null ? null : _importActions.name());
			return (String)Core.execute(context, "ExcelImporter.TemplateImportActionsToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String templateReferenceDataHandlingEnumToString(IContext context, excelimporter.proxies.ReferenceDataHandling _dataHandling)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("DataHandling", _dataHandling == null ? null : _dataHandling.name());
			return (String)Core.execute(context, "ExcelImporter.TemplateReferenceDataHandlingEnumToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String templateReferenceHandlingEnumToString(IContext context, excelimporter.proxies.ReferenceHandlingEnum _referenceHandling)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ReferenceHandling", _referenceHandling == null ? null : _referenceHandling.name());
			return (String)Core.execute(context, "ExcelImporter.TemplateReferenceHandlingEnumToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String templateRemoveIndicatorToString(IContext context, excelimporter.proxies.RemoveIndicator _removeUnsyncedObjects)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("RemoveUnsyncedObjects", _removeUnsyncedObjects == null ? null : _removeUnsyncedObjects.name());
			return (String)Core.execute(context, "ExcelImporter.TemplateRemoveIndicatorToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static String templateStatusEnumToString(IContext context, excelimporter.proxies.Status _input)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Input", _input == null ? null : _input.name());
			return (String)Core.execute(context, "ExcelImporter.TemplateStatusEnumToString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean validate_TemplateDocument(IContext context, excelimporter.proxies.TemplateDocument _templateDocument)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("TemplateDocument", _templateDocument == null ? null : _templateDocument.getMendixObject());
			return (Boolean)Core.execute(context, "ExcelImporter.Validate_TemplateDocument", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean validateTemplate(IContext context, excelimporter.proxies.Template _template, boolean _showWarningPopup)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Template", _template == null ? null : _template.getMendixObject());
			params.put("ShowWarningPopup", _showWarningPopup);
			return (Boolean)Core.execute(context, "ExcelImporter.ValidateTemplate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}