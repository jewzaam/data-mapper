package org.jboss.mapper.eclipse;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
    
    // The shared instance
    private static Activator plugin;
    
    /**
     * @param shell
     * @param e
     */
    public static void error( final Shell shell,
                              final Throwable e ) {
        final Status status = new Status( Status.ERROR, plugin.getBundle().getSymbolicName(), "Unexpected error", e );
        ErrorDialog.openError( shell, "Error", status.getMessage(), status );
        plugin.getLog().log( status );
    }
    
    /**
     * @param name
     * @return the image with the supplied name
     */
    public static ImageDescriptor imageDescriptor( final String name ) {
        final String key = plugin.getBundle().getSymbolicName() + "." + name;
        ImageDescriptor img = plugin.getImageRegistry().getDescriptor( key );
        if ( img != null ) return img;
        img = ImageDescriptor.createFromURL( plugin.getBundle().getEntry( "icons/" + name ) );
        plugin.getImageRegistry().put( key, img );
        return img;
    }
    
    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator plugin() {
        return plugin;
    }
    
    /**
     * The constructor
     */
    public Activator() {}
    
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start( final BundleContext context ) throws Exception {
        super.start( context );
        plugin = this;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop( final BundleContext context ) throws Exception {
        plugin = null;
        super.stop( context );
    }
}
