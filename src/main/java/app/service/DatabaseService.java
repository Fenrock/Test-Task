package app.service;

import app.entity.Document;
import app.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService
{
    @Autowired
    private DocumentRepository documentRepository;

    public void saveDocuments(List<Document> documentList)
    {
        documentRepository.saveAll(documentList);
    }

}
