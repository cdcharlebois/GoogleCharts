// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlecharts.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the GoogleCharts module
	public static googlecharts.proxies.Result dS_DonutsEaten_AreaChart(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GoogleCharts.DS_DonutsEaten_AreaChart", params);
			return result == null ? null : googlecharts.proxies.Result.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static googlecharts.proxies.Result dS_DonutsEaten_BarChart(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GoogleCharts.DS_DonutsEaten_BarChart", params);
			return result == null ? null : googlecharts.proxies.Result.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static googlecharts.proxies.Result dS_DonutsEaten_ColumnChart(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GoogleCharts.DS_DonutsEaten_ColumnChart", params);
			return result == null ? null : googlecharts.proxies.Result.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static googlecharts.proxies.Result dS_DonutsEaten_LineChart(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GoogleCharts.DS_DonutsEaten_LineChart", params);
			return result == null ? null : googlecharts.proxies.Result.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static googlecharts.proxies.Result dS_DonutsEaten_PieChart(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GoogleCharts.DS_DonutsEaten_PieChart", params);
			return result == null ? null : googlecharts.proxies.Result.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static googlecharts.proxies.Result dS_Sankey_Example(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GoogleCharts.DS_Sankey_Example", params);
			return result == null ? null : googlecharts.proxies.Result.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static googlecharts.proxies.Result dS_SensorData_Linechart(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GoogleCharts.DS_SensorData_Linechart", params);
			return result == null ? null : googlecharts.proxies.Result.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_UpdateAreaResult(IContext context, googlecharts.proxies.Result _result)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Result", _result == null ? null : _result.getMendixObject());
			Core.execute(context, "GoogleCharts.IVK_UpdateAreaResult", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_UpdateBarResult(IContext context, googlecharts.proxies.Result _result)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Result", _result == null ? null : _result.getMendixObject());
			Core.execute(context, "GoogleCharts.IVK_UpdateBarResult", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_UpdateColumnResult(IContext context, googlecharts.proxies.Result _result)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Result", _result == null ? null : _result.getMendixObject());
			Core.execute(context, "GoogleCharts.IVK_UpdateColumnResult", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_UpdateLineResult(IContext context, googlecharts.proxies.Result _result)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Result", _result == null ? null : _result.getMendixObject());
			Core.execute(context, "GoogleCharts.IVK_UpdateLineResult", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_UpdatePieResult(IContext context, googlecharts.proxies.Result _result)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Result", _result == null ? null : _result.getMendixObject());
			Core.execute(context, "GoogleCharts.IVK_UpdatePieResult", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}