package com.sharingif.blockchain.ether.block.dao.impl;


import com.sharingif.blockchain.ether.app.dao.impl.BaseDAOImpl;
import com.sharingif.blockchain.ether.block.dao.BlockChainDAO;
import com.sharingif.blockchain.ether.block.model.entity.BlockChain;
import com.sharingif.cube.persistence.database.pagination.PaginationCondition;
import com.sharingif.cube.persistence.database.pagination.PaginationRepertory;
import org.springframework.stereotype.Repository;


@Repository
public class BlockChainDAOImpl extends BaseDAOImpl<BlockChain, String> implements BlockChainDAO {

    @Override
    public PaginationRepertory<BlockChain> queryPaginationListOrderByBlockNumberAsc(PaginationCondition<BlockChain> paginationCondition) {
        return queryPagination("queryPaginationListOrderByBlockNumberAsc", paginationCondition);
    }

    @Override
    public PaginationRepertory<BlockChain> queryPaginationListByBlockNumberStatus(PaginationCondition<BlockChain> paginationCondition) {
        return queryPagination("queryPaginationListByBlockNumberStatus", paginationCondition);
    }

}
