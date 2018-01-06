package com.yuanjun.spring;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * ���嶯̬����Դ��ʵ��ͨ������Spring�ṩ��AbstractRoutingDataSource��ֻ��Ҫʵ��determineCurrentLookupKey��������
 * 
 * ����DynamicDataSource�ǵ����ģ��̲߳���ȫ�ģ����Բ���ThreadLocal��֤�̰߳�ȫ����DynamicDataSourceHolder��ɡ�
 * 
 * @author zhijun
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {  
        // ʹ��DynamicDataSourceHolder��֤�̰߳�ȫ�����ҵõ���ǰ�߳��е�����Դkey  
        return DynamicDataSourceHolder.getDataSourceKey();  
    }  

}
