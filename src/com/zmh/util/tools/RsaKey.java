package com.zmh.util.tools;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

import java.io.IOException;
import java.io.StringWriter;
import java.security.*;
import java.util.HashMap;
import java.util.Map;

/**
 * make rsa key
 *
 * @author zengminghua
 * @date 2018-02-13 15:35
 */
public class RsaKey {

    /**
     * @return key map
     */
    public static Map<String, String> generateKey(String algorithm, int keySize) {

        Map<String, String> map = new HashMap<String, String>(8);
        try {
            String defaultAlgorithm = "RSA";
            if (StringUtils.isNotBlank(algorithm)) {
                defaultAlgorithm = algorithm;
            }
            int defaultKeySize = 2048;
            if (keySize > 0) {
                defaultKeySize = keySize;
            }

            KeyPairGenerator keygen = KeyPairGenerator.getInstance(defaultAlgorithm);
            keygen.initialize(defaultKeySize);
            KeyPair kp = keygen.genKeyPair();
            PrivateKey privKey = kp.getPrivate();
            String privPkcs8 = Base64.encodeBase64String(privKey.getEncoded());
            String privPkcs1 = "";
            PrivateKeyInfo pkInfo = PrivateKeyInfo.getInstance(privKey.getEncoded());
            ASN1Encodable encodable = null;
            try {
                encodable = pkInfo.parsePrivateKey();
                ASN1Primitive primitive = encodable.toASN1Primitive();
                byte[] privateKeyPKCS1 = primitive.getEncoded();

                PemObject pemObject = new PemObject("RSA PRIVATE KEY", privateKeyPKCS1);
                StringWriter stringWriter = new StringWriter();
                PemWriter pemWriter = new PemWriter(stringWriter);
                pemWriter.writeObject(pemObject);
                pemWriter.close();
                privPkcs1 = stringWriter.toString();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            PublicKey pubKey = kp.getPublic();
            String pub = org.apache.commons.codec.binary.Base64.encodeBase64String(pubKey.getEncoded());
            map.put("privPkcs8", privPkcs8);
            map.put("privPkcs1", privPkcs1);
            map.put("pub", pub);

            System.out.println(pub);
            System.out.println(privPkcs8);
            System.out.println(privPkcs1);

            return map;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
