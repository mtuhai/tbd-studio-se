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
package org.talend.hadoop.distribution.cdh540.test;

import org.junit.Test;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.hadoop.EHadoopCategory;
import org.talend.core.model.metadata.connection.hive.HiveModeInfo;
import org.talend.core.model.metadata.connection.hive.HiveServerVersionInfo;
import org.talend.hadoop.distribution.cdh540.CDH540Distribution;
import org.talend.hadoop.distribution.component.HadoopComponent;
import org.talend.hadoop.distribution.test.classloader.AbstractTest4ClassLoaderProvider;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class CDH540ClassLoaderTest extends AbstractTest4ClassLoaderProvider {

    @Override
    protected Class<? extends HadoopComponent> getHadoopComponentClass() {
        return CDH540Distribution.class;
    }

    @Test
    public void testHive1Standalone() {
        String libsStr = "hive-metastore-1.1.0-cdh5.4.0.jar;hive-exec-1.1.0-cdh5.4.0.jar;hive-jdbc-1.1.0-cdh5.4.0.jar;hive-service-1.1.0-cdh5.4.0.jar;jdo-api-3.0.1.jar;libthrift-0.9.2.jar;libfb303-0.9.2.jar;guava-11.0.2.jar;hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-hdfs-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-common-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-core-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-jobclient-2.6.0-cdh5.4.0.jar;hadoop-yarn-api-2.6.0-cdh5.4.0.jar;hadoop-yarn-client-2.6.0-cdh5.4.0.jar;hadoop-yarn-common-2.6.0-cdh5.4.0.jar;avro-1.7.6-cdh5.4.0.jar;commons-configuration-1.6.jar;commons-httpclient-3.0.1.jar;httpcore-4.2.5.jar;httpclient-4.2.5.jar;commons-lang-2.6.jar;commons-logging-1.1.3.jar;commons-cli-1.2.jar;commons-codec-1.4.jar;commons-collections-3.2.1.jar;protobuf-java-2.5.0.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;log4j-1.2.17.jar;commons-io-2.4.jar;antlr-runtime-3.4.jar;datanucleus-api-jdo-3.2.6.jar;datanucleus-core-3.2.10.jar;datanucleus-rdbms-3.2.9.jar;derby-10.11.1.1.jar;hive-hbase-handler-1.1.0-cdh5.4.0.jar;hbase-common-1.0.0-cdh5.4.0.jar;hbase-client-1.0.0-cdh5.4.0.jar;hbase-hadoop-compat-1.0.0-cdh5.4.0.jar;hbase-protocol-1.0.0-cdh5.4.0.jar;hbase-server-1.0.0-cdh5.4.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;htrace-core-3.0.4.jar;netty-3.6.6.Final.jar;servlet-api-2.5-20081211.jar;commons-dbcp-1.4.jar;commons-pool-1.5.4.jar;htrace-core-3.1.0-incubating.jar;curator-framework-2.6.0.jar;curator-client-2.6.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;calcite-linq4j-1.0.0-incubating.jar;calcite-core-1.0.0-incubating.jar;calcite-avatica-1.0.0-incubating.jar";
        doTestHiveServerWithMode(HiveServerVersionInfo.HIVE_SERVER_1, HiveModeInfo.STANDALONE, libsStr);
    }

    @Test
    public void testHive1Embedded() {
        String libsStr = "hive-metastore-1.1.0-cdh5.4.0.jar;hive-exec-1.1.0-cdh5.4.0.jar;hive-jdbc-1.1.0-cdh5.4.0.jar;hive-service-1.1.0-cdh5.4.0.jar;jdo-api-3.0.1.jar;libthrift-0.9.2.jar;libfb303-0.9.2.jar;guava-11.0.2.jar;hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-hdfs-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-common-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-core-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-jobclient-2.6.0-cdh5.4.0.jar;hadoop-yarn-api-2.6.0-cdh5.4.0.jar;hadoop-yarn-client-2.6.0-cdh5.4.0.jar;hadoop-yarn-common-2.6.0-cdh5.4.0.jar;avro-1.7.6-cdh5.4.0.jar;commons-configuration-1.6.jar;commons-httpclient-3.0.1.jar;httpcore-4.2.5.jar;httpclient-4.2.5.jar;commons-lang-2.6.jar;commons-logging-1.1.3.jar;commons-cli-1.2.jar;commons-codec-1.4.jar;commons-collections-3.2.1.jar;protobuf-java-2.5.0.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;log4j-1.2.17.jar;commons-io-2.4.jar;antlr-runtime-3.4.jar;datanucleus-api-jdo-3.2.6.jar;datanucleus-core-3.2.10.jar;datanucleus-rdbms-3.2.9.jar;derby-10.11.1.1.jar;hive-hbase-handler-1.1.0-cdh5.4.0.jar;hbase-common-1.0.0-cdh5.4.0.jar;hbase-client-1.0.0-cdh5.4.0.jar;hbase-hadoop-compat-1.0.0-cdh5.4.0.jar;hbase-protocol-1.0.0-cdh5.4.0.jar;hbase-server-1.0.0-cdh5.4.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;htrace-core-3.0.4.jar;netty-3.6.6.Final.jar;servlet-api-2.5-20081211.jar;commons-dbcp-1.4.jar;commons-pool-1.5.4.jar;htrace-core-3.1.0-incubating.jar;curator-framework-2.6.0.jar;curator-client-2.6.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;calcite-linq4j-1.0.0-incubating.jar;calcite-core-1.0.0-incubating.jar;calcite-avatica-1.0.0-incubating.jar";
        doTestHiveServerWithMode(HiveServerVersionInfo.HIVE_SERVER_1, HiveModeInfo.EMBEDDED, libsStr);
    }

    @Test
    public void testHive2Standalone() {
        String libsStr = "hive-metastore-1.1.0-cdh5.4.0.jar;hive-exec-1.1.0-cdh5.4.0.jar;hive-jdbc-1.1.0-cdh5.4.0.jar;hive-service-1.1.0-cdh5.4.0.jar;jdo-api-3.0.1.jar;libthrift-0.9.2.jar;libfb303-0.9.2.jar;guava-11.0.2.jar;hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-hdfs-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-common-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-core-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-jobclient-2.6.0-cdh5.4.0.jar;hadoop-yarn-api-2.6.0-cdh5.4.0.jar;hadoop-yarn-client-2.6.0-cdh5.4.0.jar;hadoop-yarn-common-2.6.0-cdh5.4.0.jar;avro-1.7.6-cdh5.4.0.jar;commons-configuration-1.6.jar;commons-httpclient-3.0.1.jar;httpcore-4.2.5.jar;httpclient-4.2.5.jar;commons-lang-2.6.jar;commons-logging-1.1.3.jar;commons-cli-1.2.jar;commons-codec-1.4.jar;commons-collections-3.2.1.jar;protobuf-java-2.5.0.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;log4j-1.2.17.jar;commons-io-2.4.jar;antlr-runtime-3.4.jar;datanucleus-api-jdo-3.2.6.jar;datanucleus-core-3.2.10.jar;datanucleus-rdbms-3.2.9.jar;derby-10.11.1.1.jar;hive-hbase-handler-1.1.0-cdh5.4.0.jar;hbase-common-1.0.0-cdh5.4.0.jar;hbase-client-1.0.0-cdh5.4.0.jar;hbase-hadoop-compat-1.0.0-cdh5.4.0.jar;hbase-protocol-1.0.0-cdh5.4.0.jar;hbase-server-1.0.0-cdh5.4.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;htrace-core-3.0.4.jar;netty-3.6.6.Final.jar;servlet-api-2.5-20081211.jar;commons-dbcp-1.4.jar;commons-pool-1.5.4.jar;htrace-core-3.1.0-incubating.jar;curator-framework-2.6.0.jar;curator-client-2.6.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;calcite-linq4j-1.0.0-incubating.jar;calcite-core-1.0.0-incubating.jar;calcite-avatica-1.0.0-incubating.jar";
        doTestHiveServerWithMode(HiveServerVersionInfo.HIVE_SERVER_1, HiveModeInfo.STANDALONE, libsStr);
    }

    @Test
    public void testHive2Embedded() {
        String libsStr = "hive-metastore-1.1.0-cdh5.4.0.jar;hive-exec-1.1.0-cdh5.4.0.jar;hive-jdbc-1.1.0-cdh5.4.0.jar;hive-service-1.1.0-cdh5.4.0.jar;jdo-api-3.0.1.jar;libthrift-0.9.2.jar;libfb303-0.9.2.jar;guava-11.0.2.jar;hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-hdfs-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-common-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-core-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-jobclient-2.6.0-cdh5.4.0.jar;hadoop-yarn-api-2.6.0-cdh5.4.0.jar;hadoop-yarn-client-2.6.0-cdh5.4.0.jar;hadoop-yarn-common-2.6.0-cdh5.4.0.jar;avro-1.7.6-cdh5.4.0.jar;commons-configuration-1.6.jar;commons-httpclient-3.0.1.jar;httpcore-4.2.5.jar;httpclient-4.2.5.jar;commons-lang-2.6.jar;commons-logging-1.1.3.jar;commons-cli-1.2.jar;commons-codec-1.4.jar;commons-collections-3.2.1.jar;protobuf-java-2.5.0.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;log4j-1.2.17.jar;commons-io-2.4.jar;antlr-runtime-3.4.jar;datanucleus-api-jdo-3.2.6.jar;datanucleus-core-3.2.10.jar;datanucleus-rdbms-3.2.9.jar;derby-10.11.1.1.jar;hive-hbase-handler-1.1.0-cdh5.4.0.jar;hbase-common-1.0.0-cdh5.4.0.jar;hbase-client-1.0.0-cdh5.4.0.jar;hbase-hadoop-compat-1.0.0-cdh5.4.0.jar;hbase-protocol-1.0.0-cdh5.4.0.jar;hbase-server-1.0.0-cdh5.4.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;htrace-core-3.0.4.jar;netty-3.6.6.Final.jar;servlet-api-2.5-20081211.jar;commons-dbcp-1.4.jar;commons-pool-1.5.4.jar;htrace-core-3.1.0-incubating.jar;curator-framework-2.6.0.jar;curator-client-2.6.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;calcite-linq4j-1.0.0-incubating.jar;calcite-core-1.0.0-incubating.jar;calcite-avatica-1.0.0-incubating.jar";
        doTestHiveServerWithMode(HiveServerVersionInfo.HIVE_SERVER_1, HiveModeInfo.EMBEDDED, libsStr);
    }

    @Test
    public void testHbase() {
        String libsStr = "hbase-common-1.0.0-cdh5.4.0.jar;hbase-client-1.0.0-cdh5.4.0.jar;hbase-protocol-1.0.0-cdh5.4.0.jar;zookeeper-3.4.5-cdh5.4.0.jar;htrace-core-3.0.4.jar;commons-logging-1.1.1.jar;commons-codec-1.7.jar;guava-12.0.1.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;netty-3.6.6.Final.jar;hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;commons-configuration-1.6.jar;commons-lang-2.6.jar;commons-collections-3.2.1.jar;protobuf-java-2.5.0.jar;log4j-1.2.17.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;hbase-server-1.0.0-cdh5.4.0.jar;htrace-core-3.1.0-incubating.jar";
        doTestClassLoader(EHadoopCategory.HBASE.getName(), libsStr);
    }

    @Test
    public void testMapReduce() {
        String libsStr = "hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-hdfs-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-common-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-core-2.6.0-cdh5.4.0.jar;hadoop-mapreduce-client-jobclient-2.6.0-cdh5.4.0.jar;hadoop-yarn-api-2.6.0-cdh5.4.0.jar;hadoop-yarn-client-2.6.0-cdh5.4.0.jar;hadoop-yarn-common-2.6.0-cdh5.4.0.jar;avro-1.5.4.jar;commons-configuration-1.6.jar;commons-lang-2.6.jar;commons-logging-1.1.3.jar;commons-cli-1.2.jar;commons-codec-1.4.jar;commons-collections-3.2.1.jar;guava-11.0.2.jar;protobuf-java-2.5.0.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;log4j-1.2.17.jar;htrace-core-3.0.4.jar";
        doTestClassLoader(EHadoopCategory.MAP_REDUCE.getName(), libsStr);
    }

    @Test
    public void testHDFS() {
        String libsStr = "hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-hdfs-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;avro-1.7.6-cdh5.4.0.jar;commons-configuration-1.6.jar;commons-lang-2.6.jar;commons-logging-1.1.3.jar;commons-cli-1.2.jar;commons-collections-3.2.1.jar;guava-11.0.2.jar;protobuf-java-2.5.0.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;log4j-1.2.17.jar;jersey-core-1.9.jar;commons-codec-1.4.jar;commons-io-2.4.jar;jetty-util-6.1.26.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;htrace-core-3.0.4.jar";
        doTestClassLoader(EHadoopCategory.HDFS.getName(), libsStr);
    }

    @Test
    public void testHDFSWithKerberos() {
        String libsStr = "hadoop-common-2.6.0-cdh5.4.0.jar;hadoop-hdfs-2.6.0-cdh5.4.0.jar;hadoop-auth-2.6.0-cdh5.4.0.jar;avro-1.7.6-cdh5.4.0.jar;commons-configuration-1.6.jar;commons-lang-2.6.jar;commons-logging-1.1.3.jar;commons-cli-1.2.jar;commons-collections-3.2.1.jar;guava-11.0.2.jar;protobuf-java-2.5.0.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar;log4j-1.2.17.jar;jersey-core-1.9.jar;commons-codec-1.4.jar;commons-io-2.4.jar;jetty-util-6.1.26.jar;jackson-mapper-asl-1.8.8.jar;jackson-core-asl-1.8.8.jar;hadoop-conf-kerberos.jar;htrace-core-3.0.4.jar";
        doTestClassLoader(EHadoopCategory.HDFS.getName(), libsStr, "?USE_KRB");
    }

    @Test
    public void testImpala() {
        String libsStr = "commons-logging-1.1.3.jar;guava-11.0.2.jar;hadoop-common-2.6.0-cdh5.4.0.jar;hive-common-1.1.0-cdh5.4.0.jar;hive-jdbc-1.1.0-cdh5.4.0.jar;hive-metastore-1.1.0-cdh5.4.0.jar;hive-service-1.1.0-cdh5.4.0.jar;httpclient-4.2.5.jar;httpcore-4.2.5.jar;libfb303-0.9.2.jar;libthrift-0.9.2.jar;log4j-1.2.17.jar;slf4j-api-1.7.5.jar;slf4j-log4j12-1.7.5.jar";
        doTestClassLoader(EDatabaseTypeName.IMPALA.getProduct(), libsStr);
    }
}
