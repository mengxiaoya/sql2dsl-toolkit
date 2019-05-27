package org.es.test.query;

import org.es.sql.bean.ElasticSqlParseResult;
import org.es.sql.parser.ElasticSql2DslParser;
import org.junit.Test;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @ Date 2019/5/27 11:16
 * @ Author: <a href=mailto:zhangqi@bonree.com>张奇</a>
 * @ Description: 
 ******************************************************************************/
public class ESToolTest {
    @Test
    public void testESTool() throws Exception {
//        ESClientBuilderInterface builder = new ESClientBuilder();
//        builder.setProperty(ESClientBuilder.ADDRESS, "192.168.4.114:9300");
//        builder.setProperty(ESClientBuilder.FLUSH_INTERVAL, 5);
//        builder.setProperty(ESClientBuilder.CONCURRENT_REQUEST, 3);
//        builder.setProperty(ESClientBuilder.BULK_SIZE, 300);
//        builder.setProperty(ESClientBuilder.CLUSTER_NAME, "esV5");
//        builder.setProperty(ESClientBuilder.BULK_ACTIONS, 2);
//
//        ESClient clientBuilder = (ESClient) builder.build();
//        Client client = clientBuilder.getClient();

        String sql = "select MAX(age),name from file1 group by terms(name)";
//        String sql = "select age,name from file1 where age > 20";
//        String sql = "select * from emp where (deptno = 20 or deptno = 30) and sal >= 2000";
        ElasticSql2DslParser parser = new ElasticSql2DslParser();
        ElasticSqlParseResult sqlParseResult = parser.parse(sql);
        String dsl = sqlParseResult.toDsl();
        System.out.println("dsl: \n" + dsl);

    }
}
