package cn.wwinter.mallsearch.config;

import jakarta.annotation.Nonnull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;

/**
 * @Description:
 * @Date: 2023/12/16
 * @Author: zhangdd
 */
@Configuration
public class ElasticSearchConfig extends ElasticsearchConfiguration {
    @Value("${elasticsearch.server.url}")
    private String url;
    @Value("${elasticsearch.server.username}")
    private String username;
    @Value("${elasticsearch.server.password}")
    private String password;
    @Value("${elasticsearch.server.crtType}")
    private String crtType;

    private final static String CRT_FILE_PATH = "/elasticsearch/http_ca.crt";

    @Override
    @Nonnull
    public ClientConfiguration clientConfiguration() {
        final ClientConfiguration clientConfiguration;
        try {
            clientConfiguration = ClientConfiguration.builder()
                    .connectedTo(url)
                    .usingSsl(getSSLContext())
                    .withBasicAuth(username, password)
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return clientConfiguration;
    }


    private SSLContext getSSLContext() throws Exception {
        Certificate ca;
        try (InputStream inputStream = this.getClass().getResourceAsStream(CRT_FILE_PATH)) {
            ca = CertificateFactory.getInstance(crtType).generateCertificate(inputStream);
        }

        // KeyStore
        String keyStoreType = KeyStore.getDefaultType();
        KeyStore keyStore = KeyStore.getInstance(keyStoreType);
        keyStore.load(null, null);
        keyStore.setCertificateEntry("ca", ca);

        // TrustManagerFactory
        String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
        tmf.init(keyStore);

        // SSLContext
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, tmf.getTrustManagers(), null);
        return context;
    }
}
