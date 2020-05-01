package org.lamemind.comunijson;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.lamemind.comunijson.bean.CityBean;

/**
 * @author lamemind
 */
public class ComuniJsonImport {

    private static final String URL = "https://raw.githubusercontent.com/matteocontrini/comuni-json/master/comuni.json";
    private final ObjectMapper json;

    public ComuniJsonImport() {
        json = new ObjectMapper();
    }

    public List<CityBean> run() throws IOException {
        String content = makeGetRequest();
        List<CityBean> cities = json.readValue(content, new TypeReference<List<CityBean>>() {
        });
        return cities;
    }

    private String makeGetRequest() throws IOException {
        long start = System.currentTimeMillis();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet get = new HttpGet(URL);
        try (CloseableHttpResponse response = httpclient.execute(get)) {
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (statusCode != 200) {
                throw new IOException("StatusCode=" + statusCode + " URL=" + URL);
            }
            HttpEntity entity = response.getEntity();

            try (InputStream content = entity.getContent()) {
                String res = IOUtils.toString(content, StandardCharsets.UTF_8);
                return res;
            }
        } finally {
            Logger.getGlobal().info("Request in " + (System.currentTimeMillis() - start) + "ms -> " + URL);
        }
    }

    public static void main(String... args) throws IOException {
        List<CityBean> cities = new ComuniJsonImport().run();
        for (int i = 0; i < 10; i++) {
            System.out.println(cities.get(i));
        }
    }
}
