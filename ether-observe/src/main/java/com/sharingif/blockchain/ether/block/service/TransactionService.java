package com.sharingif.blockchain.ether.block.service;


import com.sharingif.blockchain.ether.block.model.entity.Transaction;
import com.sharingif.blockchain.ether.deposit.service.DepositService;
import com.sharingif.blockchain.ether.withdrawal.service.WithdrawalService;
import com.sharingif.cube.support.service.base.IBaseService;

import java.math.BigInteger;
import java.util.Date;


public interface TransactionService extends IBaseService<Transaction, java.lang.String> {

    /**
     * 获取充值服务
     * @return
     */
    DepositService getDepositService();

    /**
     * 获取取现服务
     * @return
     */
    WithdrawalService getWithdrawalService();

    /**
     * 区块同步
     * @param blockNumber
     * @param hash
     * @param blockCreateTime
     */
    void syncData(BigInteger blockNumber, String hash, Date blockCreateTime);

    /**
     * 修改指定区块的交易为有效
     * @param blockNumber
     * @param blockHash
     * @param confirmBlockNumber
     */
    int updateStatusToBlockConfirmedValid(BigInteger blockNumber, String blockHash, int confirmBlockNumber);

    /**
     * 修改指定区块的交易为无效
     * @param blockNumber
     * @param blockHash
     * @param confirmBlockNumber
     */
    int updateStatusToBlockConfirmedInvalid(BigInteger blockNumber, String blockHash, int confirmBlockNumber);

}