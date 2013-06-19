package net.ostis.scpdev.debug.ui.views;

import net.ostis.scpdev.debug.core.model.SCPStackFrame;
import net.ostis.scpdev.debug.model.StackTraceModelProvider;
import net.ostis.scpdev.debug.model.StackTraceElement;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class SCPStackTraceView extends ViewPart 
{
	public static final String ID = "net.ostis.scpdev.debug.SCPStackTraceView";
	
	private ListViewer mStackTrace = null;
	private StackTraceModelProvider mModelProvider;

	@Override
	public void createPartControl(Composite parent)
	{
		mStackTrace = new ListViewer(parent);
		mModelProvider = StackTraceModelProvider.INSTANCE;
		mStackTrace.setContentProvider(new ArrayContentProvider());
		mStackTrace.setLabelProvider(new ColumnLabelProvider() 
			{
				@Override
				public String getText(Object element)
				{
					StackTraceElement proc = (StackTraceElement)element;
					return proc.getElementName();
				}
				
				@Override
				public Image getImage(Object element)
				{
					return null;
				}
			});
		mStackTrace.setInput(mModelProvider.getTraceList());
		//mStackTree.add("child1", "child3");
		
	}

	@Override
	public void setFocus() 
	{
		mStackTrace.getControl().setFocus();
		
	}
	
	public void createList(SCPStackFrame[] frames)
	{
		for (int i = 0; i < frames.length; ++i)
			mModelProvider.addCallElement(frames[i]);
		mStackTrace.refresh();
	}

	public void clearList()
	{
		mModelProvider.getTraceList().clear();
	}
}
