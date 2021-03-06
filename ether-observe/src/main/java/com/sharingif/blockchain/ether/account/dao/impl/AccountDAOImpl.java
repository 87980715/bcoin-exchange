package com.sharingif.blockchain.ether.account.dao.impl;


import com.sharingif.blockchain.ether.account.dao.AccountDAO;
import com.sharingif.blockchain.ether.account.model.entity.Account;
import com.sharingif.blockchain.ether.app.dao.impl.BaseDAOImpl;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;


@Repository
public class AccountDAOImpl extends BaseDAOImpl<Account, String> implements AccountDAO {

    @Override
    public Account queryForUpdate(Account account) {
        return selectOne("queryForUpdate", account);
    }

    @Override
    public int updateAddTotalInBalanceByAddressCoinType(String address, String coinType, BigInteger balance) {
        Account account = new Account();
        account.setAddress(address);
        account.setCoinType(coinType);
        account.setTotalIn(balance);
        account.setBalance(balance);

        return update("updateAddTotalInBalanceByAddressCoinType", account);
    }

    @Override
    public int updateSubBalanceFrozenAmountByAddressCoinType(String address, String coinType, BigInteger balance) {
        Account account = new Account();
        account.setAddress(address);
        account.setCoinType(coinType);
        account.setTotalIn(balance);
        account.setBalance(balance);

        return update("updateSubBalanceFrozenAmountByAddressCoinType", account);
    }

    @Override
    public int updateAddBalanceFrozenAmountByAddressCoinType(String address, String coinType, BigInteger balance) {
        Account account = new Account();
        account.setAddress(address);
        account.setCoinType(coinType);
        account.setTotalIn(balance);
        account.setBalance(balance);

        return update("updateAddBalanceFrozenAmountByAddressCoinType", account);
    }

    @Override
    public int updateSubFrozenAmountTotalOutByAddressCoinType(String address, String coinType, BigInteger frozenAmount) {
        Account account = new Account();
        account.setAddress(address);
        account.setCoinType(coinType);
        account.setTotalIn(frozenAmount);
        account.setFrozenAmount(frozenAmount);

        return update("updateSubFrozenAmountTotalOutByAddressCoinType", account);
    }
}
