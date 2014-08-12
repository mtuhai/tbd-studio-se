// ============================================================================
//
// Copyright (C) 2006-2014 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.hdfs.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Composite;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.repository.ConnectionStatus;
import org.talend.designer.hdfsbrowse.manager.HadoopOperationManager;
import org.talend.designer.hdfsbrowse.model.HDFSConnectionBean;
import org.talend.repository.hadoopcluster.ui.common.AbstractHadoopSubForm;
import org.talend.repository.hdfs.Activator;
import org.talend.repository.hdfs.i18n.Messages;
import org.talend.repository.hdfs.util.HDFSModelUtil;
import org.talend.repository.model.hdfs.HDFSConnection;

/**
 * DOC ycbai class global comment. Detailled comment
 */
public abstract class AbstractHDFSForm extends AbstractHadoopSubForm<HDFSConnection> {

    protected boolean hdfsSettingIsValide = false;

    protected AbstractHDFSForm(Composite parent, int style, ConnectionItem connectionItem) {
        super(parent, style, connectionItem);
    }

    protected AbstractHDFSForm(Composite parent, int style, String[] existingNames, ConnectionItem connectionItem) {
        super(parent, style, existingNames, connectionItem);
    }

    protected ConnectionStatus checkConnection() {
        return checkConnection(true);
    }

    protected ConnectionStatus checkConnection(boolean displayDialog) {
        HDFSConnectionBean connectionBean = getConnectionBean();
        ConnectionStatus connectionStatus = HadoopOperationManager.getInstance().testConnection(connectionBean);
        hdfsSettingIsValide = connectionStatus.getResult();
        String connectException = connectionStatus.getMessageException();

        if (hdfsSettingIsValide) {
            if (!isReadOnly()) {
                updateStatus(IStatus.OK, null);
            }
            if (displayDialog) {
                MessageDialog.openInformation(getShell(), Messages.getString("AbstractHDFSForm.checkConnection.success.title"), //$NON-NLS-1$
                        Messages.getString("AbstractHDFSForm.checkConnection.success.msg", connectionItem.getProperty() //$NON-NLS-1$
                                .getDisplayName()));
            }
        } else {
            String mainMsg = Messages.getString("AbstractHDFSForm.checkConnection.failure.msg"); //$NON-NLS-1$
            if (!isReadOnly()) {
                updateStatus(IStatus.WARNING, mainMsg);
            }
            if (displayDialog) {
                new ErrorDialogWidthDetailArea(getShell(), Activator.PLUGIN_ID, mainMsg, connectException);
            }
        }

        return connectionStatus;
    }

    protected HDFSConnectionBean getConnectionBean() {
        return HDFSModelUtil.convert2HDFSConnectionBean(getConnection());
    }

    public void performCancel() {
        processWhenDispose();
    }

}