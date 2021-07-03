package com.mi.youpin.tuishouserver.service;

import com.mi.youpin.tuishouserver.entity.MemberRelation;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
public interface MemberRelationService {

    public Response insert(MemberRelation memberRelation);

    public Response update(MemberRelation memberRelation);

    public Response delete(Long id);

}
