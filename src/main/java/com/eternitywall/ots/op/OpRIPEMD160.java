package com.eternitywall.ots.op;

import com.eternitywall.ots.crypto.RIPEMD160Digest;

/**
 * Cryptographic RIPEMD160 operation.
 * Cryptographic operation tag numbers taken from RFC4880, although it's not
 * guaranteed that they'll continue to match that RFC in the future.
 *
 * @see OpCrypto
 */
public class OpRIPEMD160 extends OpCrypto {

    public static final byte _TAG = 0x03;

    @Override
    public byte _TAG() {
        return OpRIPEMD160._TAG;
    }

    @Override
    public String _TAG_NAME() {
        return "ripemd160";
    }

    @Override
    public String _HASHLIB_NAME() {
        return "ripemd160";
    }

    @Override
    public int _DIGEST_LENGTH() {
        return 20;
    }

    public OpRIPEMD160() {
        super();
    }

    @Override
    public byte[] call(byte[] msg) {
        RIPEMD160Digest digest = new RIPEMD160Digest();
        digest.update(msg, 0, msg.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash, 0);

        return hash;
    }

    @Override
    public int hashCode() {
        return _TAG;
    }
}
