// ============================================================================
//
// Copyright (C) 2006-2017 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.mapr510;

/**
 * created by rdubois on 16 nov. 2015 Detailled comment
 *
 */
public enum MapR510Constant {

    HDFS_MODULE_GROUP("HDFS-LIB-MAPR510"), //$NON-NLS-1$
    MAPREDUCE_MODULE_GROUP("MAPREDUCE-LIB-MAPR510"), //$NON-NLS-1$
    PIG_MODULE_GROUP("PIG-LIB-MAPR510"), //$NON-NLS-1$
    HBASE_MODULE_GROUP("HBASE-LIB-MAPR510"), //$NON-NLS-1$
    HIVE_MODULE_GROUP("HIVE-LIB-MAPR510"), //$NON-NLS-1$
    SQOOP_MODULE_GROUP("SQOOP-LIB-MAPR510"), //$NON-NLS-1$
    SPARK_MODULE_GROUP("SPARK-LIB-MAPR510"), //$NON-NLS-1$

    HIVE_HBASE_MODULE_GROUP("HIVE-HBASE-LIB-MAPR510"), //$NON-NLS-1$
    MAPREDUCE_PARQUET_MODULE_GROUP("MAPREDUCE-PARQUET-LIB-MAPR510"), //$NON-NLS-1$
    MAPRSTREAMS_MODULE_GROUP("MAPRSTREAMS-LIB-MAPR510"), //$NON-NLS-1$
    PIG_AVRO_MODULE_GROUP("PIG-AVRO-LIB-MAPR510"), //$NON-NLS-1$
    PIG_HBASE_MODULE_GROUP("PIG-HBASE-LIB-MAPR510"), //$NON-NLS-1$
    PIG_HCATALOG_MODULE_GROUP("PIG-HCATALOG-LIB-MAPR510"), //$NON-NLS-1$
    PIG_PARQUET_MODULE_GROUP("PIG-PARQUET-LIB-MAPR510"), //$NON-NLS-1$
    PIG_RCFILE_MODULE_GROUP("PIG-RCFILE-LIB-MAPR510"), //$NON-NLS-1$
    PIG_SEQUENCEFILE_MODULE_GROUP("PIG-SEQUENCEFILE-LIB-MAPR510"), //$NON-NLS-1$
    // can be use for parquet, need to check
    // SPARK_MRREQUIRED_MODULE_GROUP("SPARK-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_PARQUET_MRREQUIRED_MODULE_GROUP("SPARK-PARQUET-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_KINESIS_MRREQUIRED_MODULE_GROUP("SPARK-KINESIS-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_KAFKA_ASSEMBLY_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-ASSEMBLY-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_KAFKA_AVRO_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-AVRO-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_KAFKA_CLIENT_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-CLIENT-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_HIVE_MRREQUIRED_MODULE_GROUP("SPARK-HIVE-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_S3_MRREQUIRED_MODULE_GROUP("S3-LIB-MAPR510"), //$NON-NLS-1$
    SQOOP_PARQUET_MODULE_GROUP("SQOOP-PARQUET-LIB-MAPR510"), //$NON-NLS-1$
    SPARK_MAPRSTREAMS_ASSEMBLY_MRREQUIRED_MODULE_GROUP("SPARK-MAPRSTREAMS-ASSEMBLY-LIB-MRREQUIRED-MAPR510"), //$NON-NLS-1$
    SPARK_MAPRSTREAMS_CLIENT_MRREQUIRED_MODULE_GROUP("SPARK-MAPRSTREAMS-CLIENT-LIB-MRREQUIRED-MAPR510"); //$NON-NLS-1$

    private String mModuleName;

    MapR510Constant(String moduleName) {
        this.mModuleName = moduleName;
    }

    public String getModuleName() {
        return this.mModuleName;
    }
}
