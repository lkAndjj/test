package com.ty.mapper;

import com.ty.vo.Dealer;
import org.springframework.stereotype.Repository;

@Repository
public interface InsightIntoMapper {

    Dealer selectByName(String name);
}
