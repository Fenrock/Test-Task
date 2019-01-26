package app.service;

import app.entity.Document;
import app.entity.Transaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParseService
{
    @Autowired
    private DownloadService downloadService;

    private List<Transaction> downloadedJSONs = new ArrayList<>();

    private ObjectMapper mapper = new ObjectMapper();

    public void parse()
    {
        downloadService.downloadJSONs().forEach(this::parse);
    }

    private void parse(String json)
    {
        try
        {
            downloadedJSONs.add(mapper.readValue(json,Transaction.class));
        }
        catch (IOException e)
        {
            System.out.println("Error parsing JSON");
            e.printStackTrace();
        }
    }

    public List<Document> getDownloadedJSONs()
    {
        List<Document> downloaded = new ArrayList<>();
        downloadedJSONs.forEach(transaction ->
        {
            downloaded.addAll(transaction.getData());
        });
        return downloaded;
    }
}
