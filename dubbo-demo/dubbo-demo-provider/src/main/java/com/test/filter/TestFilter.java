package com.test.filter;

import com.alibaba.dubbo.rpc.*;

/**
 * Author:yanzhang.fu
 * Date:2018/6/7
 * Description:
 * Modified By：
 **/
public class TestFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("hello ,this xxxx");
        String id = RpcContext.getContext().getAttachment("index");
        Result result = invoker.invoke(invocation);
        RpcContext.getContext().setAttachment("index", id);
        System.out.println("hello, this ddddddddd");
        return result;
    }
}
