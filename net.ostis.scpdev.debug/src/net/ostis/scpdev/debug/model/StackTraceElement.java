package net.ostis.scpdev.debug.model;

import org.eclipse.debug.ui.console.FileLink;

public class StackTraceElement 
{
	private String mTraceElementName;
	
	private FileLink mLink;
	
	public StackTraceElement(String name, FileLink link)
	{
		mTraceElementName = name;
		mLink = link;
	}
	
	public String getElementName()
	{
		return mTraceElementName;
	}
	
	public void setElementName(String name)
	{
		mTraceElementName = name;
	}
	
	public FileLink getLink()
	{
		return mLink;
	}
	
	public void setLink(FileLink link)
	{
		mLink = link;
	}
}
