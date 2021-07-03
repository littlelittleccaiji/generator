package com.greedystar.generator.utils;

import java.util.UUID;

/**
 * traceId 生成器
 */
public class TraceUtils {
    public static ThreadLocal ctx = new InheritableThreadLocal() {
        @Override
        protected TraceUtils initialValue() {
            return new TraceUtils();
        }
    };

    private String traceId;

    public String getTraceId() {
        if (traceId == null || "".equals(traceId)) {
            int hashCodeV = UUID.randomUUID().toString().hashCode();
            if (hashCodeV < 0) {
                hashCodeV = -hashCodeV;
            }
            // 0 代表前面补充0
            // 4 代表长度为4
            // d 代表参数为正数型
            traceId = String.format("%012d", hashCodeV);
        }
        return traceId;
    }

    public void clear() {
        traceId = null;
    }
}
