package com.eternitywall.ots.op;

/**
 * Cryptographic SHA256 operation.
 * Cryptographic operation tag numbers taken from RFC4880, although it's not
 * guaranteed that they'll continue to match that RFC in the future.
 *
 * @see OpCrypto
 */
public class OpSHA256 extends OpCrypto {

    public static final byte _TAG = 0x08;

    @Override
    public byte _TAG() {
        return OpSHA256._TAG;
    }

    @Override
    public String _TAG_NAME() {
        return "sha256";
    }

    @Override
    public String _HASHLIB_NAME() {
        return "SHA-256";
    }

    @Override
    public int _DIGEST_LENGTH() {
        return 32;
    }

    public OpSHA256() {
        super();
    }

    @Override
    public int hashCode() {
        return _TAG;
    }
}
