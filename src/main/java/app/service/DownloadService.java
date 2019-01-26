package app.service;

import app.entity.Transaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DownloadService
{
    @Value("${urlsForDownload}")
    private String urlsForDownload;

    private List<String> JSONs = new ArrayList<>();

    private OkHttpClient client = new OkHttpClient();

    private List<String> getListOfUrl()
    {
        return Arrays.asList(urlsForDownload.split(","));
    }

    public List<String> downloadJSONs()
    {
        getListOfUrl().forEach(this::downloadJSON);
        return JSONs;
    }

    private void downloadJSON(String url)
    {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute())
        {
            JSONs.add(response.body().string());
        }
        catch (IOException e)
        {
            System.out.println("Error downloading from url: " + url);
            e.printStackTrace();
        }
    }
}
