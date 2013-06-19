package net.ostis.scpdev.ui.actions;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.internal.ui.DebugUIPlugin;
import org.eclipse.debug.internal.ui.contextlaunching.ContextRunner;
import org.eclipse.debug.internal.ui.contextlaunching.LaunchingResourceManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.debug.ui.actions.AbstractLaunchToolbarAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;

public class RunToolbarAction extends AbstractLaunchToolbarAction
{
	public RunToolbarAction() 
	{
		super(IDebugUIConstants.ID_RUN_LAUNCH_GROUP);
	}
	
	public void run(IAction action) {
		//always ignore external tools during context launching
		System.out.println("run run action");
//		if(LaunchingResourceManager.isContextLaunchEnabled(getLaunchGroupIdentifier())) {
//			ContextRunner.getDefault().launch(DebugUIPlugin.getDefault().getLaunchConfigurationManager().getLaunchGroup(getLaunchGroupIdentifier()));
//		}
//		else {
//			ILaunchConfiguration configuration = getLastLaunch();
//			if (configuration == null) {
//				DebugUITools.openLaunchConfigurationDialogOnGroup(DebugUIPlugin.getShell(), new StructuredSelection(), getLaunchGroupIdentifier());
//			} else {
//				DebugUITools.launch(configuration, getMode());
//			}
//		}
	}
}
