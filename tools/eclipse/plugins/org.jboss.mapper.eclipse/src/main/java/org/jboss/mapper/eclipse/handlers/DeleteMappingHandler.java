/*******************************************************************************
 * Copyright (c) 2014 Red Hat, Inc.
 *  All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.jboss.mapper.eclipse.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jboss.mapper.dozer.config.Field;
import org.jboss.mapper.eclipse.DataMapper;
import org.jboss.mapper.eclipse.DataMapperEditor;
import org.jboss.mapper.eclipse.DataMapperEditorMappingPage;

/**
 *
 */
public class DeleteMappingHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) {
        // delegate to the mapper itself to remove the field mapping
        ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
        if ( selection instanceof IStructuredSelection ) {
            for ( Iterator< ? > iterator = ( ( IStructuredSelection ) selection).iterator(); iterator.hasNext();) {
                Object element = iterator.next();
                if (element instanceof Field) {
                    IEditorPart editor = HandlerUtil.getActiveEditor(event);
                    DataMapperEditor dmEditor = (DataMapperEditor) editor;
                    DataMapperEditorMappingPage mapPage =
                            (DataMapperEditorMappingPage) dmEditor.getSelectedPage();
                    DataMapper mapper = mapPage.mapper();
                    mapper.deleteFieldMapping((Field) element);
                }
            }
        }
        return null;
    }
}
