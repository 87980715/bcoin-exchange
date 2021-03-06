package com.sharingif.blockchain.crypto.mnemonic.service;

import com.sharingif.blockchain.crypto.api.mnemonic.entity.MnemonicGenerateReq;
import com.sharingif.blockchain.crypto.api.mnemonic.entity.MnemonicGenerateRsp;
import com.sharingif.blockchain.crypto.mnemonic.model.entity.Mnemonic;
import com.sharingif.cube.support.service.base.IBaseService;

/**
 * MnemonicService
 *
 * @author Joly
 * @version v1.0
 * @since v1.0
 * 2018/7/2 下午4:43
 */
public interface MnemonicService extends IBaseService<Mnemonic, String> {

    /**
     * 生成助记词
     * @param req
     * @return
     */
    MnemonicGenerateRsp generate(MnemonicGenerateReq req);

    /**
     * 根据助记词id、密码助记词信息
     * @param id
     * @return
     */
    Mnemonic getMnemonic(String id, String password);

}
