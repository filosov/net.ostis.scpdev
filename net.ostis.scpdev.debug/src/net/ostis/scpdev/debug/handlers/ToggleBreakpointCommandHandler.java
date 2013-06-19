package net.ostis.scpdev.debug.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;


public class ToggleBreakpointCommandHandler extends AbstractHandler
{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		System.out.println("Toogle breakpoint");
		return null;
	}

}
