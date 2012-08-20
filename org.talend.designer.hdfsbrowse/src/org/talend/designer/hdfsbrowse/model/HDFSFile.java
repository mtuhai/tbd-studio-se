// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================

package org.talend.designer.hdfsbrowse.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.hadoop.fs.Path;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;

/**
 * DOC ycbai class global comment. Detailled comment
 * 
 * File handling methods for the DFS
 * 
 */
public class HDFSFile extends HDFSPath {

    public HDFSFile(HDFSPath parent, Path path) {
        super(parent, path);
    }

    /**
     * Download and view contents of a file
     * 
     * @return a InputStream for the file
     */
    public InputStream open() throws IOException {
        return getDFS().open(getPath());
    }

    public String toString() {
        return getPath().toString();
    }

    public List<IHDFSNode> getChildren() {
        return null;
    }

    public boolean hasChildren() {
        return false;
    }

    @Override
    public void refresh() {
        getParent().refresh();
    }

    public Image getImage() {
        return sharedImages.getImage(ISharedImages.IMG_OBJ_FILE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.hdfs.model.HDFSNode#getType()
     */
    @Override
    public EHadoopFileTypes getType() {
        return EHadoopFileTypes.FILE;
    }

}
