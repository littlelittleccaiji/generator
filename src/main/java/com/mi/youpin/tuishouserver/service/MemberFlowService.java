package com.mi.youpin.tuishouserver.service;

import com.mi.youpin.tuishouserver.entity.MemberFlow;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
public interface MemberFlowService {

    public Response insert(MemberFlow memberFlow);

    public Response update(MemberFlow memberFlow);

    public Response delete(Long id);

}
