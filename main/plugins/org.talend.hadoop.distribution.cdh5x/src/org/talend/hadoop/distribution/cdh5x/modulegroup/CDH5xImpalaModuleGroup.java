// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.cdh5x.modulegroup;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.cdh5x.CDH5xConstant;

public class CDH5xImpalaModuleGroup extends AbstractModuleGroup {

    public CDH5xImpalaModuleGroup(String id) {
        super(id);
    }

    public Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        hs.add(new DistributionModuleGroup(CDH5xConstant.HIVE_MODULE_GROUP.getModuleName(getId())));
        hs.add(new DistributionModuleGroup(CDH5xConstant.HDFS_MODULE_GROUP.getModuleName(getId())));
        hs.add(new DistributionModuleGroup(CDH5xConstant.MAPREDUCE_MODULE_GROUP.getModuleName(getId())));
        return hs;
    }

}
