package com.yuanjun.spring;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
  
/** 
 * ��������Դ��AOP���棬ͨ����Service�ķ������ж���Ӧ���߶��⻹��д�� 
 *  
 * @author zhijun 
 * 
 */  
public class DataSourceAspect {  
  
	  /** 
     * �ڽ���Service����֮ǰִ�� 
     *  
     * @param point ������� 
     */  
    public void before(JoinPoint point) {  
        // ��ȡ����ǰִ�еķ�����  
        String methodName = point.getSignature().getName();  
        if (isSlave(methodName)) {  
            // ���Ϊ����  
            DynamicDataSourceHolder.markSlave();  
        } else {  
            // ���Ϊд��  
            DynamicDataSourceHolder.markMaster();  
        }  
    }  
  
    /** 
     * �ж��Ƿ�Ϊ���� 
     *  
     * @param methodName 
     * @return 
     */  
    private Boolean isSlave(String methodName) {  
        // ��������query��find��get��ͷ�ķ������ߴӿ�  
        return StringUtils.startsWithAny(methodName, "query", "find", "get");  
    }  
  
  
}  
