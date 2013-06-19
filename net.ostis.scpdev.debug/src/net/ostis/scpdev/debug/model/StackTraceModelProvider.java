package net.ostis.scpdev.debug.model;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.ui.console.FileLink;

import net.ostis.scpdev.debug.core.model.SCPStackFrame;

public enum StackTraceModelProvider 
{
	INSTANCE;
	private List<StackTraceElement> mTraceElementsList;
	
	private StackTraceModelProvider()
	{
		mTraceElementsList = new ArrayList<StackTraceElement>();
	}
	
	public void addCallElement(SCPStackFrame frame)
	{
		try {
			String path = frame.getProgram().getFullName();
			System.out.println(path);
			File file = new File(path);
			IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(file.toURI());
			FileLink link = new FileLink(files[0], null, -1, -1, frame.getLineNumber());
			mTraceElementsList.add(new StackTraceElement(frame.getName(), link));
		} catch (DebugException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<StackTraceElement> getTraceList()
	{
		return mTraceElementsList;
	}
}
